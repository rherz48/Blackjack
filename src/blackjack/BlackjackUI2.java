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

    Deck playingDeck = new Deck();
    Player playerInfo = new Player();

    //boolean betHasBeenPlaced = false;

    double num1;
    double num2;
    double num3;
    
    int test;
    
    String newPlayerCardAdded;
    
    ImageIcon imagePlayerCard1;
    
    String DealerCard2;
    ImageIcon imageDealerCard2;
    /**
     * Creates new form BlackjackUI2
     */
    public BlackjackUI2() {
        initComponents();

        DisplayedPlayerCardImage3jLabel.setVisible(false); // Sset card 3 (hit card) visibility to false at startup

        HitjButton.setEnabled(false);
        StayjButton.setEnabled(false);
//        //Set Hit and Stay to invisible 
//        HitjButton.setVisible(false);
//        StayjButton.setVisible(false);
//        
//        //

        //
        //Player p = new Player();
        //Displays the player's money when the game starts
        BalancejTextField.setText(String.valueOf(playerInfo.money));

        //Create the game ... 
//        Deck playingDeck = new Deck();
//        Player playerInfo = new Player();

        /* ///////////////////////////////////
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
        
         */ //// /////////////
        /*
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

        
         */
//            //Add image logic here..
//            ImageIcon image = new ImageIcon(getClass().getResource("/testingimages/CLUBS-ACE-RESIZED.jpg"));
//            
//            //image.addActionListener(this);
//            DisplayedCardImage1jLabel.setIcon(image);
//            DisplayedCardImage1jLabel.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        DisplayedPlayerCardValue = new javax.swing.JLabel();
        DisplayedDealerCardValue = new javax.swing.JLabel();
        DisplayedPlayerCardImage3jLabel = new javax.swing.JLabel();
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
        ExitApplicationjLabel = new javax.swing.JLabel();

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
        DisplayedPlayerCardImage2jLabel.setText("Card 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Dealer Cards:");

        DisplayedDealerCardImage1jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedDealerCardImage1jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        DisplayedDealerCardImage1jLabel.setText("Card 1");

        FirstDisplayedDealerCardImage2jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FirstDisplayedDealerCardImage2jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        FirstDisplayedDealerCardImage2jLabel.setText("Card 2");

        DisplayedPlayerCardValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedPlayerCardValue.setText("Value");

        DisplayedDealerCardValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedDealerCardValue.setText("Value");

        DisplayedPlayerCardImage3jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DisplayedPlayerCardImage3jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeholdercard.png"))); // NOI18N
        DisplayedPlayerCardImage3jLabel.setText("Card 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DisplayedPlayerCardImage1jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisplayedPlayerCardImage2jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DisplayedPlayerCardImage3jLabel)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DisplayedDealerCardValue)
                                    .addComponent(DisplayedDealerCardImage1jLabel))
                                .addGap(18, 18, 18)
                                .addComponent(FirstDisplayedDealerCardImage2jLabel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(DisplayedPlayerCardValue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayedPlayerCardImage1jLabel)
                    .addComponent(DisplayedPlayerCardImage2jLabel)
                    .addComponent(DisplayedDealerCardImage1jLabel)
                    .addComponent(FirstDisplayedDealerCardImage2jLabel)
                    .addComponent(DisplayedPlayerCardImage3jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DisplayedPlayerCardValue)
                    .addComponent(DisplayedDealerCardValue))
                .addGap(30, 30, 30))
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
        HitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitjButtonActionPerformed(evt);
            }
        });

        StayjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StayjButton.setText("Stay");
        StayjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StayjButtonActionPerformed(evt);
            }
        });

        ExitApplicationjLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExitApplicationjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutdown_32px.png"))); // NOI18N
        ExitApplicationjLabel.setText("Exit");
        ExitApplicationjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitApplicationjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(18, 18, 18)
                        .addComponent(HitjButton)
                        .addGap(18, 18, 18)
                        .addComponent(StayjButton)
                        .addGap(41, 41, 41)
                        .addComponent(ExitApplicationjLabel)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JackpotjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JackpotjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BalancejLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HitjButton)
                                .addComponent(StayjButton)
                                .addComponent(PlaceBetjButton)
                                .addComponent(ExitApplicationjLabel))
                            .addComponent(BalancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BetjLabel)
                            .addComponent(BetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JackpotjLabel)
                            .addComponent(JackpotjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
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

        //Player p = new Player();
        //double num1; //added at top ............
//        try {
//
//            playingDeck.valueCountPlayer = 0;
//            playingDeck.valueCountDealer = 0;
//
//            playingDeck.aceCounterPlayer = 0;
//            playingDeck.aceCounterDealer = 0;
//
//            playingDeck.clearAllDecks();
//
//            playingDeck.createFullDeck();
//            playingDeck.shuffleDeck();
//
//            //Player draws two cards..
//            playingDeck.playerCards();
//            playingDeck.playerCards();
//
//            playingDeck.checkValtmpPlayerDeck();
//
//            //Dealer draws two cards.. 
//            playingDeck.dealerCards();
//            playingDeck.dealerCards();
//            playingDeck.checkValtmpDealerDeck();
//
//            //Displayed card value for the player
//            DisplayedPlayerCardValue.setText(String.valueOf(playingDeck.valueCountPlayer));
//
//            //Reset any existing text displayed if a round has been played
//            DisplayedDealerCardValue.setText("Value");
//            //
//            
//            
//            
//            
//            System.out.println("");
//
//            //Print the player's cards and the total value of them
//            System.out.println("Value: " + playingDeck.valueCountPlayer);
//            System.out.println("Your Cards: " + playingDeck.tmpPlayerDeck);
//
//            System.out.println("");
//
//            //Prints the dealers first card and [Hidden] (card not shown until after)
//            System.out.println("Dealer's Cards: " + playingDeck.tmpDealerDeck.get(0) + " + " + "[HIDDEN]");
//
//            System.out.println();
//
//            System.out.println("Player's 2 Cards: ");
//
//            //Player Card 1
//            String PlayerCard1 = playingDeck.tmpPlayerDeck.get(0).toString(); //Player's first card
//
//            System.out.println(PlayerCard1); //Prints out what the player's first card is 
//
//            ImageIcon imagePlayerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(PlayerCard1).concat(".png")));
//            DisplayedPlayerCardImage1jLabel.setIcon(imagePlayerCard1);
//            DisplayedPlayerCardImage1jLabel.setText("");
//
//            //Player Card 2
//            String PlayerCard2 = playingDeck.tmpPlayerDeck.get(1).toString(); //Player's second card
//
//            System.out.println(PlayerCard2); //Prints out what the player's first card is 
//
//            ImageIcon imagePlayerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(PlayerCard2).concat(".png")));
//            DisplayedPlayerCardImage2jLabel.setIcon(imagePlayerCard2);
//            DisplayedPlayerCardImage2jLabel.setText("");
//
//            //
//            System.out.println("Dealer's 2 Cards: ");
//            //
//
//            //Dealer Card 1
//            String DealerCard1 = playingDeck.tmpDealerDeck.get(0).toString(); //Dealers's first card
//
//            System.out.println(DealerCard1); //Prints out what the player's first card is 
//
//            ImageIcon imageDealerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard1).concat(".png")));
//            DisplayedDealerCardImage1jLabel.setIcon(imageDealerCard1);
//            DisplayedDealerCardImage1jLabel.setText("");
//
//            //Dealer Card 2 (First one, so it is not displayed)
//            String DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Dealers's second card (Not needed for displaying yet) Used for printing what it is atm
//
//            System.out.println(DealerCard2); //Prints out what the player's first card is 
//
//            //ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
//            ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
//            FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
//            FirstDisplayedDealerCardImage2jLabel.setText("");
//        } catch (NumberFormatException e) {
//
//        } catch (NullPointerException np) {
//            
//            System.out.println("Null pointer 1");
//            playingDeck.printDecks();
//            
//            playingDeck.clearAllDecks();
//            
//            playingDeck.valueCountPlayer = 0;
//            playingDeck.valueCountDealer = 0;
//
//            playingDeck.aceCounterPlayer = 0;
//            playingDeck.aceCounterDealer = 0;
//            
//            
//            playerInfo.money+=3000;
////            if (playingDeck.tmpPlayerDeck.size() < 2) {
////                playingDeck.
////            }
//        }
        try {

            num1 = Double.parseDouble(BetjTextField.getText());

//            //Round the bet to 2 decimal places 
//            double num2 = Math.round(num1 * 100.00) / 100.00;
//            
//            num1 = num2;
            if (num1 <= playerInfo.money) { // Check if the bet is <= the player's money

                
                playingDeck.valueCountPlayer = 0;
                    playingDeck.valueCountDealer = 0;

                    playingDeck.aceCounterPlayer = 0;
                    playingDeck.aceCounterDealer = 0;

                    playingDeck.clearAllDecks();
                    
                try {

                    //Round the bet to 2 decimal places 
                    num2 = Math.round(num1 * 100.00) / 100.00;

                    //num1 = num2;

                    num1=num2;
                    
                    DisplayedPlayerCardImage3jLabel.setVisible(false);

                    // ..
                    playerInfo.playerBet = num1; //set the player bet to num1

                    playerInfo.money -= num1; // take the player's bet

                    System.out.println(playerInfo.money); //print out the player's new balance

                    playerInfo.dealerBet = playerInfo.playerBet * 2;

                    BalancejTextField.setText(String.valueOf(playerInfo.money)); // update the players money displayed
                    JackpotjTextField.setText(String.valueOf(playerInfo.dealerBet)); // set the jackpot

                    // ..
                    System.out.println("Valid bet");

                    // Betting is disabled 
                    //PlaceBetjButton.setVisible(false); //Change the visibility to false so no more bets can be placed
                    // or..
                    playingDeck.valueCountPlayer = 0;
                    playingDeck.valueCountDealer = 0;

                    playingDeck.aceCounterPlayer = 0;
                    playingDeck.aceCounterDealer = 0;

                    playingDeck.clearAllDecks();

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

                    //Displayed card value for the player
                    DisplayedPlayerCardValue.setText(String.valueOf(playingDeck.valueCountPlayer));

                    //Reset any existing text displayed if a round has been played
                    DisplayedDealerCardValue.setText("Value");
                    //

                    System.out.println("");

                    //Print the player's cards and the total value of them
                    System.out.println("Value: " + playingDeck.valueCountPlayer);
                    System.out.println("Your Cards: " + playingDeck.tmpPlayerDeck);

                    System.out.println("");

                    //Prints the dealers first card and [Hidden] (card not shown until after)
                    System.out.println("Dealer's Cards: " + playingDeck.tmpDealerDeck.get(0) + " + " + "[HIDDEN]");

                    System.out.println();

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
                    DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Dealers's second card (Not needed for displaying yet) Used for printing what it is atm

                    System.out.println(DealerCard2); //Prints out what the player's first card is 

                    //ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
                    imageDealerCard2 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
                    FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
                    FirstDisplayedDealerCardImage2jLabel.setText("");

                    PlaceBetjButton.setEnabled(false);

                    // Hit and Stay are now enabled...
                    HitjButton.setEnabled(true);
                    StayjButton.setEnabled(true);

                } catch (NullPointerException npe) {
//                    playerInfo.money+=10000;
//                    System.out.println("Click bet again");
//                    
//                    //Player cards
//                    
//                    //Player card 1
//                    ImageIcon imagePlayerCard1 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
//                    DisplayedPlayerCardImage1jLabel.setIcon(imagePlayerCard1);
//                    DisplayedPlayerCardImage1jLabel.setText("");
//                    
//                    //Player card 2
//                    ImageIcon imagePlayerCard2 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
//                    DisplayedPlayerCardImage1jLabel.setIcon(imagePlayerCard2);
//                    DisplayedPlayerCardImage1jLabel.setText("");
//                    
//                    //Player card 3 
//                    DisplayedPlayerCardImage3jLabel.setVisible(false);
//                    
//                    // Dealer cards 
//                    
//                    //Dealer card 1
//                    ImageIcon imageDealerCard1 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
//                    DisplayedDealerCardImage1jLabel.setIcon(imageDealerCard1);
//                    DisplayedDealerCardImage1jLabel.setText("");
//                    
//                    //Dealer card 2
//                    ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
//                    FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
//                    FirstDisplayedDealerCardImage2jLabel.setText("");
                    
                    
                    //playingDeck.clearAllDecks();
                    
                    //Check if this works
                    
                    System.out.println("Old: " + num1);
                    
                    num3=num1;

                    //num1+=num3;
                    
                    playerInfo.money+=num3;
                    
                    //System.out.println("New: " + num1);
                    System.out.println("NullPointerException");
                    System.out.println("Updated player balance: " + playerInfo.money);
                    
                    System.out.println(playerInfo.money);
                    BalancejTextField.setText(String.valueOf(playerInfo.money));
                    System.out.println("Set balance to what it was before..");
                }
//                //Set Hit and Stay to visible
//                HitjButton.setVisible(false); // work with this............
//                StayjButton.setVisible(false);
                //CREATE DECK
//                playingDeck.clearAllDecks();
//                playingDeck.createFullDeck();
//                playingDeck.shuffleDeck();
//            
//                //Player draws two cards..
//                playingDeck.playerCards();
//                playingDeck.playerCards();
//
//                playingDeck.checkValtmpPlayerDeck();
//
//                //Dealer draws two cards.. 
//                playingDeck.dealerCards();
//                playingDeck.dealerCards();
//                playingDeck.checkValtmpDealerDeck();
//            
//            
//                playingDeck.printDecks();
//                playingDeck.getCardCounts();
//                
//                
            } else if (num1 > playerInfo.money) {
                System.out.println("Kicked out of the casino!");
                System.exit(0); // Exit application
            }

        } catch (NumberFormatException e) { //Number format exception
            System.out.println("NumberFormatException");
        }
    }//GEN-LAST:event_PlaceBetjButtonActionPerformed

    private void HitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitjButtonActionPerformed
        // TODO add your handling code here:

        //Testing: Set Player Card 1 the last element in the array
