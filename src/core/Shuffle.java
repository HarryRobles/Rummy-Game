/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import userInterface.PlayerUI;

public class Shuffle {
    
    private ArrayList<Cards> cards = new ArrayList<Cards>();
    private PlayerUI rollUI;

    public ArrayList<Cards> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Cards> cards) {
        this.cards = cards;
    }
    
    //Override the no argument constructor Shuffle

    /**
     *
     */
        public Shuffle(){
        
        initializeCard();
    }

    /**
     *
     */
        public void initializeCard(){
        
        //Loop through five times
        for(int i=0; i< 10; i++){
            
            //Instantiate an instance of class Cards
            Cards card = new Cards();
            
            //Add the instance of Cards to member variable card
            cards.add(card);
            
        }      
   
    }
    
        public void shuffleCards(){
        
        int counter = 0;
        
        //Loop through member variable cards
        for (Cards card : cards){
            
            counter ++;
            card.shuffleCards();
            
            System.out.print("Card drawn is ");
            System.out.println(card.toString());
            
        }
        
    }
    
}
