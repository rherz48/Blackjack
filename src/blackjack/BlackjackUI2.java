/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;

import javax.swing.ImageIcon;

/**
 *
 * @author ryanh
 */
public class BlackjackUI2 extends javax.swing.JFrame {

    /** Creates new form BlackjackUI2 */
    public BlackjackUI2() {
        initComponents();
        
        //
        Player p = new Player();
          
        //Displays the player's money when the game starts
        BalancejTextField.setText(String.valueOf(p.money));
        
        
        
        //Create the game ... 
        
        Deck playingDeck = new Deck();
        Player playerInfo = new Player();
        
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();
        
        
        //Player draws two cards..
            playingDeck.playerCards();
            playingDeck.playerCards();

            playingDeck.checkValtmpPlayerDeck();

            //Dealer draws two cards.. 
            playingDeck.dealerCards();
            playingDeck.dealerCards();
            playingDeck.checkValtmpDealerDeck();

            System.out.println("");

            //Print the player's cards and the total value of them
            System.out.println("Value: " + playingDeck.valueCountPlayer);
            System.out.println("Your Cards: " + playingDeck.tmpPlayerDeck);

            System.out.println("");

            //Prints the dealers first card and [Hidden] (card not shown until after)
            System.out.println("Dealer's Cards: " + playingDeck.tmpDealerDeck.get(0) + " + " + "[HIDDEN]");

            System.out.println();
        
            
            
            
//            //Add image logic here..
//            ImageIcon image = new ImageIcon(getClass().getResource("/images/money_bag_48px.png"));
//            
//            //image.addActionListener(this);
//            DisplayedCardImage1jLabel.setIcon(image);
//            DisplayedCardImage1jLabel.setText("");
            

            //Displays the card images 
            
            System.out.println("Player's 2 Cards: ");
            
            //Player Card 1
            String PlayerCard1 = playingDeck.tmpPlayerDeck.get(0).toString(); //Player's first card
                        
            System.out.println(PlayerCard1); //Prints out what the player's first card is 
            
            ImageIcon imagePlayerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(PlayerCard1).concat(".png")));
            DisplayedPlayerCardImage1jLabel.setIcon(imagePlayerCard1);
            DisplayedPlayerCardImage1jLabel.setText(""); 
            
           //Player Card 2
            String PlayerCard2 = playingDeck.tmpPlayerDeck.get(1).toString(); //Player's second card
            
            System.out.println(PlayerCard2); //Prints out what the player's first card is 
            
            ImageIcon imagePlayerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(PlayerCard2).concat(".png")));
            DisplayedPlayerCardImage2jLabel.setIcon(imagePlayerCard2);
            DisplayedPlayerCardImage2jLabel.setText(""); 
            
            //
            System.out.println("Dealer's 2 Cards: ");
            //
            
            //Dealer Card 1
            String DealerCard1 = playingDeck.tmpDealerDeck.get(0).toString(); //Dealers's first card
            
            System.out.println(DealerCard1); //Prints out what the player's first card is 
            
            ImageIcon imageDealerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard1).concat(".png")));
            DisplayedDealerCardImage1jLabel.setIcon(imageDealerCard1);
            DisplayedDealerCardImage1jLabel.setText(""); 
            
            //Dealer Card 2 (First one, so it is not displayed)
            String DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Dealers's second card (Not needed for displaying yet) Used for printing what it is atm
            
            System.out.println(DealerCard2); //Prints out what the player's first card is 
            
            //ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
            ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
            FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
            FirstDisplayedDealerCardImage2jLabel.setText(""); 
            
            
            
            
