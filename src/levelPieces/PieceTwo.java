package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PieceTwo extends GamePiece {

    // constructor
    public PieceTwo(int location) {
        super('1', "PieceTwo", location);
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
