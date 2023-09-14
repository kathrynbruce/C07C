package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PieceOne extends GamePiece {

    // constructor
    public PieceOne(int location) {
        super('1', "PieceOne", location);
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
