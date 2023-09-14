//Implements moveable, is not random movement. Algorithm 1
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class PieceFour extends GamePiece implements Moveable {

    // constructor
    public PieceFour(int location) {
        super('1', "PieceFour", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {

    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }

}
