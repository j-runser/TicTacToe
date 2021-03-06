/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author josephrunser
 */
public class TicTacToeJFrame extends javax.swing.JFrame {
    
    Board myBoard;
    Player playerOne;
    Player playerTwo;
    
    private int catCounter;
    
    private final JButton[] btn_board;

    /**
     * Creates new form TicTacToeJFrame
     */
    public TicTacToeJFrame() {
        initComponents();
        
        // Initializes a new Board() with no input required.
        myBoard = new Board();
        
        // Initializes playerOne and playerCricle with the names being used as
        // as a place holder.
        playerOne = new Player(myBoard.CROSS);
        playerTwo = new Player(myBoard.CIRCLE);
        
        // Used to make altering the buttons easier.
        btn_board = new JButton[9];
        
        // Counts the number of cats (ties) in the game. This is not part of the 
        // player class.
        catCounter = 0;
        
        // Fill the array of buttons with each decleared button. This could have 
        // been done autonomously but it would have taken to much time to code
        // for this project.
        btn_board[0] = btn_1;
        btn_board[1] = btn_2;
        btn_board[2] = btn_3;
        btn_board[3] = btn_4;
        btn_board[4] = btn_5;
        btn_board[5] = btn_6;
        btn_board[6] = btn_7;
        btn_board[7] = btn_8;
        btn_board[8] = btn_9;
        
        // Set the player names.
        String name;
        name = JOptionPane.showInputDialog("What is player one's name?");
        playerOne.setName(name);
        name = JOptionPane.showInputDialog("What is player two's name?");
        playerTwo.setName(name);
        
        // Make sure the playerOne is staring first, only one of these is redundant.
        playerOne.setActiveTrue(); // Redundant because of constructor
        playerTwo.setActiveFalse();
        
        // Set the counts all to the current value, should be 0.
        lbl_winsXCount.setText(playerOne.getWinCount() + "");
        lbl_winsOCount.setText(playerTwo.getWinCount() + "");
        lbl_catsCount.setText(catCounter + "");
        
        // In this case playerOne will always be the first to go, this can be
        // easily changed.
        lbl_currentPlayer.setText(playerOne.getName());
        
        // Set up the labels for the wins.
        lbl_playerOneWins.setText(playerOne.getName() + " wins:");
        lbl_playerTwoWins.setText(playerTwo.getName() + " wins:");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        lbl_playerOneWins = new javax.swing.JLabel();
        lbl_playerTwoWins = new javax.swing.JLabel();
        lbl_winsXCount = new javax.swing.JLabel();
        lbl_winsOCount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_catsCount = new javax.swing.JLabel();
        lbl_currentPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_7.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_7.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setSize(new java.awt.Dimension(30, 30));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_8.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_8.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setSize(new java.awt.Dimension(30, 30));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_9.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_9.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setSize(new java.awt.Dimension(30, 30));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_4.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_4.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setSize(new java.awt.Dimension(30, 30));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_1.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_1.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setSize(new java.awt.Dimension(30, 30));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_5.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_5.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setSize(new java.awt.Dimension(30, 30));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_2.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_2.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setSize(new java.awt.Dimension(30, 30));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_6.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_6.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setSize(new java.awt.Dimension(30, 30));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        btn_3.setMaximumSize(new java.awt.Dimension(34, 34));
        btn_3.setMinimumSize(new java.awt.Dimension(34, 34));
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setSize(new java.awt.Dimension(30, 30));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        lbl_playerOneWins.setText("Player X wins:");

        lbl_playerTwoWins.setText("Player O wins:");

        lbl_winsXCount.setText(" ");

        lbl_winsOCount.setText(" ");

        jLabel5.setText("Cats:");

        lbl_currentPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_currentPlayer.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_currentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lbl_playerTwoWins)
                            .addComponent(lbl_playerOneWins))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_winsXCount, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(lbl_winsOCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_catsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_playerOneWins)
                            .addComponent(lbl_winsXCount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_playerTwoWins)
                            .addComponent(lbl_winsOCount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbl_catsCount))
                        .addGap(92, 92, 92)
                        .addComponent(lbl_currentPlayer)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        
        addMarkToGUI(7);
        checkForWin();
        
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed

        addMarkToGUI(8);
        checkForWin();
        
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        
        addMarkToGUI(9);
        checkForWin();
        
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed

        addMarkToGUI(4);
        checkForWin();

    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed

        addMarkToGUI(5);
        checkForWin();

    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed

        addMarkToGUI(6);
        checkForWin();

    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed

        addMarkToGUI(1);
        checkForWin();

    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed

        addMarkToGUI(2);
        checkForWin();

    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed

        addMarkToGUI(3);
        checkForWin();

    }//GEN-LAST:event_btn_3ActionPerformed

    
    // Makes two dialog boxes that get the players names and set them to the player
    // object.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TicTacToeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeJFrame().setVisible(true);
            }
        });
    }
    
    /**
     * Goes through the possible win senarios. It will first check if playerTwo
     * is the player and hasThreeInRow as according to the Board class. It then does
     * the same for the playerOne. The final test is to see if there are ties. 
     * If there is any game end condition me then there is a dialog box created that
     * explains the conditions of the win and asks about starting a new game. Finally,
     * it increments the proper counts.
     */
    private void checkForWin() {
        
        // plyaerCircle win condition
        if(myBoard.hasThreeInRow(playerTwo.getToken())) {
            
            String endGame = "Player '" + playerTwo.getName() + " wins.\n"
                    + "Would you like to play another round?";
            String another = "Play Again";
            
            playerTwo.incrementWin();
            lbl_winsOCount.setText(playerTwo.getWinCount() + "");
            
            int continuePlay = JOptionPane.showConfirmDialog(
                    this, endGame, another, JOptionPane.YES_NO_OPTION);
            
            if(continuePlay == JOptionPane.YES_OPTION) {
                myBoard.resetBoard();
                resetButtons();
            } else { System.exit(0); }
            
        } 
        // playerOne win condition
        else if(myBoard.hasThreeInRow(playerOne.getToken())) {
            
            String endGame = "Player '" + playerOne.getName() + " wins.\n"
                    + "Would you like to play another round?";
            String another = "Play Again";
            
            playerOne.incrementWin();
            lbl_winsXCount.setText(playerOne.getWinCount() + "");
            
            int continuePlay = JOptionPane.showConfirmDialog(
                    this, endGame, another, JOptionPane.YES_NO_OPTION);
            
            if(continuePlay == JOptionPane.YES_OPTION) {
                myBoard.resetBoard();
                resetButtons();
            } else { System.exit(0); }
          
        } 
        // If there is a cat
        else if(!stillMovesLeft()) {
            
            String endGame = "The game has ended in a tie.\n"
                    + "Would you like to play another round?";
            String another = "Play Again";
            
            catCounter++;
            lbl_catsCount.setText(catCounter + "");
            
            int continuePlay = JOptionPane.showConfirmDialog(
                    this, endGame, another, JOptionPane.YES_NO_OPTION);
            
            if(continuePlay == JOptionPane.YES_OPTION) {
                myBoard.resetBoard();
                resetButtons();
            } else { System.exit(0); }
            
        }
        
    }
    
    /**
     * Resets the buttons to blank on the GUI.
     */
    private void resetButtons() {
        
        for(int i = 0; i < 9; i++) { btn_board[i].setText(myBoard.BLANK + ""); }
        myBoard.resetBoard();
        
    }
    
    /**
     * Checks to see if there are any possible moves left on the board.
     * 
     * @return False if there are no moves and true if there are moves.
     */
    private boolean stillMovesLeft() {

        int counter = 0;
        
        for(int i = 1; i <= 9; i++) {
            if(myBoard.isLegalMove(i)) { 
                counter++;
            }
        }
        return (counter != 0);
        
    }
    
    /**
     * Adds the current players mark to the GUI at the given location.
     * 
     * @param location This is the location that the mark should be placed at.
     */
    private void addMarkToGUI(int location) {
                
        if(myBoard.isLegalMove(location) && playerOne.getActiveStatus()) {
            btn_board[location - 1].setText(playerOne.getToken() + "");
            myBoard.placeMarkAt(location, playerOne.getToken());
            playerOne.setActiveFalse();
            playerTwo.setActiveTrue();
            lbl_currentPlayer.setText(playerTwo.getName());
            
        } else if(myBoard.isLegalMove(location)) {
            btn_board[location - 1].setText(playerTwo.getToken() + "");
            myBoard.placeMarkAt(location, playerTwo.getToken());
            playerTwo.setActiveFalse();
            playerOne.setActiveTrue();
            lbl_currentPlayer.setText(playerOne.getName());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_catsCount;
    private javax.swing.JLabel lbl_currentPlayer;
    private javax.swing.JLabel lbl_playerOneWins;
    private javax.swing.JLabel lbl_playerTwoWins;
    private javax.swing.JLabel lbl_winsOCount;
    private javax.swing.JLabel lbl_winsXCount;
    // End of variables declaration//GEN-END:variables
}