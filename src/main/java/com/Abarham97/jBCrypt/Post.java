package com.Abarham97.jBCrypt;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String textcontent;
    @ManyToOne
    @JoinColumn(name = "user_site_id")
    private UserSite userSite;

    public Post(long id, String textcontent) {
        this.id = id;
        this.textcontent = textcontent;
    }

    public Post() {
    }

    public String getTextcontent() {
        return textcontent;
    }

    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent;
    }
    public UserSite getUserSite() {
        return userSite;
    }
    public void setUserSite(UserSite userSite) {
        this.userSite = userSite;
    }
}