//            int test = playingDeck.tmpPlayerDeck.size()-1;
//            
//            String newPlayerCardAdded = playingDeck.tmpPlayerDeck.get(test).toString(); //Player's first card
//
//            System.out.println(newPlayerCardAdded); //Prints out what the player's first card is 
//
//            ImageIcon imagePlayerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(newPlayerCardAdded).concat(".png")));
//            DisplayedPlayerCardImage1jLabel.setIcon(imagePlayerCard1);
//            DisplayedPlayerCardImage1jLabel.setText("");
        //Fix.........
//        Deck d = new Deck();
//        Player p = new Player();
        //playingDeck.playerCards(); // Add a player card
        //Reset card values
//        playingDeck.valueCountPlayer = 0;
//        playingDeck.aceCounterPlayer = 0;
//
//        playingDeck.valueCountDealer = 0;
//        playingDeck.aceCounterDealer = 0;
//        //
//
//        //playingDeck.playerCards();
//        
//        playingDeck.checkValtmpPlayerDeck();
//
//        System.out.println(playingDeck.tmpPlayerDeck.toString());
//
//        System.out.println(playingDeck.valueCountPlayer);
        //Add the resets to everything 
        //Add a player card
        //playingDeck.playerCards();
        //Add logic...
        //if i remove this it fixed one thing but makes more problems..
        playingDeck.valueCountPlayer = 0;
        playingDeck.aceCounterPlayer = 0;

        playingDeck.valueCountDealer = 0;
        playingDeck.aceCounterDealer = 0;
        // end here 

        playingDeck.checkValtmpPlayerDeck();
        playingDeck.checkValtmpDealerDeck();

        //displayed card value for the player
        DisplayedPlayerCardValue.setText(String.valueOf(playingDeck.valueCountPlayer));

        if (playingDeck.valueCountPlayer > 21) { //&& playerInfo.money > 0) {

            //Dealer Card 2 (Dislayed)
            DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Get what the second card is 

            System.out.println(DealerCard2); //Prints out what the player's first card is 

            imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
            FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
            FirstDisplayedDealerCardImage2jLabel.setText("");

            //Update displayed card value for the dealer
            DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
            //

            System.out.println("Bust");
            System.out.println("valueCountPlayer is > 21");

            System.out.println("Player:" + playingDeck.valueCountPlayer);
            System.out.println("Dealer:" + playingDeck.valueCountDealer);

            ///
            playingDeck.valueCountPlayer = 0;
            playingDeck.aceCounterPlayer = 0;

            playingDeck.valueCountDealer = 0;
            playingDeck.aceCounterDealer = 0;

            //
//            //Reset decks
//            
//            
//            
//            playingDeck.clearAllDecks();
//            playingDeck.createFullDeck();
//            playingDeck.shuffleDeck();
//            
//            //Player draws two cards..
//            playingDeck.playerCards();
//            playingDeck.playerCards();
//
//            playingDeck.checkValtmpPlayerDeck();
//
//            //Dealer draws two cards.. 
//            playingDeck.dealerCards();
//            playingDeck.dealerCards();
//            playingDeck.checkValtmpDealerDeck();
//            
//            
//            playingDeck.printDecks();
//            playingDeck.getCardCounts();
//                    //Displays the card images 
//        System.out.println("Player's 2 Cards: ");
//
//        //Player Card 1
//        String PlayerCard1 = playingDeck.tmpPlayerDeck.get(0).toString(); //Player's first card
//
//        System.out.println(PlayerCard1); //Prints out what the player's first card is 
//
//        ImageIcon imagePlayerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(PlayerCard1).concat(".png")));
//        DisplayedPlayerCardImage1jLabel.setIcon(imagePlayerCard1);
//        DisplayedPlayerCardImage1jLabel.setText("");
//
//        //Player Card 2
//        String PlayerCard2 = playingDeck.tmpPlayerDeck.get(1).toString(); //Player's second card
//
//        System.out.println(PlayerCard2); //Prints out what the player's first card is 
//
//        ImageIcon imagePlayerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(PlayerCard2).concat(".png")));
//        DisplayedPlayerCardImage2jLabel.setIcon(imagePlayerCard2);
//        DisplayedPlayerCardImage2jLabel.setText("");
//
//        //
//        System.out.println("Dealer's 2 Cards: ");
//        //
//
//        //Dealer Card 1
//        String DealerCard1 = playingDeck.tmpDealerDeck.get(0).toString(); //Dealers's first card
//
//        System.out.println(DealerCard1); //Prints out what the player's first card is 
//
//        ImageIcon imageDealerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard1).concat(".png")));
//        DisplayedDealerCardImage1jLabel.setIcon(imageDealerCard1);
//        DisplayedDealerCardImage1jLabel.setText("");
//
//        //Dealer Card 2 (First one, so it is not displayed)
//        String DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Dealers's second card (Not needed for displaying yet) Used for printing what it is atm
//
//        System.out.println(DealerCard2); //Prints out what the player's first card is 
//
//        //ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
//        ImageIcon imageDealerCard2 = new ImageIcon(getClass().getResource("/images/placeholdercard.png"));
//        FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
//        FirstDisplayedDealerCardImage2jLabel.setText("");
//            
            //
            //num 1....
            //playerInfo.money-=num1; // dont remove more money....
            System.out.println(playerInfo.money);

            BalancejTextField.setText(String.valueOf(playerInfo.money)); // update the players money displayed

            ///// change
            PlaceBetjButton.setEnabled(true);
            HitjButton.setEnabled(false);
            StayjButton.setEnabled(false);

            JackpotjTextField.setText(""); // set the jackpot
            BetjTextField.setText(""); // set the bet

            /////
            playingDeck.clearAllDecks();

//            if (playerInfo.money >=0) {
//                System.exit(0);
//            }
            //here....
        } else if (playingDeck.valueCountPlayer <= 21) { //&& playerInfo.money > 0) { //added a = to <= (check if working now..)

            System.out.println("valueCountPlayer is < 21");

            System.out.println("Player:" + playingDeck.valueCountPlayer);
            System.out.println("Dealer:" + playingDeck.valueCountDealer);

            //logic 
            System.out.println("valid");

            //removed..
//            playingDeck.valueCountPlayer = 0;
//            playingDeck.aceCounterPlayer = 0;
//
//            playingDeck.valueCountDealer = 0;
//            playingDeck.aceCounterDealer = 0;
            ///
//            playingDeck.valueCountPlayer = 0;
//            playingDeck.aceCounterPlayer = 0;
//
//            playingDeck.valueCountDealer = 0;
//            playingDeck.aceCounterDealer = 0;
            //
//            //Reset decks
//            
//            
//            
//            playingDeck.clearAllDecks();
//            playingDeck.createFullDeck();
//            playingDeck.shuffleDeck();
//            
//            //Player draws two cards..
//removed
//playingDeck.checkValtmpPlayerDeck();
//            playingDeck.checkValtmpDealerDeck();

            try {
                playingDeck.playerCards();
            } catch (NullPointerException npe) {

            }
//            playingDeck.playerCards();

//// Display the new text for the player's value count for the cards
//            DisplayedPlayerCardValue.setText(String.valueOf(playingDeck.valueCountPlayer));
//            //
            playingDeck.printDecks();

            playingDeck.valueCountPlayer = 0;
            playingDeck.aceCounterPlayer = 0;

            playingDeck.checkValtmpPlayerDeck();

            // Display the new text for the player's value count for the cards
            DisplayedPlayerCardValue.setText(String.valueOf(playingDeck.valueCountPlayer));
            //

            System.out.println(playerInfo.money);

            //JUMPHERE
            //Set the third card to the last card added
            //Currently the first card in deck is being set to the last card
            //work with this 
            try {

                
                
                test = playingDeck.tmpPlayerDeck.size() - 1;

                newPlayerCardAdded = playingDeck.tmpPlayerDeck.get(test).toString(); //Player's first card

                System.out.println(newPlayerCardAdded); //Prints out what the player's first card is 

                imagePlayerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(newPlayerCardAdded).concat(".png")));
                DisplayedPlayerCardImage3jLabel.setIcon(imagePlayerCard1);
                DisplayedPlayerCardImage3jLabel.setText("");

                DisplayedPlayerCardImage3jLabel.setVisible(true);

                System.out.println("JUMP HERE");
                playingDeck.printDecks();

                
            } catch (NullPointerException npe) {

            }
            
            //Possible fix ^^
            playingDeck.valueCountPlayer = 0;
            playingDeck.aceCounterPlayer = 0;
            playingDeck.checkValtmpPlayerDeck();
            
            
            //work on this tomorrow.. may 24th today, may 25th tomorrow
            //Check if the player has bust from the hit
            if (playingDeck.valueCountPlayer > 21) {

                //Dealer Card 2 (Dislayed)
                DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Get what the second card is 

                System.out.println(DealerCard2); //Prints out what the player's first card is 

                imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
                FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
                FirstDisplayedDealerCardImage2jLabel.setText("");
                //

                //Update displayed card value for the dealer
                DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
                //

                System.out.println("Over 21 when hitting"); //

                // Display the new text for the player's value count for the cards
                DisplayedPlayerCardValue.setText(String.valueOf(playingDeck.valueCountPlayer));
                //

//                //add a reset for value counts here......
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
//                System.out.println("fixed???? working ???? value count player over 21");
                //Add what to do when the player has bust..
                System.out.println("Bust when adding a card");
                System.out.println("valueCountPlayer is > 21");

                System.out.println("Player:" + playingDeck.valueCountPlayer);
                System.out.println("Dealer:" + playingDeck.valueCountDealer);

                playingDeck.valueCountPlayer = 0;
                playingDeck.aceCounterPlayer = 0;

                playingDeck.valueCountDealer = 0;
                playingDeck.aceCounterDealer = 0;

                System.out.println(playerInfo.money);

                BalancejTextField.setText(String.valueOf(playerInfo.money)); // update the players money displayed

                PlaceBetjButton.setEnabled(true);
                HitjButton.setEnabled(false);
                StayjButton.setEnabled(false);

                JackpotjTextField.setText(""); // set the jackpot
                BetjTextField.setText(""); // set the bet

                playingDeck.clearAllDecks();

            } else if (playingDeck.valueCountPlayer < 21) {
                System.out.println("abc");
            }

