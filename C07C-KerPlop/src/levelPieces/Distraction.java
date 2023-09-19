//doesn't move, no interaction
package levelPieces;

import gameEngine.Drawable;

public class Distraction implements Drawable {

    // inhereted methods
    @Override
    public void draw() {
        System.out.print('d');
    }

    public Distraction(int location) {
        char symbol = 'd';
    }

    // toString
    @Override
    public String toString() {
        return ("d - Distraction (does nothing, no interactions)");
    }
}
