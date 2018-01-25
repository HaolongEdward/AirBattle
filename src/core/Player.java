package core;

public class Player {
	private int flightNum;
	private Aircraft[] team;
	
	public Player(int flightNum, int startPoint, int destination){
		this.flightNum = flightNum;
		
		for(int i = 0; i<this.flightNum; i++){
			team[i] = new Aircraft(startPoint, destination);
		}
	}
	
	
}
