You have just been hired by the KP game company to replace a recently fired programmer, a Mister MxyzptlkLinks to an external site..   You have a working version of the game (KerPlop.jar Download KerPlop.jar) but much of the code is missing.   Your job is you choose to accept it is to get the game working again, and make changes such that we do not directly copy Mister Mxyzptlk's missing design.

Here are some of our specific goals:

Gain experience in reading other people's code
Begin to understand interfaces
Practice creating a hierarchy of classes
Practice UML
Practice pair programming. 

At least 5 pieces that interact (i.e., extend GamePiece) [30pts].

Include at least one for each type of InteractionResult
HIT, KILL, ADVANCE, GET_POINT, NONE
HIT - HITTER (MOVEABLE - RANDOM MOTION)
KILL - KILLER (MOVEABLE - TOWARDS PLAYER)
ADVANCE - Player (MOVEABLE - INPUT)
GET POINT - TOKEN (STAYS IN SAME SPACE, DRAWABLE, GOES TO LEVEL 2)
NONE - DISTRACTION (DOES NOTHING, RANDOM SPACE AND STAYS)

At least one piece should interact at a distance
OBSTACLE - can harm player from a distance - hits random space
and if hits player they lose a turn?

At most 3 can interact only when on the same square
TOKEN, HITTER, KILLER 

At least 2 pieces that move (implement Moveable) [15pts].
PLAYER AND KILLER - one piece 

Use at least 2 different move algorithms
MOVE BY KEY INPUT (PLAYER) AND MOVE BY FOLLOWING PLAYER (KILLER)

At least 1 should include some type of random decision/motion
HITTER

At least 1 piece should only be Drawable (i.e., not a GamePiece) [5pts]
TOKEN

You must have at least two levels. [10pts]
DOUBLE THE NUMBER OF HITTERS

UML for your program as a .png [10pts]
TO BE determined

Text file clearly describes how your pieces meet the requirements. [10pts]
THIS FILE 

ADD GITLOG AT END