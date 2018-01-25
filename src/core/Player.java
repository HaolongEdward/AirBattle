package core;

public class Player {
	private int flightNum;
	private Aircraft[] team;
	private int arrived;
	
	public Player(int flightNum, int startPoint, int destination){
		this.flightNum = flightNum;
		arrived = 0;
		for(int i = 0; i<this.flightNum; i++){
			team[i] = new Aircraft(startPoint, destination);
		}
	}
	
	public void Arrived(){
		arrived++;
	}
	
	
}
