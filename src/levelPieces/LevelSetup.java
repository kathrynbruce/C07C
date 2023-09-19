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

            // add interacting pieces
            gameBoard[0] = new Unicorn(0);
            gameBoard[7] = new Ghost(7);
            gameBoard[9] = new Ghost(9);
            gameBoard[12] = new Cavalry(12);

            // put them in arrays
            interactingPieces.add((GamePiece) gameBoard[0]);
            interactingPieces.add((GamePiece) gameBoard[7]);
            interactingPieces.add((GamePiece) gameBoard[9]);
            interactingPieces.add((GamePiece) gameBoard[12]);
            movingPieces.add((Moveable) gameBoard[0]);
            movingPieces.add((Moveable) gameBoard[7]);
            movingPieces.add((Moveable) gameBoard[9]);
            movingPieces.add((Moveable) gameBoard[12]);

        }

        // level 2: death
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
