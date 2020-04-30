/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ryanh
 */
public class DeckOfCards {
    // add what a deck of cards should do
    public DeckOfCards() {
        System.out.println("test");
        
        
        // start of code for creating a deck of cards
        
        
        
        
        
        
        // does not let me run, using testing document instead
        
        
        ////added code
        Suit hearts = Suit.HEARTS;
        Suit clubs = Suit.CLUBS;
        Suit diamonds = Suit.DIAMONDS;
        Suit spades = Suit.SPADES;

        //changed code (enum suits) //added new String[] at the second part
        String[] cardList = new String[]{hearts + "A", clubs + "A", diamonds + "A", spades + "A",
            hearts + "2", clubs + "2", diamonds + "2", spades + "2",
            hearts + "3", clubs + "3", diamonds + "3", spades + "3",
            hearts + "4", clubs + "4", diamonds + "4", spades + "4",
            hearts + "5", clubs + "5", diamonds + "5", spades + "5",
            hearts + "6", clubs + "6", diamonds + "6", spades + "6",
            hearts + "7", clubs + "7", diamonds + "7", spades + "7",
            hearts + "8", clubs + "8", diamonds + "8", spades + "8",
            hearts + "9", clubs + "9", diamonds + "9", spades + "9",
            hearts + "10", clubs + "10", diamonds + "10", spades + "10",
            hearts + "J", clubs + "J", diamonds + "J", spades + "J",
            hearts + "Q", clubs + "Q", diamonds + "Q", spades + "Q",
            hearts + "K", clubs + "K", diamonds + "K", spades + "K"};

        
        // Shuffle the elements in the array
        List<String> l = Arrays.asList(cardList);
        System.out.println(l);

        Collections.shuffle(l);

        System.out.println(l); //print all of the elements in the array
        
        String PlayerCard1=cardList[0];
        String PlayerCard2=cardList[1];
        
        String DealerCard1=cardList[2];
        String DealerCard2=cardList[3];
        
        System.out.print("\nPlayer cards: "+ (PlayerCard1) + "\t" + (PlayerCard2));
        System.out.print("\nPlayer cards: "+ (DealerCard1) + "\t" + (DealerCard2));
        
        

    }
    
}
