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

    ArrayList<Card> tmpDeck = new ArrayList<Card>(); /////// this was added from below

    ArrayList<Card> tmpPlayerDeck = new ArrayList<Card>();
    ArrayList<Card> tmpDealerDeck = new ArrayList<Card>();

    // Use to keep track of the values in the decks****
    int valueCount = 0; //all cards in deck
    int aceCounter = 0; //count aces for all cards in deck
    int testingNumErrors = 0; //check if errors for all cards in deck

    //Player values
    int valueCountPlayer = 0;
    int aceCounterPlayer = 0;
    int testingNumErrorsPlayer = 0;

    //Dealer values (Add later) //////////
    int valueCountDealer = 0;
    int aceCounterDealer = 0;
    int testingNumErrorsDealer = 0;

    ///////
    ///
    String playerCards[];
    String dealerCards[];
    ///

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

//    public void removeCard() {
//        //cards.get(0);
//        // playerCards.add(cards.get(0));
//
//        //WORKING WITH THIS
//        ////
//        //all null atm... fix and do something
////        Integer[] arr = new Integer[cards.size()]; 
////        cards.toArray(new Card[cards.size()]); // added 
////        for (Integer abc : arr) {
////            System.out.println(Arrays.toString(arr));
////        }
////        String[] strArr = new String[cards.size()];
////        cards.toArray(strArr);
////        System.out.println("Created Array content:");
////        for(String str:strArr){
////            System.out.println(str);
////        }
//        //
//        //here
//        //ArrayList<Card> tmpDeck = new ArrayList<Card>();
//        List<String> strings = tmpDeck.stream()
//                //List<String> strings = cards.stream()
//                .map(object -> Objects.toString(object, null))
//                .collect(Collectors.toList());
//
//        System.out.println(cards); //
//
//        //cards.remove(0);
//        //
////        randomCardIndex = cards[0];
////        
////        for(Card str : tmpDeck) {
////            tmpDeck.add(this.cards.get(randomCardIndex));
////            
////        }
////        this.cards = tmpDeck;
////        //Use Random
////        Random random = new Random();
////        int randomCardIndex = 0;
////        int originalSize = this.cards.size();
////        for (int i = 0; i < originalSize; i++) {
////            //Generate Random Index rand.nextInt((max - min)) + 1) + min;
////            randomCardIndex = random.nextInt((this.cards.size() - 1 - 0) + 1) + 0;
////            tmpDeck.add(this.cards.get(randomCardIndex));
////            //Remove from original deck
////            this.cards.remove(randomCardIndex);
////        }
////        this.cards = tmpDeck;
//        //////
//        //cards.remove(0); /// Removes cards 0 from the arraylist
//    }

    //change cards to list?
    public List<String> newDeck() {
        List<String> strings = cards.stream()
                //List<String> strings = cards.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        //System.out.println(cards); //
        return strings;

    }

    public void removeACard() {
        cards.remove(0);
    }

    public void playerCards() {
        //playerCards = append(playerCards, "4");
        //playerCards = ArrayUtils.add( playerCards, 0);
        //System.arraycopy(cards, cards.get(0), playerCards, 0);
        tmpDeck.add(this.cards.get(0));
        tmpPlayerDeck.add(this.cards.get(0));
        cards.remove(0);
        //cards.get(0);

    }

    public void dealerCards() {
        tmpDeck.add(this.cards.get(0));
        tmpDealerDeck.add(this.cards.get(0));
        cards.remove(0);
    }

    public void clearAllDecks() {
        cards.removeAll(cards);
        tmpDeck.removeAll(tmpDeck);
        tmpPlayerDeck.removeAll(tmpPlayerDeck);
        tmpDealerDeck.removeAll(tmpDealerDeck);

//        cards.clear();
//        tmpDeck.clear();
//        tmpPlayerDeck.clear();
//        tmpDealerDeck.clear();
    }

    public void printDecks() {

        //Prints the cards in each of the decks
        //Cards
        System.out.println("cards: " + cards.toString());

        //Temp Deck
        System.out.println("tmpDeck: " + tmpDeck.toString());

        //Temp Player Deck
        System.out.println("tmpPlayerDeck: " + tmpPlayerDeck.toString());

        //Temp Dealer Deck
        System.out.println("tmpDealerDeck: " + tmpDealerDeck.toString());
    }

    public void moveCardsBackToDeck() {
        //Fix the location of where this will work. Change it so if this is not in this position it will still work
        //arraylist.removeAll(arraylist);

        //Clears all of the Arrays
//        cards.removeAll(cards);
//        tmpDeck.removeAll(tmpDeck);
//        tmpPlayerDeck.removeAll(tmpPlayerDeck);
//        tmpDealerDeck.removeAll(tmpDealerDeck);
//        cards.clear();
//        tmpDeck.clear();
//        tmpPlayerDeck.clear();
//        tmpDealerDeck.clear();
        clearAllDecks();
        //Prints the values of all of the arrays (nothing since it is cleared, just shows it has been)

        System.out.println("Cleared: ");

//        System.out.println("cards: " + cards.toString());
//        System.out.println("tmpDeck: " + tmpDeck.toString());
//        System.out.println("tmpPlayerDeck: " + tmpPlayerDeck.toString());
//        System.out.println("tmpDealerDeck: " +tmpDealerDeck.toString());
        printDecks();

        System.out.println("");

        //currently is starting at 1 it seems like instead of 0 after removing
        //all of the elements in the arrays.. find out why
        // What happened: cards.size(); is getting what it goes up until. It is 
        // going up to 51 and stops at 52.. should work fine still
        //Fixed ^^
        createFullDeck();
        //System.out.println(cards);
        shuffleDeck();
        newDeck();

        System.out.println("New cards in deck shuffled: " + cards.toString());

        System.out.println("Cards left in Deck: " + cards.size());
        //System.out.println("Card[0]: " + cards.get(0)); // gets first card in deck and prints it

        //System.out.println("cards: " + cards.size());
        System.out.println("tmpDeck: " + tmpDeck.toString());
        System.out.println("tmpPlayerDeck: " + tmpPlayerDeck.toString());
        System.out.println("tmpDealerDeck: " + tmpDealerDeck.toString());

    }

    //Testing here and below for card values 
    public List<String> checkVal() {
//        int n = this.cards.size();
//        for (int i = 0; i < n; i++) {
//            if (this.cards.toString() == x) {

        /**
         * Check tomorrow if this works and add the cardValue = 0; at the top
         * this will allow it to be better used and change each time also add
         * all of the other values to check from for the check add each suit for
         * the equals // beside it for each one just copy and paste it so it
         * checks each suit for the 4 of them
         */
//
//        int cardValue = 0;
//
//        int n = this.cards.size();
//        for (int i = 0; i < n; i++) {
//            if( n[i].equals("")) {
//                
//            }
//            if (this.cards.toString().equals(Suit.CLUBS + "-ACE")) {
//                cardValue += 1;
//                System.out.println(cardValue); // print value
//
//            }
//        }
        ///
        //int valueCount = 0; added at the top
        List<String> strings = cards.stream()
                //List<String> strings = cards.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        int z = 0;

        for (int i = 0; i < this.cards.size(); i++) {

            if (strings.get(i).equals("CLUBS-ACE")
                    || strings.get(i).equals("DIAMONDS-ACE")
                    || strings.get(i).equals("HEARTS-ACE")
                    || strings.get(i).equals("SPADES-ACE")) {

                //add more logic for Ace (determine if it should be 1 or 11)
                //Also add a check if value is greater than 21 or not (if it should continue)
                //int ac = 0;
                aceCounter += 1;
                //valueCount += 1; //works off of aceCounter now to determine value
                //System.out.println("Working");
                System.out.println("ACE " + "Position found: " + i);
//                ac++;
//                System.out.println(ac);
                //break;
//            }else if (strings.get(i).equals("HEARTS-TWO") || strings.get(i).equals("CLUBS-TWO")){
//                valueCount+=2;

///////////////////////////////
// fix not always working (sometimes gives different values???)
/////////////////////////////////////////////
            } else if (strings.get(i).equals("CLUBS-TWO")
                    || strings.get(i).equals("DIAMONDS-TWO")
                    || strings.get(i).equals("HEARTS-TWO")
                    || strings.get(i).equals("SPADES-TWO")) {

                valueCount += 2;

                System.out.println("TWO " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-THREE")
                    || strings.get(i).equals("DIAMONDS-THREE")
                    || strings.get(i).equals("HEARTS-THREE")
                    || strings.get(i).equals("SPADES-THREE")) {

                valueCount += 3;
                System.out.println("THREE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-FOUR")
                    || strings.get(i).equals("DIAMONDS-FOUR")
                    || strings.get(i).equals("HEARTS-FOUR")
                    || strings.get(i).equals("SPADES-FOUR")) {

                valueCount += 4;
                System.out.println("FOUR " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-FIVE")
                    || strings.get(i).equals("DIAMONDS-FIVE")
                    || strings.get(i).equals("HEARTS-FIVE")
                    || strings.get(i).equals("SPADES-FIVE")) {

                valueCount += 5;
                System.out.println("FIVE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-SIX")
                    || strings.get(i).equals("DIAMONDS-SIX")
                    || strings.get(i).equals("HEARTS-SIX")
                    || strings.get(i).equals("SPADES-SIX")) {

                valueCount += 6;
                System.out.println("SIX " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-SEVEN")
                    || strings.get(i).equals("DIAMONDS-SEVEN")
                    || strings.get(i).equals("HEARTS-SEVEN")
                    || strings.get(i).equals("SPADES-SEVEN")) {

                valueCount += 7;
                System.out.println("SEVEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-EIGHT")
                    || strings.get(i).equals("DIAMONDS-EIGHT")
                    || strings.get(i).equals("HEARTS-EIGHT")
                    || strings.get(i).equals("SPADES-EIGHT")) {

                valueCount += 8;
                System.out.println("EIGHT " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-NINE")
                    || strings.get(i).equals("DIAMONDS-NINE")
                    || strings.get(i).equals("HEARTS-NINE")
                    || strings.get(i).equals("SPADES-NINE")) {

                valueCount += 9;
                System.out.println("NINE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-TEN")
                    || strings.get(i).equals("DIAMONDS-TEN")
                    || strings.get(i).equals("HEARTS-TEN")
                    || strings.get(i).equals("SPADES-TEN")) {

                valueCount += 10;
                System.out.println("TEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-JACK")
                    || strings.get(i).equals("DIAMONDS-JACK")
                    || strings.get(i).equals("HEARTS-JACK")
                    || strings.get(i).equals("SPADES-JACK")) {

                valueCount += 10;
                System.out.println("JACK " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-QUEEN")
                    || strings.get(i).equals("DIAMONDS-QUEEN")
                    || strings.get(i).equals("HEARTS-QUEEN")
                    || strings.get(i).equals("SPADES-QUEEN")) {

                valueCount += 10;
                System.out.println("QUEEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-KING")
                    || strings.get(i).equals("DIAMONDS-KING")
                    || strings.get(i).equals("HEARTS-KING")
                    || strings.get(i).equals("SPADES-KING")) {

                valueCount += 10;
                System.out.println("KING " + "Position found: " + i);

            } else {
                testingNumErrors += 1; // if something does not work add 1

                //System.out.println("Working"); // prints until it finds the element it is looking for + the 1 working from above if it works
            }

            System.out.println(cards.get(i));
            ++z; //Increments Card index number
            System.out.println(z); // Current Card index number

        }

        //System.out.println(cards.get(51)); // works?
        System.out.println("Before adding value count: " + valueCount); // prints the total value before adding aces

        for (int i = 0; i < aceCounter; i++) {

            if (valueCount > 10) {
                valueCount += 1;
            } else {
                valueCount += 11;
            }
            System.out.println("Ace value Adding: " + valueCount); // prints what each ace value is 
        }

        System.out.println("");

        System.out.println("Error count:" + testingNumErrors); // if there is an error, print a number > 0

        System.out.println("ACE Count: " + aceCounter);

        System.out.println(cards.size()); // Total cards in the array cards

        //System.out.println(cards.get(50)); 
        //System.out.print(cards.get(i) + " ");  
        //System.out.println(cards); //
        return strings;

        //List<Integer> numbers = Arrays.asList(cards); 
        // For Loop for iterating ArrayList 
//        for (int i = 0; i < numbers.size(); i++)  
//            System.out.print(numbers.get(i) + " ");  
        //Testing above also**
        //CHANGE AND MAKE WORK WITH EXISTING CODE
        //    public ArrayList<Card> search(List<Card> cards, String x) {
        //public List<Card> search(List<> cards, String x) {
//    public List search() {
//        int n = this.cards.size();
//        for (int i = 0; i < n; i++) {
//            if (this.cards.toString() == x) {
//                return i;
//            }
//        }
//        return -1;
    }

    public List<String> checkValtmpPlayerDeck() {
//int valueCount = 0; added at the top
        List<String> strings = tmpPlayerDeck.stream()
                //List<String> strings = cards.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        //System.out.println("STARTS HERE //////////////////////////////");

        int z = 0;

        for (int i = 0; i < this.tmpPlayerDeck.size(); i++) {

            if (strings.get(i).equals("CLUBS-ACE")
                    || strings.get(i).equals("DIAMONDS-ACE")
                    || strings.get(i).equals("HEARTS-ACE")
                    || strings.get(i).equals("SPADES-ACE")) {

                aceCounterPlayer += 1;

                System.out.println("ACE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-TWO")
                    || strings.get(i).equals("DIAMONDS-TWO")
                    || strings.get(i).equals("HEARTS-TWO")
                    || strings.get(i).equals("SPADES-TWO")) {

                valueCountPlayer += 2;

                System.out.println("TWO " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-THREE")
                    || strings.get(i).equals("DIAMONDS-THREE")
                    || strings.get(i).equals("HEARTS-THREE")
                    || strings.get(i).equals("SPADES-THREE")) {

                valueCountPlayer += 3;
                System.out.println("THREE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-FOUR")
                    || strings.get(i).equals("DIAMONDS-FOUR")
                    || strings.get(i).equals("HEARTS-FOUR")
                    || strings.get(i).equals("SPADES-FOUR")) {

                valueCountPlayer += 4;
                System.out.println("FOUR " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-FIVE")
                    || strings.get(i).equals("DIAMONDS-FIVE")
                    || strings.get(i).equals("HEARTS-FIVE")
                    || strings.get(i).equals("SPADES-FIVE")) {

                valueCountPlayer += 5;
                System.out.println("FIVE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-SIX")
                    || strings.get(i).equals("DIAMONDS-SIX")
                    || strings.get(i).equals("HEARTS-SIX")
                    || strings.get(i).equals("SPADES-SIX")) {

                valueCountPlayer += 6;
                System.out.println("SIX " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-SEVEN")
                    || strings.get(i).equals("DIAMONDS-SEVEN")
                    || strings.get(i).equals("HEARTS-SEVEN")
                    || strings.get(i).equals("SPADES-SEVEN")) {

                valueCountPlayer += 7;
                System.out.println("SEVEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-EIGHT")
                    || strings.get(i).equals("DIAMONDS-EIGHT")
                    || strings.get(i).equals("HEARTS-EIGHT")
                    || strings.get(i).equals("SPADES-EIGHT")) {

                valueCountPlayer += 8;
                System.out.println("EIGHT " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-NINE")
                    || strings.get(i).equals("DIAMONDS-NINE")
                    || strings.get(i).equals("HEARTS-NINE")
                    || strings.get(i).equals("SPADES-NINE")) {

                valueCountPlayer += 9;
                System.out.println("NINE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-TEN")
                    || strings.get(i).equals("DIAMONDS-TEN")
                    || strings.get(i).equals("HEARTS-TEN")
                    || strings.get(i).equals("SPADES-TEN")) {

                valueCountPlayer += 10;
                System.out.println("TEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-JACK")
                    || strings.get(i).equals("DIAMONDS-JACK")
                    || strings.get(i).equals("HEARTS-JACK")
                    || strings.get(i).equals("SPADES-JACK")) {

                valueCountPlayer += 10;
                System.out.println("JACK " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-QUEEN")
                    || strings.get(i).equals("DIAMONDS-QUEEN")
                    || strings.get(i).equals("HEARTS-QUEEN")
                    || strings.get(i).equals("SPADES-QUEEN")) {

                valueCountPlayer += 10;
                System.out.println("QUEEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-KING")
                    || strings.get(i).equals("DIAMONDS-KING")
                    || strings.get(i).equals("HEARTS-KING")
                    || strings.get(i).equals("SPADES-KING")) {

                valueCountPlayer += 10;
                System.out.println("KING " + "Position found: " + i);

            } else {
                testingNumErrorsPlayer += 1; // if something does not work add 1

            }

            System.out.println(tmpPlayerDeck.get(i));
            ++z; //Increments Card index number
            System.out.println(z); // Current Card index number

        }

        //System.out.println(cards.get(51)); // works?
        System.out.println("\n" + "Before adding value count: " + valueCountPlayer); // prints the total value before adding aces

        for (int i = 0; i < aceCounterPlayer; i++) {

            if (valueCountPlayer > 10) {
                valueCountPlayer += 1;
            } else {
                valueCountPlayer += 11;
            }
            System.out.println("\n" + "Ace value Adding: " + valueCountPlayer); // prints what each ace value is 
        }

        System.out.println("");

        System.out.println("Error count:" + testingNumErrorsPlayer); // if there is an error, print a number > 0

        System.out.println("ACE Count: " + aceCounterPlayer);

        System.out.println(tmpPlayerDeck.size()); // Total cards in the array cards

//        if (valueCountPlayer > 21) {
//            System.out.println("Bust");
//        }
        //System.out.println(cards.get(50)); 
        //System.out.print(cards.get(i) + " ");  
        //System.out.println(cards); //
        return strings;
    }

    public List<String> checkValtmpDealerDeck() {
//int valueCount = 0; added at the top
        List<String> strings = tmpDealerDeck.stream()
                //List<String> strings = cards.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        //System.out.println("STARTS HERE //////////////////////////////");

        int z = 0;

        for (int i = 0; i < this.tmpDealerDeck.size(); i++) {

            if (strings.get(i).equals("CLUBS-ACE")
                    || strings.get(i).equals("DIAMONDS-ACE")
                    || strings.get(i).equals("HEARTS-ACE")
                    || strings.get(i).equals("SPADES-ACE")) {

                aceCounterDealer += 1;

                System.out.println("ACE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-TWO")
                    || strings.get(i).equals("DIAMONDS-TWO")
                    || strings.get(i).equals("HEARTS-TWO")
                    || strings.get(i).equals("SPADES-TWO")) {

                valueCountDealer += 2;

                System.out.println("TWO " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-THREE")
                    || strings.get(i).equals("DIAMONDS-THREE")
                    || strings.get(i).equals("HEARTS-THREE")
                    || strings.get(i).equals("SPADES-THREE")) {

                valueCountDealer += 3;
                System.out.println("THREE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-FOUR")
                    || strings.get(i).equals("DIAMONDS-FOUR")
                    || strings.get(i).equals("HEARTS-FOUR")
                    || strings.get(i).equals("SPADES-FOUR")) {

                valueCountDealer += 4;
                System.out.println("FOUR " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-FIVE")
                    || strings.get(i).equals("DIAMONDS-FIVE")
                    || strings.get(i).equals("HEARTS-FIVE")
                    || strings.get(i).equals("SPADES-FIVE")) {

                valueCountDealer += 5;
                System.out.println("FIVE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-SIX")
                    || strings.get(i).equals("DIAMONDS-SIX")
                    || strings.get(i).equals("HEARTS-SIX")
                    || strings.get(i).equals("SPADES-SIX")) {

                valueCountDealer += 6;
                System.out.println("SIX " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-SEVEN")
                    || strings.get(i).equals("DIAMONDS-SEVEN")
                    || strings.get(i).equals("HEARTS-SEVEN")
                    || strings.get(i).equals("SPADES-SEVEN")) {

                valueCountDealer += 7;
                System.out.println("SEVEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-EIGHT")
                    || strings.get(i).equals("DIAMONDS-EIGHT")
                    || strings.get(i).equals("HEARTS-EIGHT")
                    || strings.get(i).equals("SPADES-EIGHT")) {

                valueCountDealer += 8;
                System.out.println("EIGHT " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-NINE")
                    || strings.get(i).equals("DIAMONDS-NINE")
                    || strings.get(i).equals("HEARTS-NINE")
                    || strings.get(i).equals("SPADES-NINE")) {

                valueCountDealer += 9;
                System.out.println("NINE " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-TEN")
                    || strings.get(i).equals("DIAMONDS-TEN")
                    || strings.get(i).equals("HEARTS-TEN")
                    || strings.get(i).equals("SPADES-TEN")) {

                valueCountDealer += 10;
                System.out.println("TEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-JACK")
                    || strings.get(i).equals("DIAMONDS-JACK")
                    || strings.get(i).equals("HEARTS-JACK")
                    || strings.get(i).equals("SPADES-JACK")) {

                valueCountDealer += 10;
                System.out.println("JACK " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-QUEEN")
                    || strings.get(i).equals("DIAMONDS-QUEEN")
                    || strings.get(i).equals("HEARTS-QUEEN")
                    || strings.get(i).equals("SPADES-QUEEN")) {

                valueCountDealer += 10;
                System.out.println("QUEEN " + "Position found: " + i);

            } else if (strings.get(i).equals("CLUBS-KING")
                    || strings.get(i).equals("DIAMONDS-KING")
                    || strings.get(i).equals("HEARTS-KING")
                    || strings.get(i).equals("SPADES-KING")) {

                valueCountDealer += 10;
                System.out.println("KING " + "Position found: " + i);

            } else {
                testingNumErrorsDealer += 1; // if something does not work add 1

            }

            System.out.println(tmpDealerDeck.get(i));
            ++z; //Increments Card index number
            System.out.println(z); // Current Card index number

        }

        //System.out.println(cards.get(51)); // works?
        System.out.println("\n" + "Before adding value count: " + valueCountPlayer); // prints the total value before adding aces

        for (int i = 0; i < aceCounterDealer; i++) {

            if (valueCountDealer > 10) {
                valueCountDealer += 1;
            } else {
                valueCountDealer += 11;
            }
            System.out.println("\n" + "Ace value Adding: " + valueCountDealer); // prints what each ace value is 
        }

        System.out.println("");

        System.out.println("Error count:" + testingNumErrorsDealer); // if there is an error, print a number > 0

        System.out.println("ACE Count: " + aceCounterDealer);

        System.out.println(tmpDealerDeck.size()); // Total cards in the array cards

//        if (valueCountPlayer > 21) {
//            System.out.println("Bust");
//        }
        //System.out.println(cards.get(50)); 
        //System.out.print(cards.get(i) + " ");  
        //System.out.println(cards); //
        return strings;
    }
    //////////////
//    public void getCardValue() {
//        //determine the cards values
//
//        //FIX THIS CODE TO MAKE WORK WITH EXISTING CODE AND THE SEARCH ABOVE
////        ArrayList<Card> arr = this.tmpPlayerDeck;
////        int x = 10;
////
////        ArrayList<Card> result = search(cards, x);
////        if (result == -1) {
////            System.out.print("Element is not present in array");
////        } else {
////            System.out.print("Element is present at index " + result);
////        }
//    }

    public void getCardCounts() {

        //Prints all of the decks sizes
        System.out.println("tmpDeck: " + tmpDeck.size());
        System.out.println("tmpPlayerDeck: " + tmpPlayerDeck.size());
        System.out.println("tmpDealerDeck: " + tmpDealerDeck.size());

        //Prints how many cards are left in the deck
        System.out.println("Cards left in Deck: " + cards.size());

    }

    public String toString() {
        String cardListOutput = "";

        int i = 0;

        for (Card aCard : this.cards) {
            //Collections.shuffle(cards); //testing
            cardListOutput += "\n" + i++ + " " + aCard.toString(); //remove i++ when done testing // + " " = space between numbers and cards printed
        }
        return cardListOutput;

    }
}
