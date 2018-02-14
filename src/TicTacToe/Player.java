/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 * Creates a general player object and gives the ability to keep track of which 
 * players are active, the players name, and a win count for the players.
 * 
 * @author Joe Runser
 * @version 1.0 - 11 February 2017
 */
public class Player {
    
    private String name;
    private final char token;
    private boolean activeStatus;
    private int winCount;

    /**
     * Initializes a new player as an active player, gives a name, a token, and 
     * sets a win count to 0.
     * 
     * @param playerToken the object that represents the player in their respective
     * game.
     * @param playerName the name of the player.
     */
    Player(char playerToken) {
        
        this.token = playerToken;
        
        activeStatus = true;
        winCount = 0;
        
    }
    
    /**
     * Sets the player an inactive player. To get the output of this use getActiveStatus().
     */
    public void setActiveFalse() {
        activeStatus = false;
    }
    
    /**
     * Sets the player an active player. To get the output of this use getActiveStatus().
     */
    public void setActiveTrue() {
        activeStatus = true;
    }
    
    /**
     * Determines the current status of the player. The status can be set using 
     * either setActiveTrue() or setActiveFalse().
     * 
     * @return true if the player is currently active or false if the players is 
     * currently set to inactive.
     */
    public boolean getActiveStatus() {
        return activeStatus;
    }
    
    /**
     * The token is set upon initialization. There is a possibility that there will
     * be a setToken() method added.
     * 
     * @return The token of the player that was set but the user.
     */
    public char getToken() { 
        return token;
    }
    
    /**
     * increments and sets the winCount.
     */
    public void incrementWin() {
        winCount++;
    }
    
    /**
     * This an getter for incrementWin().
     * 
     * @return Will return the number of wins that the player has achieved.
     */
    public int getWinCount() {
        return winCount;
    }
    
    /**
     * A getter that returns the name set at initialization. There may be a setName()
     * method created in the future but there is not currently a use for it.
     * 
     * @return Will return the name of the player.
     */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
