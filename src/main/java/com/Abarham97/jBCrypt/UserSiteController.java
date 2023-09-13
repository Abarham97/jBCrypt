package com.Abarham97.jBCrypt;
import org.mindrot.jbcrypt.BCrypt;
import com.Abarham97.jBCrypt.Repositary.UserReposatry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserSiteController {

    @Autowired
    UserReposatry UserReposatry;


    @GetMapping("/login")
    public String getLoginPage(){
        return "/login.html";
    }

    @GetMapping("/singup")
    public String getSignupPage(){
        return "/singup.html";
    }


    @PostMapping("/singup")
    public RedirectView signUPuser(String username,String passwrod)
    {
            String hashpassword=BCrypt.hashpw(passwrod,BCrypt.gensalt(12));
            UserSite userSite= new UserSite(username,hashpassword);

        UserReposatry.save(userSite);

        return new RedirectView("login");
     
    }

    @PostMapping("/login")
    public RedirectView loginuser(String username,String passwrod)
    {
        UserSite DBuser= UserReposatry.findByUserName(username);

        if((DBuser==null)|| (!BCrypt.checkpw(passwrod,DBuser.getPassword())))
        {
                return new RedirectView("login");
        }
        return new RedirectView("App");
    }




}
