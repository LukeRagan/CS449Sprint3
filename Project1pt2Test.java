package newproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class Project1pt2Test {

	
	@Test
    public void testIsBoardFullWhenBoardIsNotFull() {
        Project1pt2 project = new Project1pt2();
        String[][] partiallyFilledBoard = new String[7][7]; // Replace with your board size
        partiallyFilledBoard[0][0] = "S";
        partiallyFilledBoard[1][1] = "O";
        boolean result = project.isBoardFull(partiallyFilledBoard);
        assertFalse(result);
    }
	@Test
    public void testIsBoardFullWhenBoardIsFull() {
        Project1pt2 project = new Project1pt2();
        String[][] fullBoard = new String[7][7]; // Replace with your board size
        // Fill the entire board
        for (int i = 0; i < fullBoard.length; i++) {
            for (int j = 0; j < fullBoard[0].length; j++) {
                fullBoard[i][j] = "S";
            }
        }
        boolean result = project.isBoardFull(fullBoard);
        assertTrue(result);
    }

}
