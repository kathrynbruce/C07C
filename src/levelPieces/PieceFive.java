package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PieceFive extends GamePiece {

    // constructor
    public PieceFive(int location) {
        super('1', "PieceFive", location);
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
