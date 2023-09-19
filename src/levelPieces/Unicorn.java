//piece that moves player to next level
//moveable, interactive

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Unicorn extends GamePiece implements Moveable {

    // constructor
    public Unicorn(int location) {
        super('U', "Unicorn", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        // moves forward and backward two at a time. moves forward until it reaches the
        // end of the board. then moves backward until it reaches the beginning of the
        // board.
        if (getLocation() + 2 < gameBoard.length) {
            setLocation(getLocation() + 2);
        } else {
            setLocation(getLocation() - 2);
        }
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.ADVANCE;
        }

        return InteractionResult.NONE;
    }

}
