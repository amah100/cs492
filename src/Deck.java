/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goodday
 */
import java.util.*;
public class Deck {
    
     private ArrayList<Card> deck = new ArrayList<Card>(52);
    
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        for(int i = 0; i < suits.length; i++) {
            deck.add(new Card("Ace", suits[i]));
            for(int j = 2; j <= 10; j++) {
                deck.add(new Card(Integer.toString(j), suits[i]));
            }
                        deck.add(new Card("Jack", suits[i]));
            deck.add(new Card("Queen", suits[i]));
            deck.add(new Card("King", suits[i]));
        }
        }
    
    //Method to printAllCard
    public void printAllCards() {
        //Print out the cards
        for (Card card : deck) {
            System.out.println(card);
        }
    }
    
    }
    
    

