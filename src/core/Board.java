package core;

public class Board {
	protected Cell[] battleField;
	protected int size; 
	/**
	 * Initialize the game board 
	 * @param size Use to extend the game, default is 4. 
	 */
	public Board(int size){
		this.size = size;
		int outerBoardSize = (this.size*3+1)*4;
		int finalStage = 6;
		
		//initialize board
		for(int i = 0; i < outerBoardSize; i+=4){
			for(int j = 0; j < 3; j++){
				battleField[i+j] = new Cell(j, size);
			}
		}
		
		//initialize big jumps
		int numOfBigJumps = 4;
		int jumpLocationIndex = size;
		for(int i = 1; i<numOfBigJumps;  i++){
			battleField[jumpLocationIndex].setBigJump();
			jumpLocationIndex = jumpLocationIndex+3*size+1;
		}
		//initialize the endPoint
		int endPointLocation = size*2+1;
		for(int i = 0; i<4; i++){
			
			battleField[endPointLocation].setEndPoint();
			endPointLocation += endPointLocation;
		}
		
	}
	
	// Constructor for final stage
	protected Board(){
		this(4);
	}
	
}
