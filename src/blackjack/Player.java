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
    
    double money = 1000; //the player's money amount
    
    double playerBet = 0; //used to set the dealer's current bet amount
    double dealerBet = 0; // dealer bet
    
    double winAmount = 0; //Win Amount
    
    Scanner input = new Scanner(System.in);
    
    public double playerBetAmount() {
        
        double moneyAmount = input.nextDouble();
        
        playerBet+=moneyAmount; // to use for the dealer to get the current bet
        
        
        //this.betAmount(moneyAmount);
        return playerBet;//money-=moneyAmount;
        
    }
    public double dealerBetAmount() { // gets the dealer's bet amount
        //Player a = new Player();
        
        dealerBet+=playerBet;
        
        return dealerBet;
    }
    public double displayWinAmount() {
        return dealerBet + playerBet;
    }
    public double Winner() {
        
        winAmount+=dealerBet + playerBet;
        //winAmount+= playerBetAmount() + dealerBetAmount();
        money+=winAmount;
        //money+=winAmount;
        
        return money; //+= dealerBet; //doubles the dealer's amount (which is the player's bet amount)
    }
    public double Loser() {
        
        //winAmount+=dealerBet + playerBet;
        //winAmount+= playerBetAmount() + dealerBetAmount();
        money-=playerBet;
        //money+=winAmount;
        
        return money; //+= dealerBet; //doubles the dealer's amount (which is the player's bet amount)
    }
    
    public void exitApp() {
        System.exit(0);
        
    }
}
