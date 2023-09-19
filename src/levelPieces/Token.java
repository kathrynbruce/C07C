//Non movable, just drawable one. 
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;



public class Token extends GamePiece{

    // constructor
    public Token(int location) {
        super('T', "Token", location);
    }

    public void draw() {
        System.out.print('T');
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        //if location is same as player location, token is removed from board and player gets point
        if (playerLocation == getLocation()) {
            //token removed from board
            gameBoard[getLocation()] = null;
            setLocation(-1);
            //player gets point
            return InteractionResult.GET_POINT;
        }
        //else: nothing happens
        return InteractionResult.NONE;
    }

    //toString method
    public String toString(){
        return("T - Token (draw token to gain point)");
    }
}
