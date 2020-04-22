/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;


/**
 *
 * @author ryanh
 */
public class Player {
    
    double Money = 1000; //the player's money amount
    
    double currentBet = 0; //used to set the dealer's current bet amount
    
    
    Scanner input = new Scanner(System.in);
    
    public double playerBetAmount(double Bet) {
        
        double moneyAmount = input.nextDouble();
        
        currentBet+=moneyAmount; // to use for the dealer to get the current bet
        
        //this.betAmount(moneyAmount);
        return Money-=moneyAmount;
        
    }
    public double dealerBetAmount() { // gets the dealer's bet amount
        //Player a = new Player();
        
        return this.currentBet;
    }
    public double amountToWin(double amountIfWon) {
        return amountIfWon = currentBet*2; //doubles the dealer's amount (which is the player's bet amount)
    }
    
    public void exitApp() {
        System.exit(0);
        
    }
}
