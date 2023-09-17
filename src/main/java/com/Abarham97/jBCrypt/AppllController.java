package com.Abarham97.jBCrypt;

import com.Abarham97.jBCrypt.Repositary.PostReposatry;
import com.Abarham97.jBCrypt.Repositary.UserReposatry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppllController {

    @Autowired
     PostReposatry PostReposatry;
    @Autowired
    UserReposatry UserReposatry;
//    @GetMapping ("/App")
//        public String AppHome()
//        {
//
//            return "/APP";
//        }

    @GetMapping("/App")
    public String AppPost(Model model)
    {
        List<Post> posts = PostReposatry.findAll();
        model.addAttribute("posts",posts);

        return "/App";

    }

        @PostMapping("/createpost")
    public String createPost(@RequestParam("textcontent") String textContent)
        {
            Post newpost=new Post();

            newpost.setTextcontent(textContent);
            PostReposatry.save(newpost);

            return"redirect:/App";


        }


}
