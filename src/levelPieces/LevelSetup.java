package levelPieces;

import java.util.ArrayList;
import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
    ArrayList<Moveable> movingPieces;
    ArrayList<GamePiece> interactingPieces;
    Drawable[] gameBoard;

    public void createLevel(int levelNum) {
        movingPieces = new ArrayList<Moveable>();
        interactingPieces = new ArrayList<GamePiece>();
        // setup game board
        gameBoard = new Drawable[20];

        // level 1: easy peasy
        if (levelNum == 1) {

            // add drawable piece
            gameBoard[5] = new Token(5);
            gameBoard[19] = new Distraction(19);

            // add interacting pieces
            gameBoard[15] = new Unicorn(15);
            gameBoard[7] = new Ghost(7);
            gameBoard[9] = new Ghost(9);
            gameBoard[12] = new Cavalry(12);

            // put them in arrays
            interactingPieces.add((GamePiece) gameBoard[15]);
            interactingPieces.add((GamePiece) gameBoard[7]);
            interactingPieces.add((GamePiece) gameBoard[9]);
            interactingPieces.add((GamePiece) gameBoard[12]);
            movingPieces.add((Moveable) gameBoard[15]);
            movingPieces.add((Moveable) gameBoard[7]);
            movingPieces.add((Moveable) gameBoard[9]);
            movingPieces.add((Moveable) gameBoard[12]);

        }

        // level 2: death
        if (levelNum == 2) {
            // add drawable pieces
            gameBoard[0] = new Token(0);
            gameBoard[19] = new Token(19);

            // add interactive/moving pieces
            gameBoard[5] = new Unicorn(5);
            gameBoard[7] = new Ghost(7);
            gameBoard[9] = new Ghost(9);
            gameBoard[6] = new Killer(6);
            gameBoard[20] = new Killer(8);
            gameBoard[12] = new Cavalry(12);

            // add to arrays
            interactingPieces.add((GamePiece) gameBoard[5]);
            interactingPieces.add((GamePiece) gameBoard[7]);
            interactingPieces.add((GamePiece) gameBoard[9]);
            interactingPieces.add((GamePiece) gameBoard[6]);
            interactingPieces.add((GamePiece) gameBoard[20]);
            interactingPieces.add((GamePiece) gameBoard[12]);
            movingPieces.add((Moveable) gameBoard[5]);
            movingPieces.add((Moveable) gameBoard[7]);
            movingPieces.add((Moveable) gameBoard[9]);
            movingPieces.add((Moveable) gameBoard[6]);
            movingPieces.add((Moveable) gameBoard[8]);
            movingPieces.add((Moveable) gameBoard[12]);

        }
    }

    public Drawable[] getBoard() {
        return gameBoard;
    }

    public ArrayList<Moveable> getMovingPieces() {
        return movingPieces;
    }

    public ArrayList<GamePiece> getInteractingPieces() {
        return interactingPieces;
    }

    public int getPlayerStartLoc() {
        return 0;
    }
}
