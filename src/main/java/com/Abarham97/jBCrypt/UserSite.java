package com.Abarham97.jBCrypt;

import javax.persistence.*;


@Entity
public class UserSite {


    @Id
    @GeneratedValue
private long id;

    private String userName;

    private String password;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private Post post;

    public UserSite(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    public UserSite() {

    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


