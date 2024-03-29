package com.example.gadogado.model;

public class Post {
    private String postId;
    private String profilePic;
    private String username;
    private String image;
    private String desc;
    private Integer like;
    private String postDate;

    public Post(){

    }

    public Post(String postId, String image, String desc, Integer like, String postDate) {
        this.postId = postId;
        this.image = image;
        this.desc = desc;
        this.like = like;
        this.postDate = postDate;
    }

    public Post(String profilePic, String username, String postId, String image, String desc, Integer like, String postDate) {
        this.profilePic = profilePic;
        this.username = username;
        this.postId = postId;
        this.image = image;
        this.desc = desc;
        this.like = like;
        this.postDate = postDate;
    }

    public Post(String username, String postId, String image, String desc, Integer like, String postDate) {
        this.username = username;
        this.postId = postId;
        this.image = image;
        this.desc = desc;
        this.like = like;
        this.postDate = postDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
