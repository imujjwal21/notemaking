package com.User;

import java.util.Date;

public class Post {
    private int id;
    private String title;
    private String   content;
    private Date pdate;
    private int userid;

    public Post() {
    }

    public Post(int id, String title, String content, Date pdate, int userid) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pdate = pdate;
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    
    
    
    
    
}
