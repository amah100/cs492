/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goodday
 */
public class Card {
    
    private String faceValue;
    private String suit;
    
    public Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit; 
        
    }
    
    //Getters
    //faceValue Getter
    public String getFaceValue() {
        return faceValue;
    }
    //suit Getter
    public String getSuit(){
        return suit;
    }
    
    
    //Setters
    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
        
    }
        
    
    //toString
     public String toString() {
        String s = "";
        s += suit + "" + faceValue;
        
        return s;
    }
    
    
}
    

