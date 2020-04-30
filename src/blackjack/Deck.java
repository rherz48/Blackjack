/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author ryanh
 */
public class Deck {
    //instance variables

    private ArrayList<Card> cards;

    private String[] cardsBeingUsed; // do something
    private String[] discardPile; // do something

    //private ArrayList<Card> playerCards; // FIX AND DO STUFF
    //constructor
    public Deck() {
        this.cards = new ArrayList<Card>();
        //this.playerCards = new ArrayList<Card>();   // FIX AND DO STUFF
    }

    public void createFullDeck() {
        //Generate Cards
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                //Add a new card 
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }

    }

    public void shuffleDeck() {
        Collections.shuffle(cards); //Shuffles arraylist cards
    }

    public void removeCard() {
        //cards.get(0);
        // playerCards.add(cards.get(0));
        
        
        //WORKING WITH THIS
        
        
        ////
        //all null atm... fix and do something
//        Integer[] arr = new Integer[cards.size()]; 
//        cards.toArray(new Card[cards.size()]); // added 
        
//        for (Integer abc : arr) {
//            System.out.println(Arrays.toString(arr));
//        }

//        String[] strArr = new String[cards.size()];
//        cards.toArray(strArr);
//        System.out.println("Created Array content:");
//        for(String str:strArr){
//            System.out.println(str);
//        }

        ArrayList<Card> tmpDeck = new ArrayList<Card>();

        
        List<String> strings = tmpDeck.stream()
        //List<String> strings = cards.stream()
        .map(object -> Objects.toString(object, null))
        .collect(Collectors.toList());
        
        System.out.println(cards); //
        
        //cards.remove(0);
        
//        randomCardIndex = cards[0];
//        
//        for(Card str : tmpDeck) {
//            tmpDeck.add(this.cards.get(randomCardIndex));
//            
//        }
//        this.cards = tmpDeck;
//        //Use Random
//        Random random = new Random();
//        int randomCardIndex = 0;
//        int originalSize = this.cards.size();
//        for (int i = 0; i < originalSize; i++) {
//            //Generate Random Index rand.nextInt((max - min)) + 1) + min;
//            randomCardIndex = random.nextInt((this.cards.size() - 1 - 0) + 1) + 0;
//            tmpDeck.add(this.cards.get(randomCardIndex));
//            //Remove from original deck
//            this.cards.remove(randomCardIndex);
//        }
//        this.cards = tmpDeck;

    

        //////
        
        //cards.remove(0); /// Removes cards 0 from the arraylist

    }

    public void playerCards() {

    }

    public String toString() {
        String cardListOutput = "";

        int i = 0;

        for (Card aCard : this.cards) {
            //Collections.shuffle(cards); //testing
            cardListOutput += "\n" + i++ + aCard.toString(); //remove i++ when done testing
        }
        return cardListOutput;

    }
}
