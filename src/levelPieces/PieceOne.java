//Implements Moveable, random movement
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class PieceOne extends GamePiece implements Moveable {

    // constructor
    public PieceOne(int location) {
        super('1', "PieceOne", location);
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
