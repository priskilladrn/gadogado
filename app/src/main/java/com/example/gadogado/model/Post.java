package com.example.gadogado.model;

public class Post {
    private Integer postId;
    private String image;
    private String desc;
    private Integer like;
    private String postDate;

    public Post(Integer postId, String image, String desc, Integer like, String postDate) {
        this.postId = postId;
        this.image = image;
        this.desc = desc;
        this.like = like;
        this.postDate = postDate;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}