//            //Add image logic here..
//            ImageIcon image = new ImageIcon(getClass().getResource("/testingimages/CLUBS-ACE-RESIZED.jpg"));
//            
//            //image.addActionListener(this);
//            DisplayedCardImage1jLabel.setIcon(image);
//            DisplayedCardImage1jLabel.setText("");
            
            
            
            
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DisplayedPlayerCardImage1jLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DisplayedPlayerCardImage2jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DisplayedDealerCardImage1jLabel = new javax.swing.JLabel();
        FirstDisplayedDealerCardImage2jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BalancejLabel = new javax.swing.JLabel();
        BetjLabel = new javax.swing.JLabel();
        BalancejTextField = new javax.swing.JTextField();
        BetjTextField = new javax.swing.JTextField();
        JackpotjLabel = new javax.swing.JLabel();
        JackpotjTextField = new javax.swing.JTextField();
        PlaceBetjButton = new javax.swing.JButton();
        HitjButton = new javax.swing.JButton();
        StayjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 3, new java.awt.Color(0, 0, 0)));

        DisplayedPlayerCardImage1jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedPlayerCardImage1jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        DisplayedPlayerCardImage1jLabel.setText("Card 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Player Cards:");

        DisplayedPlayerCardImage2jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedPlayerCardImage2jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        DisplayedPlayerCardImage2jLabel.setText("Card 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Dealer Cards:");

        DisplayedDealerCardImage1jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedDealerCardImage1jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        DisplayedDealerCardImage1jLabel.setText("Card 1");

        FirstDisplayedDealerCardImage2jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FirstDisplayedDealerCardImage2jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        FirstDisplayedDealerCardImage2jLabel.setText("Card 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DisplayedPlayerCardImage1jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DisplayedPlayerCardImage2jLabel)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DisplayedDealerCardImage1jLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FirstDisplayedDealerCardImage2jLabel))
                    .addComponent(jLabel3))
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayedPlayerCardImage1jLabel)
                    .addComponent(DisplayedPlayerCardImage2jLabel)
                    .addComponent(DisplayedDealerCardImage1jLabel)
                    .addComponent(FirstDisplayedDealerCardImage2jLabel))
                .addGap(310, 310, 310))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_bag_48px.png"))); // NOI18N

        BalancejLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BalancejLabel.setText("Balance: ");

        BetjLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BetjLabel.setText("Bet: ");

        BalancejTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BalancejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalancejTextFieldActionPerformed(evt);
            }
        });

        BetjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BetjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetjTextFieldActionPerformed(evt);
            }
        });

        JackpotjLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JackpotjLabel.setText("Jackpot: ");

        JackpotjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JackpotjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JackpotjTextFieldActionPerformed(evt);
            }
        });

        PlaceBetjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PlaceBetjButton.setText("Place Bet");
        PlaceBetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceBetjButtonActionPerformed(evt);
            }
        });

        HitjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HitjButton.setText("Hit");

        StayjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StayjButton.setText("Stay");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalancejLabel)
                    .addComponent(BetjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BalancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlaceBetjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HitjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StayjButton)
                        .addGap(267, 267, 267))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JackpotjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JackpotjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BalancejLabel)
                            .addComponent(BalancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HitjButton)
                                .addComponent(StayjButton)
                                .addComponent(PlaceBetjButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BetjLabel)
                            .addComponent(BetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JackpotjLabel)
                            .addComponent(JackpotjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BalancejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalancejTextFieldActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_BalancejTextFieldActionPerformed

    private void BetjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BetjTextFieldActionPerformed

    private void JackpotjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JackpotjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JackpotjTextFieldActionPerformed

    private void PlaceBetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceBetjButtonActionPerformed
        // TODO add your handling code here:
        
        Player p = new Player();
        
        double num1;
        
        try {
            
        
        num1 = Double.parseDouble(BetjTextField.getText());
        
        if (num1 < p.money) {
            
            // ..
            p.playerBet=num1; //set the player bet to num1
            
            p.money-=num1; // take the player's bet
            System.out.println(p.money); //print out the player's new balance
            
            p.dealerBet=p.playerBet*2;
            
            BalancejTextField.setText(String.valueOf(p.money)); // update the players money displayed
            JackpotjTextField.setText(String.valueOf(p.dealerBet)); // set the jackpot
            
            
            // ..
            System.out.println("Valid bet");
            
        } else if (num1 > p.money) {
            System.out.println("Kicked out of the casino!");
            System.exit(0); // Exit application
        }
        
        } catch (NumberFormatException e) { //Number format exception
            System.out.println("NumberFormatException");
        }
        
    }//GEN-LAST:event_PlaceBetjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlackjackUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackjackUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackjackUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackjackUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackjackUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalancejLabel;
    private javax.swing.JTextField BalancejTextField;
    private javax.swing.JLabel BetjLabel;
    private javax.swing.JTextField BetjTextField;
    private javax.swing.JLabel DisplayedDealerCardImage1jLabel;
    private javax.swing.JLabel DisplayedPlayerCardImage1jLabel;
    private javax.swing.JLabel DisplayedPlayerCardImage2jLabel;
    private javax.swing.JLabel FirstDisplayedDealerCardImage2jLabel;
    private javax.swing.JButton HitjButton;
    private javax.swing.JLabel JackpotjLabel;
    private javax.swing.JTextField JackpotjTextField;
    private javax.swing.JButton PlaceBetjButton;
    private javax.swing.JButton StayjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
