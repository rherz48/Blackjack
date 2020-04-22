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
    
    double Money = 1000;
    
    Scanner input = new Scanner(System.in);
    
    public double betAmount(double Bet) {
        
        double moneyAmount = input.nextDouble();
        
        //this.betAmount(moneyAmount);
        return Money-=moneyAmount;
        
    }
}
