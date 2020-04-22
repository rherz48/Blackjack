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



        
        System.out.println(ANSI_BLUE + "Blackjack" + ANSI_RESET + "\n"); // prints Blackjack blue and underlined

        //might not need/use
//        double bet; 
//        double betAmount;
        Player a = new Player();
        
        while (true) {
            
            Scanner input = new Scanner(System.in);
            
            try {

                System.out.println("Welcome to the Blackjack Game! ");
                System.out.println("What would you like to do?");
                System.out.println("1: Play, 2: Exit"); 
                
                System.out.print("Input: "); // get user input on this line
                /**
                 * Inputs types:
                 * 1 = Play
                 * 2 = Exit
                 */
                
                double checkVal = 0;
                
                if (input.hasNextDouble()) {
                    checkVal = input.nextDouble();
                    
                    double userInput = checkVal;
                    
//                    System.out.println("What would you like to do?");
//                    System.out.println("1: Play, 2: Exit");
                    
                    
                    if(userInput == 1) {
                        System.out.println("Starting game!");
                        break;
                        
                    }else if (userInput == 2) {
                        System.out.println("Thanks for playing!");
                        System.exit(0); // jvm terminal is 1, program is 0?
                        //break;
                    
                    }
                } else {
                    System.out.println(""); // If the input is invalid, print a blank new line
                    //continue;
                }
                
//                }catch (Exception e) {
//                    System.out.println("An error has occurred..");

                }catch (InputMismatchException ime) { // dont need it now, but might need it later
                    System.out.println("Invalid input.");
                    
            }

            }
        // this is where the game should start
        System.out.println("");
        
        //Player a = new Player(); // new player 
        
        
        // CREATE A LOOP TO HOLD EVERYTHING UNTIL EXITED ////
        
        /**
         * Creates the bet amount for the player,
         * and the total amount that can be won
         */ 
        
        System.out.println("Current Balance: " + a.Money);
        System.out.print("Your Bet: ");
        double b = a.playerBetAmount(0);
        
        //dealer bet amount
        a.dealerBetAmount();
        System.out.println("Dealer Bet: " + a.dealerBetAmount());
        
        //Prints out the new balance
        System.out.print("New balance: " + b);
        
        // seperate lines
        System.out.println("\n");
        //
        
        // calculates and displays amount if won
        double Prize = a.amountToWin(0);
        // rounded to nearest whole number
        System.out.println(Math.round(Prize));

        }

    }
