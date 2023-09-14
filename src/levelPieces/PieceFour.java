package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PieceFour extends GamePiece {

    // constructor
    public PieceFour(int location) {
        super('1', "PieceFour", location);
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
