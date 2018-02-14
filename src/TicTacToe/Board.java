/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 * <p> Creates a board for the game tic-tac-toe </p>
 * 
 * <p> Author: Joe Runser </p>
 * <p> Version: 1.0 - 11 February 2017 </p>
 * 
 * @author Joe Runser
 * @version 1.0 - 2 February 2017
 */
public class Board {
    
    /** 
     * The value of an empty (blank) cell.
     */
    public final char BLANK  = ' ';
    /** 
     * The value of a cell that contains a circle.
     */
    public final char CIRCLE = 'O'; // tested
    /** 
     * The value of a cell that contains a cross. 
     */
    public final char CROSS  = 'X'; // tested
    
    // Holds the current values of each element in the board.
    private final char board[] = new char[9];
    
    /** 
     * Creates a new Tic-Tac-Toe board with all blank cells. 
     */
    public Board() {
        
        for(int i = 0; i < 9; i++) {
            board[i] = BLANK;
        }
        
    }
    
    /**
     * Retrieves the mark at the indicated cell location. Keep in mind that the 
     * input is not vetted.
     * 
     * @param location Indicates the possible cell locations which can be 1 to 9.
     * @return The marks that can be stored at each location are BLANK, CIRCLE, 
     * or CROSS.
     */
    public char getMarkAt(int location) {
        
        return board[location - 1];
        
    }
    
    /**
     * Looks for three in a row in showing a Tic-Tac-Toe. Keep in mind that the 
     * input is not vetted.
     * 
     * @param mark The mark for which the win is bing looked for.
     * @return If a win is found it will return true and false if otherwise.
     */
    public boolean hasThreeInRow(char mark) {
        
        // Vertical win
        if     (board[6] == mark && board[7] == mark && board[8] == mark) { return true; }
        else if(board[3] == mark && board[4] == mark && board[5] == mark) { return true; }
        else if(board[0] == mark && board[1] == mark && board[2] == mark) { return true; }
        // Horizontal win
        else if(board[0] == mark && board[3] == mark && board[6] == mark) { return true; }
        else if(board[1] == mark && board[4] == mark && board[7] == mark) { return true; }
        else if(board[2] == mark && board[5] == mark && board[8] == mark) { return true; }
        // Angle win
        else if(board[0] == mark && board[4] == mark && board[8] == mark) { return true; }
        else if(board[2] == mark && board[4] == mark && board[6] == mark) { return true; }
        // Not win
        else { return false; }
    }
    
    /**
     * This will test if a mark can be played on the specified cell location. The
     * input is not vetted.
     * 
     * @param location Indicates the possible cell locations which can be 1 to 9.
     * @return Will be true if the location is found to be a legal 'MOO've otherwise
     * it will return false.
     */
    public boolean isLegalMove(int location) {
        
        return board[location - 1] == BLANK;
        
    }
    
    /**
     * This will place a mark on the specified cell location. The input is not vetted.
     * 
     * @param location Indicates the possible cell locations which can be 1 to 9.
     * @param mark Indicates which mark it should be (BLANK, CROSS, OR CIRCLE).
     * @return It is true if the value of the cell is changed and false if otherwise. 
     */
    public boolean placeMarkAt(int location, char mark) {
        
        if(isLegalMove(location)) { 
            board[location - 1] = mark;
            return true;
        }
        
        return false;
    }
    
    /**
     * Resets to board to empty.
     */
    public void resetBoard() {
        
        for(int i = 0; i < 9; i++) {
            board[i] = BLANK;
        }
        
    }
    
}
