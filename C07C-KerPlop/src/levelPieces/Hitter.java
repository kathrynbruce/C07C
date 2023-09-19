//Implements Moveable, random movement
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random;//for random movement


public class Hitter extends GamePiece implements Moveable {

    // constructor
    public Hitter(int location) {
        super('H', "Hitter", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        //picks random new location from board
        Random random = new Random();
        int newLocation = random.nextInt(gameBoard.length);
        setLocation(newLocation);
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == this.getLocation()){
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }

    @Override
    public String toString(){
        return("H - Hitter (moves randomly and if hits same location as player, player gains damage points)");
    }
}