//            playingDeck.checkValtmpPlayerDeck();
//            playingDeck.checkValtmpDealerDeck();
//            playingDeck.playerCards();
//
//            playingDeck.checkValtmpPlayerDeck();
//
//            //Dealer draws two cards.. 
//            playingDeck.dealerCards();
//            playingDeck.dealerCards();
//            playingDeck.checkValtmpDealerDeck();
//            
//            
//            playingDeck.printDecks();
//            playingDeck.getCardCounts();
            //num 1....
//            playerInfo.money-=num1;
//            System.out.println(playerInfo.money);
            //BalancejTextField.setText(String.valueOf(playerInfo.money)); // update the players money displayed
            ////
//Add a check to see if the value of the player's cards is over 21
        } else if (playerInfo.money < 0) { // removed =

            PlaceBetjButton.setEnabled(false);
            HitjButton.setEnabled(false);
            StayjButton.setEnabled(false);
            //HitStayIsVisibleFalse();

            //System.exit(0);
//        } else {
//            System.out.println("Something else happened...");
        }
    }//GEN-LAST:event_HitjButtonActionPerformed

    private void StayjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StayjButtonActionPerformed
        // TODO add your handling code here:

        HitjButton.setEnabled(false);

        //Display dealer's second card
//                    //Dealer Card 1
//            String DealerCard1 = playingDeck.tmpDealerDeck.get(0).toString(); //Dealers's first card
//
//            System.out.println(DealerCard1); //Prints out what the player's first card is 
//
//            ImageIcon imageDealerCard1 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard1).concat(".png")));
//            DisplayedDealerCardImage1jLabel.setIcon(imageDealerCard1);
//            DisplayedDealerCardImage1jLabel.setText("");
        //Dealer Card 2 (Dislayed)
        DealerCard2 = playingDeck.tmpDealerDeck.get(1).toString(); //Get what the second card is 

        System.out.println(DealerCard2); //Prints out what the player's first card is 

        imageDealerCard2 = new ImageIcon(getClass().getResource("/cardimages/".concat(DealerCard2).concat(".png")));
        FirstDisplayedDealerCardImage2jLabel.setIcon(imageDealerCard2);
        FirstDisplayedDealerCardImage2jLabel.setText("");

