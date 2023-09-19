//Implements moveable, is not random movement. Algorithm 1
//interacts at a distance of 1 
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Cavalry extends GamePiece implements Moveable {

    // constructor
    public Cavalry(int location) {
        super('C', "Cavalry", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        if (getLocation() < playerLocation) {
            // move right
            gameBoard[getLocation()] = null;
            setLocation(getLocation() + 1);
            gameBoard[getLocation()] = this;
        } else if (getLocation() > playerLocation) {
            // move left
            gameBoard[getLocation()] = null;
            setLocation(getLocation() - 1);
            gameBoard[getLocation()] = this;
        }
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation() + 1 || playerLocation == getLocation() - 1) {
            return InteractionResult.HIT;
        } else if (playerLocation == getLocation()) {
            // remove from board
            gameBoard[getLocation()] = null;
            setLocation(-1);

            return InteractionResult.NONE;
        }
        return InteractionResult.NONE;
    }

}
