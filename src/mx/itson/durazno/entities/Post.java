/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.durazno.entities;

import java.util.List;

/**
 *
 * @author aldop
 */
public class Post {
    
    private List<User> user;
    private List<Comments> comments;
    private List<Category> category;
    private String titlePost;
    private String description;
    private String date;
    private String picture;
    private int reactionsPos;
    private int reactionsNeg;

    /**
     * @return the user
     */
    public List<User> getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(List<User> user) {
        this.user = user;
    }

    /**
     * @return the comments
     */
    public List<Comments> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    /**
     * @return the category
     */
    public List<Category> getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(List<Category> category) {
        this.category = category;
    }

    /**
     * @return the titlePost
     */
    public String getTitlePost() {
        return titlePost;
    }

    /**
     * @param titlePost the titlePost to set
     */
    public void setTitlePost(String titlePost) {
        this.titlePost = titlePost;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return the reactionsPos
     */
    public int getReactionsPos() {
        return reactionsPos;
    }

    /**
     * @param reactionsPos the reactionsPos to set
     */
    public void setReactionsPos(int reactionsPos) {
        this.reactionsPos = reactionsPos;
    }

    /**
     * @return the reactionsNeg
     */
    public int getReactionsNeg() {
        return reactionsNeg;
    }

    /**
     * @param reactionsNeg the reactionsNeg to set
     */
    public void setReactionsNeg(int reactionsNeg) {
        this.reactionsNeg = reactionsNeg;
    }
    
    
    
    
}
