/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ryanh
 */
public class Blackjack {
    
    
    public static final String ANSI_BLUE = "\u001B[34m"; // colour blue
    public static final String ANSI_RESET = "\u001B[0m"; //used after colours to reset it so not everything will have that colour
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deck playingDeck = new Deck();
        Player playerInfo = new Player();
        
        
        //Arrays to hold the cards being used
        //String allCards[];
        //String playerCards[];
        //String dealerCards[];
       ///
        
        //playingDeck.removeCard();
        
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();
        
        
        //removeCard is not set to work: use removeACard instead
        //playingDeck.removeCard(); //fix : this runs first because in the remove card it is currently set to print everything in it....
        
        
        
        System.out.println(playingDeck);
        
        //playingDeck.removeCard(); //currently prints the deck out ..
        
        
        System.out.println(playingDeck.newDeck());
        playingDeck.removeACard(); // remove a card from the deck
        System.out.println(playingDeck.newDeck()); //prints the deck after removing a card
        
        playingDeck.playerCards();
        
        System.out.println(playingDeck.tmpDeck);
        
        playingDeck.dealerCards();
        //playingDeck.removeACard();
        
        
        System.out.println(playingDeck.tmpDealerDeck); //prints the dealers temp deck: tmpDealerDeck
        
        playingDeck.getCardCounts();
        
        
        System.out.println("-----");
        playingDeck.moveCardsBackToDeck();
        
        //playingDeck.clearAllDecks(); //Clears all the cards in the decks
        
        
        //working on checking each element in the array and cardcounts from before
        //playingDeck.playerCards(); // add
        
        
        playingDeck.getCardCounts();
        
        
        //working on checking each element in the array

        System.out.println(""); // space between lines
        
        
        playingDeck.checkVal();
        //System.out.println(playingDeck.tmpDeck);
        
        System.out.println(playingDeck.valueCount); // prints the total value of the deck
        
        //
        
        // player test..
        playingDeck.playerCards();
        playingDeck.playerCards();
        playingDeck.playerCards();
        playingDeck.playerCards();
        playingDeck.checkValtmpPlayerDeck();
        
        //dealer test.. 
        
        playingDeck.dealerCards();
        playingDeck.dealerCards();
        playingDeck.dealerCards();
        playingDeck.dealerCards();
        playingDeck.checkValtmpDealerDeck();
        
        System.out.println("Player: " + playingDeck.valueCountPlayer);
        System.out.println(playingDeck.tmpPlayerDeck);
        System.out.println("Dealer: " + playingDeck.valueCountDealer);
        System.out.println(playingDeck.tmpDealerDeck);
//        playingDeck.moveCardsBackToDeck();
//        playingDeck.createFullDeck();
//        //playingDeck.shuffleDeck();
//        playingDeck.checkVal();
//        System.out.println(playingDeck.valueCount);
        
        //playingDeck.printDecks(); //prints the cards in each of the decks
        
        ///Clear decks : make work
        
//        playingDeck.moveCardsBackToDeck();
//        playingDeck.getCardsCounts();
//        System.out.println(playingDeck.tmpDeck);
        
        
        
        //System.out.println(playingDeck)
        
        
//
//
//
//        
//        System.out.println(ANSI_BLUE + "Blackjack" + ANSI_RESET + "\n"); // prints Blackjack blue 
//
//        //might not need/use
////        double bet; 
////        double betAmount;
//        Player a = new Player();
//        
//        
//        
//        while (true) {
//            
//            Scanner input = new Scanner(System.in);
//            
//            try {
//
//                System.out.println("Welcome to the Blackjack Game! ");
//                System.out.println("What would you like to do?");
//                System.out.println("1: Play, 2: Exit"); 
//                
//                System.out.print("Input: "); // get user input on this line
//                /**
//                 * Inputs types:
//                 * 1 = Play
//                 * 2 = Exit
//                 */
//                
//                double checkVal = 0;
//                
//                if (input.hasNextDouble()) {
//                    checkVal = input.nextDouble();
//                    
//                    double userInput = checkVal;
//                    
////                    System.out.println("What would you like to do?");
////                    System.out.println("1: Play, 2: Exit");
//                    
//                    
//                    if(userInput == 1) {
//                        System.out.println("Starting game!");
//                        break;
//                        
//                    }else if (userInput == 2) {
//                        System.out.println("Thanks for playing!");
//                        System.exit(0); // jvm terminal is 1, program is 0?
//                        //break;
//                    
//                    }
//                } else {
//                    System.out.println(""); // If the input is invalid, print a blank new line
//                    //continue;
//                }
//                
////                }catch (Exception e) {
////                    System.out.println("An error has occurred..");
//
//                }catch (InputMismatchException ime) { // dont need it now, but might need it later
//                    System.out.println("Invalid input.");
//                    
//            }
//
//            }
//        // this is where the game should start
//        System.out.println("");
//        
//        //Player a = new Player(); // new player 
//        
//        
//        
//        
//        
//        
//        
//        // CREATE A LOOP TO HOLD EVERYTHING UNTIL EXITED ////
//        
//        
//        
//        
//        
//        /**
//         * Creates the bet amount for the player,
//         * and the total amount that can be won
//         */ 
//        
//        System.out.println("Current Balance: " + a.Money);
//        System.out.print("Your Bet: ");
//        double b = a.playerBetAmount(0);
//        
//        //dealer bet amount
//        a.dealerBetAmount();
//        System.out.println("Dealer Bet: " + a.dealerBetAmount());
//        
//        //Prints out the new balance
//        System.out.print("New balance: " + b);
//        
//        // seperate lines
//        System.out.println("\n");
//        //
//        
//        // calculates and displays amount if won
//        double Prize = a.amountToWin(0);
//        // rounded to nearest whole number
//        System.out.println("Prize to win: "+(Math.round(Prize)) + "\n");
//
//        
//        


        }

    }