//        playingDeck.valueCountPlayer = 0;
//        playingDeck.aceCounterPlayer = 0;
//
//        playingDeck.valueCountDealer = 0;
//        playingDeck.aceCounterDealer = 0;
//        
//        System.out.println("Start of stay...");
//        playingDeck.checkValtmpPlayerDeck();
//                playingDeck.checkValtmpDealerDeck();
//                
        System.out.println("Player Card Value: " + playingDeck.valueCountPlayer);
        System.out.println("Dealer Card Value: " + playingDeck.valueCountDealer);
//                
//             System.out.println("end of start of start of stay....");
//             
//             
//        playingDeck.valueCountPlayer = 0;
//        playingDeck.aceCounterPlayer = 0;
//
//        playingDeck.valueCountDealer = 0;
//        playingDeck.aceCounterDealer = 0;

// needed ??
//        playingDeck.checkValtmpPlayerDeck();
//        playingDeck.checkValtmpDealerDeck();
        //playingDeck.valueCountPlayer = playingDeck.valueCountDealer; //used to test if valueCountPlayer is = valueCountDealer
        if (playingDeck.valueCountPlayer == playingDeck.valueCountDealer) {
            System.out.println("Dealer wins by having the same value as the player");
            
            
            //Update displayed card value for the dealer
            DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
            //
            
            //Set balance again..
            BalancejTextField.setText(String.valueOf(playerInfo.money));

            //Set the Bet to cleared
            BetjTextField.setText("");

            //Clear jackpot
            JackpotjTextField.setText("");

            //Wait for new bet
            PlaceBetjButton.setEnabled(true);
            HitjButton.setEnabled(false);
            StayjButton.setEnabled(false);

            // ..
            playingDeck.valueCountPlayer = 0;
            playingDeck.aceCounterPlayer = 0;

            playingDeck.valueCountDealer = 0;
            playingDeck.aceCounterDealer = 0;

            playingDeck.clearAllDecks();

            //System.out.println("Dealer won by having cards = player's");
        } //        if (playingDeck.valueCountPlayer >= playingDeck.valueCountDealer || playingDeck.)
        else if (playingDeck.valueCountDealer > playingDeck.valueCountPlayer) { //|| playingDeck.valueCountDealer >= playingDeck.valueCountPlayer) { //added else to if
//            try {
            //playerInfo.money-=num1; // if you do this it will do it twice because it's already done at the top

            ///////////
//                playingDeck.valueCountPlayer = 0;
//                playingDeck.aceCounterPlayer = 0;
//
//                playingDeck.valueCountDealer = 0;
//                playingDeck.aceCounterDealer = 0;
//                
//                
//                playingDeck.checkValtmpPlayerDeck();
//                playingDeck.checkValtmpDealerDeck();
//                System.out.println("Player Card Value: " + playingDeck.valueCountPlayer);
//                System.out.println("Dealer Card Value: " + playingDeck.valueCountDealer);
            //playingDeck.getCardCounts(); // get the card counts
            ////////////////
            //Update displayed card value for the dealer
            DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
            //

            //Set balance again..
            BalancejTextField.setText(String.valueOf(playerInfo.money));

            //Set the Bet to cleared
            BetjTextField.setText("");

            //Clear jackpot
            JackpotjTextField.setText("");

            //Wait for new bet
            PlaceBetjButton.setEnabled(true);
            HitjButton.setEnabled(false);
            StayjButton.setEnabled(false);

            // ..
            playingDeck.valueCountPlayer = 0;
            playingDeck.aceCounterPlayer = 0;

            playingDeck.valueCountDealer = 0;
            playingDeck.aceCounterDealer = 0;

            //////////////////
            playingDeck.clearAllDecks();

            /////////////////////////////////
            System.out.println("Dealer won by having cards >= players");

//                //Clear decks
//                
//                
//                
//                
//                playingDeck.clearAllDecks();
//                playingDeck.createFullDeck();
//                playingDeck.shuffleDeck();
//                
//                playingDeck.playerCards();
//                playingDeck.playerCards();
//                playingDeck.dealerCards();
//                playingDeck.dealerCards();
//            } catch (NumberFormatException e) {
//                System.out.println("NumberFormatException: Stay");
//            }
        } ///ddddd
        else if (playingDeck.valueCountPlayer > playingDeck.valueCountDealer) { //&& playerInfo.money > 0) {

            ////////////////////////////////////////////////////
            //ADD A WAY FOR THE DEALER TO DRAW CARDS IF THEY HAVE LESS THAN THE PLAYERS
            ////////////////////////////////////////////////
            //add an else if maybe to this...............???????
            do {

                //Update displayed card value for the dealer
                DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
                //

//                playingDeck.valueCountPlayer = 0;
//                playingDeck.aceCounterPlayer = 0;
                playingDeck.valueCountDealer = 0;
                playingDeck.aceCounterDealer = 0;

                playingDeck.dealerCards(); //add a dealer card
                playingDeck.checkValtmpDealerDeck();

                //playingDeck.checkValtmpPlayerDeck();
                System.out.println("Player Value: " + playingDeck.valueCountPlayer);
                System.out.println("Dealer Value: " + playingDeck.valueCountDealer);

                System.out.println("Dealer card added....");

                //Update displayed card value for the dealer
                DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
                //

                if (playingDeck.valueCountDealer > 21) {
                    System.out.println("DEALER HAS BUST");

                    //Update displayed card value for the dealer
                    DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
                    //

                    playerInfo.money += num1 * 2;

                    //Set balance again..
                    BalancejTextField.setText(String.valueOf(playerInfo.money));

                    //Set the Bet to cleared
                    BetjTextField.setText("");

                    //Clear jackpot
                    JackpotjTextField.setText("");

                    //Wait for new bet
                    PlaceBetjButton.setEnabled(true);
                    HitjButton.setEnabled(false);
                    StayjButton.setEnabled(false);

                    // ..
                    playingDeck.valueCountPlayer = 0;
                    playingDeck.aceCounterPlayer = 0;

                    playingDeck.valueCountDealer = 0;
                    playingDeck.aceCounterDealer = 0;

                    playingDeck.clearAllDecks();

                } else if (playingDeck.valueCountDealer == playingDeck.valueCountPlayer) {

                    //Update displayed card value for the dealer
                    DisplayedDealerCardValue.setText(String.valueOf(playingDeck.valueCountDealer));
                    //

                    System.out.println("Dealer wins by having the same value as the player");
                    //Set balance again..
                    BalancejTextField.setText(String.valueOf(playerInfo.money));

                    //Set the Bet to cleared
                    BetjTextField.setText("");

                    //Clear jackpot
                    JackpotjTextField.setText("");

                    //Wait for new bet
                    PlaceBetjButton.setEnabled(true);
                    HitjButton.setEnabled(false);
                    StayjButton.setEnabled(false);

                    // ..
                    playingDeck.valueCountPlayer = 0;
                    playingDeck.aceCounterPlayer = 0;

                    playingDeck.valueCountDealer = 0;
                    playingDeck.aceCounterDealer = 0;

                    playingDeck.clearAllDecks();

                    System.out.println("Dealer won by having cards = player's");

                } else if (playingDeck.valueCountDealer == 21) {
                    System.out.println("The dealer has 21!");
                } else if (playingDeck.valueCountDealer < 21) {
                    System.out.println("less than 21");
                }

            } while (playingDeck.valueCountPlayer > playingDeck.valueCountDealer && playingDeck.valueCountDealer < 21); // && playingDeck.valueCountDealer < 16);

            //playingDeck.printDecks();/// .... Print the decks
            // check if PLAYER WINS //////////////////////
            if (playingDeck.valueCountPlayer > playingDeck.valueCountDealer) {
                System.out.println("Logic is working ??????");

                System.out.println("Player wins!! playingDeck.valueCountPlayer > playingDeck.valueCountDealer");
                /////////////// check if

                playerInfo.money += num1 * 2;

                //Set balance again..
                BalancejTextField.setText(String.valueOf(playerInfo.money));

                //Set the Bet to cleared
                BetjTextField.setText("");

                //Clear jackpot
                JackpotjTextField.setText("");

                //Wait for new bet
                PlaceBetjButton.setEnabled(true);
                HitjButton.setEnabled(false);
                StayjButton.setEnabled(false);

                // ..
                playingDeck.valueCountPlayer = 0;
                playingDeck.aceCounterPlayer = 0;

                playingDeck.valueCountDealer = 0;
                playingDeck.aceCounterDealer = 0;

                playingDeck.clearAllDecks();
                //////

                System.out.println("player > dealer or dealer bust");

                ////////////
//                playingDeck.clearAllDecks();
//                                playingDeck.createFullDeck();
//                playingDeck.shuffleDeck();
//                
//                playingDeck.playerCards();
//                playingDeck.playerCards();
//                playingDeck.dealerCards();
//                playingDeck.dealerCards();
                ////////
            } //added else if .......
            else if (playingDeck.valueCountDealer >= playingDeck.valueCountPlayer) {
                try {
                    //playerInfo.money-=num1; // if you do this it will do it twice because it's already done at the top

                    //Set balance again..
                    BalancejTextField.setText(String.valueOf(playerInfo.money));

                    //Set the Bet to cleared
                    BetjTextField.setText("");

                    //Clear jackpot
                    JackpotjTextField.setText("");

                    //Wait for new bet
                    PlaceBetjButton.setEnabled(true);
                    HitjButton.setEnabled(false);
                    StayjButton.setEnabled(false);

                    // ..
                    playingDeck.valueCountPlayer = 0;
                    playingDeck.aceCounterPlayer = 0;

                    playingDeck.valueCountDealer = 0;
                    playingDeck.aceCounterDealer = 0;

                    //////////
                    playingDeck.clearAllDecks();
                    ////////////

//                playingDeck.clearAllDecks();
//                                playingDeck.createFullDeck();
//                playingDeck.shuffleDeck();
//                
//                playingDeck.playerCards();
//                playingDeck.playerCards();
//                playingDeck.dealerCards();
//                playingDeck.dealerCards();
                    /////////////////////
                    ///////////
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException: Stay");
                }

//            }else if (playingDeck.valueCountDealer > 21){
//                
            } else if (playingDeck.valueCountPlayer > playingDeck.valueCountDealer || playingDeck.valueCountDealer > 21) {
                try {
                    playerInfo.money += num1 * 2;

                    //Set balance again..
                    BalancejTextField.setText(String.valueOf(playerInfo.money));

                    //Set the Bet to cleared
                    BetjTextField.setText("");

                    //Clear jackpot
                    JackpotjTextField.setText("");

                    //Wait for new bet
                    PlaceBetjButton.setEnabled(true);
                    HitjButton.setEnabled(false);
                    StayjButton.setEnabled(false);

                    // ..
                    playingDeck.valueCountPlayer = 0;
                    playingDeck.aceCounterPlayer = 0;

                    playingDeck.valueCountDealer = 0;
                    playingDeck.aceCounterDealer = 0;

                    ///////////////////////////
                    playingDeck.clearAllDecks();
                    //////

                    System.out.println("player > dealer or dealer bust");

                    ////////////
//                playingDeck.clearAllDecks();
//                                playingDeck.createFullDeck();
//                playingDeck.shuffleDeck();
//                
//                playingDeck.playerCards();
//                playingDeck.playerCards();
//                playingDeck.dealerCards();
//                playingDeck.dealerCards();
//                
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException: Stay");
                }
            }

//            try {
//                playerInfo.money+=num1*2;
//                
//                
//                //Set balance again..
//                BalancejTextField.setText(String.valueOf(playerInfo.money));
//                
//                //Set the Bet to cleared
//                BetjTextField.setText("");
//                
//                //Clear jackpot
//                JackpotjTextField.setText("");
//                
//                //Wait for new bet
//                PlaceBetjButton.setEnabled(true);
//                HitjButton.setEnabled(false);
//                StayjButton.setEnabled(false);
//                
//                // ..
//                
//                playingDeck.valueCountPlayer = 0;
//                playingDeck.aceCounterPlayer = 0;
//
//                playingDeck.valueCountDealer = 0;
//                playingDeck.aceCounterDealer = 0;
//                
//                
//            } catch (NumberFormatException e) {
//                System.out.println("NumberFormatException: Stay");
//            }
        }

    }//GEN-LAST:event_StayjButtonActionPerformed

    private void ExitApplicationjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitApplicationjLabelMouseClicked
        // TODO add your handling code here:
        
        System.exit(0); //Exit application
    }//GEN-LAST:event_ExitApplicationjLabelMouseClicked
///DO SOMETHING

    public void HitStayIsVisibleTrue() {
        HitjButton.setVisible(true);
        StayjButton.setVisible(true);
    }

    public void HitStayIsVisibleFalse() {
        HitjButton.setVisible(false);
        StayjButton.setVisible(false);
    }

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
    private javax.swing.JLabel DisplayedDealerCardValue;
    private javax.swing.JLabel DisplayedPlayerCardImage1jLabel;
    private javax.swing.JLabel DisplayedPlayerCardImage2jLabel;
    private javax.swing.JLabel DisplayedPlayerCardImage3jLabel;
    private javax.swing.JLabel DisplayedPlayerCardValue;
    private javax.swing.JLabel ExitApplicationjLabel;
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
