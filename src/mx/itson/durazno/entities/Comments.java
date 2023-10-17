/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.durazno.entities;


/**
 *
 * @author aldop
 */
public class Comments {
    
    private String user;
    private String date;
    private String comment;
    private int reactionsPos;
    private int reactionsNeg;

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
    
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
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
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
