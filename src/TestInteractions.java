
//testing junit stuff interactions
//Katie Bruce (Student)
//Rachel Castro (Student)
//Thu 9/21/2023 11:54 AM



import static org.junit.jupiter.api.Assertions.*; 


import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Cavalry;
import levelPieces.Ghost;
import levelPieces.Hitter;
import levelPieces.Killer;
import levelPieces.Token;
import levelPieces.Unicorn;

class TestInteractions {
	//Cavalry
	//Ghost
	//Hitter
	
	
	//Killer
	@Test
	public void testKillerInteraction() {
		Drawable[] gameBoard = new Drawable[20]; 
		Killer killer = new Killer(0); 
		gameBoard[0] = killer;
		
		//killer generates random number, accessible by getRandReturn. if the player is 
		//on that square, they die. 
		//However if killer is on the same square as the player, the player gets a point.
		
		assertEquals(InteractionResult.GET_POINT, killer.interact(gameBoard, 0));
		
		
		assertEquals(InteractionResult.KILL, killer.interact(gameBoard, killer.getRandReturn())); 
		
	}
	
	


        /*
         * Test that Calvary hits player (interaction) only when player is one space away
        */
        @Test
	public void testCalvary() {
		//new gameboard with Calvary at space 10
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Cavalry c = new Cavalry(10);
		gameBoard[10] = c;
		// Hit points if player on adjacent space
		assertEquals(InteractionResult.HIT, c.interact(gameBoard, 9));
		assertEquals(InteractionResult.HIT, c.interact(gameBoard, 11));
		//No interaction if on same space
		assertEquals(InteractionResult.NONE, c.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<9; i++)
			assertEquals(InteractionResult.NONE, c.interact(gameBoard, i));
		for (int i=12; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, c.interact(gameBoard, i));
	}

	        /*
         * Test that Ghost hits player (interaction) only when player in same location
        */
        @Test
	public void testGhost() {
		//new gameboard with Ghost at space 10
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Ghost g = new Ghost(10);
		gameBoard[10] = g;
		// Hit points if player on same space
		assertEquals(InteractionResult.HIT, g.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, g.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, g.interact(gameBoard, i));
	}


	        /*
         * Test that Hitter hits player (interaction) only when player in same location
        */
        @Test
	public void testHitter() {
		//new gameboard with Hitter at space 10
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Hitter h = new Hitter(10);
		gameBoard[10] = h;
		// Hit points if player on same space
		assertEquals(InteractionResult.HIT, h.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, h.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, h.interact(gameBoard, i));
	}

	        /*
         * Test that Token gives point to player (interaction) only when player in same location
        */
        @Test
	public void testToken() {
		//new gameboard with Token at space 10
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Token t = new Token(10);
		gameBoard[10] = t;
		// Get points if player on same space
		assertEquals(InteractionResult.GET_POINT, t.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, t.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, t.interact(gameBoard, i));
	}

		        /*
         * Test that Unicorn advances player (interaction) only when player in same location
        */
        @Test
	public void testUnicorn() {
		//new gameboard with Unicorn at space 10
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Unicorn u = new Unicorn(10);
		gameBoard[10] = u;
		// Advances if player on same space
		assertEquals(InteractionResult.ADVANCE, u.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, u.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, u.interact(gameBoard, i));
	}

	
	
	

}
