package com.Abarham97.jBCrypt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String textcontent;

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
}
