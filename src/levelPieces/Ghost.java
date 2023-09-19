//Moveable as well, algorithm 2
//moves away from player, is scared of them! 

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Ghost extends GamePiece implements Moveable {

    // constructor
    public Ghost(int location) {
        super('G', "Ghost", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation < getLocation()) {
            // move right
            gameBoard[getLocation()] = null;
            setLocation(getLocation() + 1);
            gameBoard[getLocation()] = this;
        } else if (playerLocation > getLocation()) {
            // move left
            gameBoard[getLocation()] = null;
            setLocation(getLocation() - 1);
            gameBoard[getLocation()] = this;
        }
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.HIT;
        }

        return InteractionResult.NONE;
    }

}
