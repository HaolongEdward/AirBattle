package core;

public class Aircraft {
	private int location;
	private int destination;
	private boolean departed;
	protected Aircraft(int location, int destination){
		
		this.location = location;
		this.destination = destination;
		departed = false;
	}
	
	public void fly(int forward){
		this.location += forward;
	}
	
	public void readyForDepart(){
		this.departed = true;
	}
	
	public int getLocation(){
		return this.location;
	}
	
	public int getDestination(){
		return this.destination;
	}
}
