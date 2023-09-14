//Moveable as well, algorithm 2

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class PieceThree extends GamePiece implements Moveable {

    // constructor
    public PieceThree(int location) {
        super('1', "PieceThree", location);
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
