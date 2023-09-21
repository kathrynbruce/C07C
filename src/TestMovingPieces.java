import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList; 

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import levelPieces.Cavalry;
import levelPieces.Hitter;

class TestMovingPieces {

	//test to check that algorithmic movement works
	//Cavalry always moves towards player
	@Test
	void testAlgorithmicMovement() {
		Drawable[] gameBoard = new Drawable[20]; 
		Cavalry testCav = new Cavalry(0); 
		gameBoard[0] = testCav;
		
		//check cavalry moves towards player.
		int previous = 0; 
		for (int i = 0; i < 10; i++ ) {
			testCav.move(gameBoard, 20);
			int loc = testCav.getLocation();
			assert(loc > previous);
			previous = loc; 
		}	
	}
	
	
	//test to ensure random movement works--hits every space at least once
	@Test
	void testRandomMovement() {
		Drawable[] gameBoard = new Drawable[10]; 
		Hitter testHitter = new Hitter(0); 
		gameBoard[0] = testHitter;
		
		//create hashtable to ensure each spot is hit at least once.
		ArrayList<Integer> hashtable = new ArrayList<Integer>(); 
		for (int i = 1; i < 11; i++) {
			hashtable.add(0);
		}
		for (int j = 1; j< 200; j++) {
			testHitter.move(gameBoard, j);
			int loc = testHitter.getLocation();
			hashtable.set(loc, 1); 
		}
		for (int k = 1; k < 10; k++) {
			assertEquals(hashtable.get(k), 1); 
		}	
				
	}

}
