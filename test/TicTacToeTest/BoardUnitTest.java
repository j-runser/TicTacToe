/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeTest;

import TicTacToe.Board;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Used to test the Board Class in the TicTacToe project. This version of BoardUnitTest
 * is meant to work with the corresponding version of the Board.
 * 
 * @author Joe Runser
 * @version 1.0 - 3 February 2017
 */
public class BoardUnitTest {
    
    /**
     * Test to make sure that getMarkAt() is working correctly and to be sure that
     * the Board Class is initializing properly. If the board is initialized properly
     * then each getMarkAt() will show that there is the BLANK mark at each location 
     * on the board. It also does a quick test to make sure that BLANK, CIRCLE, and
     * CROSS contain the correct values.
     */
    @Test
    public void test_getMarkAt() {
        
        Board test_Board = new Board();
        
        assertEquals(' ', test_Board.BLANK);
        assertEquals('O', test_Board.CIRCLE);
        assertEquals('X', test_Board.CROSS);
        
        for(int i = 1; i < 9; i++) {
            assertEquals(test_Board.BLANK, test_Board.getMarkAt(i));
        }
        
    }
    
    /**
     * Test to make sure that placeMarkAt() is working correctly. It uses placeMarkAt()
     * to put the CIRCLE mark at every location on the board. After every circle 
     * is placed it uses getMarkAt() to make sure that each location still contains
     * the CIRCLE mark.
     */
    @Test
    public void test_placeMarkAt() {
        
        Board test_Board = new Board();
        
        // Loads the board with CIRCLE marks.
        for(int i = 1; i < 9; i++) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
        }
        for(int i = 1; i < 9; i++) {
            assertEquals(test_Board.CIRCLE, test_Board.getMarkAt(i));
        }
        
    }
    
    /**
     * Tests to make sure that isLeagalMove() is working properly. Assuming 
     * test_getMarkAt() has been used, this will check to make sure the initialized 
     * setting returns all legal moves.
     * 2: Then, it will fill the entire board with a mix of CIRCLE and CROSS marks.
     * 3: Finally, it tests each board location to make sure that all of the locations
     * are illegal moves.
     */
    @Test
    public void test_isLeagalMoveTrue() {
        
        Board test_Board = new Board();
        
        // 1: Checks to make sure that every location on the board is a legal move
        for(int i = 1; i < 9; i++) {
            assertTrue(test_Board.isLegalMove(i));
        }
        // 2: Fills the board up with CIRCLE and CROSS marks
        for(int i = 1; i < 9; i++) {
            if     ((i % 2) == 0) { test_Board.placeMarkAt(i, test_Board.CIRCLE); }
            else if((i % 2) == 1) { test_Board.placeMarkAt(i, test_Board.CROSS); }
        }
        // 3: Test each board location to make sure it returns false (illegal move).
        for(int i = 1; i < 9; i++) {
            assertFalse(test_Board.isLegalMove(i));
        }
        
    }
    
    /**
     * Tests to make sure that isLeagalMove() is working properly. Assuming placeMarkAt()
     * is working properly it will fill the entire board with a mix of CIRCLE and 
     * CROSS marks. Then, it tests each board location to make sure that all of the 
     * locations are illegal moves.
     */
    @Test
    public void test_isLegalMoveFalse() {
        
        Board test_Board = new Board();
        
        // Fills the board up with CIRCLE and CROSS marks
        for(int i = 1; i < 9; i++) {
            if     ((i % 2) == 0) { test_Board.placeMarkAt(i, test_Board.CIRCLE); }
            else if((i % 2) == 1) { test_Board.placeMarkAt(i, test_Board.CROSS); }
        }
        // Test each board location to make sure it returns false (illegal move).
        for(int i = 1; i < 9; i++) {
            assertFalse(test_Board.isLegalMove(i));
        }
    }
    
    /**
     * Tests to make sure resetBoard() is working properly. This test will only work
     * properly if CIRCLE, CROSS, placeMarkAt(), and isLegalMove() have already been
     * tested.
     * 1: Fill the board with CROSS and CIRCLE marks. Assuming placeMarkAt() has
     * been tested this will work.
     * 2: Reset the board using resetBoard().
     * 3: Check to make sure that every location on the board is a legal move. If
     * every location is legal it will show that the board has been cleared.
     */
    @Test
    public void test_resetBoard() {
        
        Board test_Board =  new Board();
        
        // 1: Fill the board with CROSS and CIRCLE marks.
        for(int i = 1; i < 9; i++) {
            if     ((i % 2) == 0) { test_Board.placeMarkAt(i, test_Board.CIRCLE); }
            else if((i % 2) == 1) { test_Board.placeMarkAt(i, test_Board.CROSS); }
        }
        
        // 2: Reset the board to all BLANK marks.
        test_Board.resetBoard();
        
        // 3: Checks to make sure all locations are leagal 'MOO'ves.
        for(int i = 1; i < 9; i++) {
            assertTrue(test_Board.isLegalMove(i));
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 3, 6, and 9. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowVerticalThree() {
        
        Board test_Board = new Board();
        
        for(int i = 3; i < 9; i += 3) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 9) { 
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
            }
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 2, 5, and 8. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowVerticalTwo() {
        
        Board test_Board  = new Board();
        
        for(int i = 2; i < 9; i += 3) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 8) { 
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
            }
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 1, 4, and 7. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowVerticalOne() {
        
        Board test_Board  = new Board();
        
        for(int i = 1; i < 9; i += 3) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 7) { 
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
                break;
            }
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 1, 2, and 3. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowHorizontalOne() {
        
        Board test_Board  = new Board();
        
        for(int i = 1; i < 9; i++) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 3){
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
                break;
            }
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 4, 5, and 6. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowHorizontalTwo() {
        
        Board test_Board  = new Board();
        
        for(int i = 4; i < 9; i++) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 6){
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
                break;
            }
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 7, 8, and 9. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowHorizontalThree() {
        
        Board test_Board  = new Board();
        
        for(int i = 7; i < 9; i++) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 9){
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
                break;
            }
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 1, 5, and 9. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowAngleOne() {
        
        Board test_Board  = new Board();
        
        for(int i = 1; i < 9; i += 4) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 9){
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
                break;
            } 
        }
        
    }
    
    /**
     * Will test if the if there is three marks in a row at the points 3, 5, and 7. 
     * This is assuming placeMarkAt() is working.
     */
    @Test
    public void test_hasThreeInRowAngleTwo() {
        
        Board test_Board  = new Board();
        
        for(int i = 3; i < 9; i += 2) {
            test_Board.placeMarkAt(i, test_Board.CIRCLE);
            if(i == 9){
                assertTrue(test_Board.hasThreeInRow(test_Board.CIRCLE));
                test_Board.resetBoard();
                break;
            } 
        }
        
    }
    
    /**
     * Will test if there is not a legal move. If there is not then it is working
     * correctly. It uses CIRCLE as the mark.
     */
    @Test
    public void test_hasThreeInRowFalseCircle() {
        
        Board test_Board  = new Board();
        
        assertFalse(test_Board.hasThreeInRow(test_Board.CIRCLE));
    }
    
    /**
     * Will test if there is not a legal move. If there is not then it is working
     * correctly. It uses CROSS as the mark.
     */
    @Test
    public void test_hasThreeInRowFalseCross() {
        
        Board test_Board  = new Board();
        
        assertFalse(test_Board.hasThreeInRow(test_Board.CROSS));
    }
    
}
