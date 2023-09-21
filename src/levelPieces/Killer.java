package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Killer extends GamePiece implements Moveable {
	//random val to return for testing purposes
	int rand_return = 6; 
	

    // constructor
    public Killer(int location) {
        super('K', "Killer", location);
    }

    // inhereted methods
    @Override
    public void draw() {
        System.out.print(this.symbol);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        // only moves forward.
        setLocation(getLocation() + 1);
        gameBoard[getLocation()] = this;
    }
    
    public int getRandReturn() {
    	return rand_return; 
    }

    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // generates a location
        int random = (int) (Math.random() * 20);
        random = 6; 
        
        // if the player is at that location, they die
        if (playerLocation == random) {
            return InteractionResult.KILL;
        }

        // if the player is in the same place as the killer, they get a point.
        if (playerLocation == getLocation()) {
            return InteractionResult.GET_POINT;
        }
        return InteractionResult.NONE;
    }
    
    
}




