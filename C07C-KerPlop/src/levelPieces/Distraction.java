//doesn't move, no interaction
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Distraction extends GamePiece {

    // constructor
    public Distraction(int location) {
        super('d', "Distraction", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }
    
    //toString
    public String toString(){
        return("d - Distraction (does nothing, no interactions)");
    }
}
