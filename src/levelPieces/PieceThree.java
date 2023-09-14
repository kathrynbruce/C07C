package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PieceThree extends GamePiece {

    // constructor
    public PieceThree(int location) {
        super('1', "PieceThree", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }

}
