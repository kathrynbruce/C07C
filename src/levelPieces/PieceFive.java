//Non movable, just drawable one. 
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class PieceFive implements Drawable {

    // constructor
    public PieceFive(int location) {
        return;
    }

    public void draw() {
        System.out.print('5');
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }

}
