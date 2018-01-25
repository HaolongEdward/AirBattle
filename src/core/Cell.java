package core;

public class Cell {
	private int color;
//	private int index;
	private int teleportAhead;
	private boolean endPoint;
	private int size;
	private Aircraft occupiedBy;
	protected Cell(int color, int size){
		this.color = color;
		this.teleportAhead = size;
		this.size = size;
	}
	
	protected int getColor(){
		return this.color;
	}
	
	protected int teleportTo(){
		return teleportAhead;
	}
	
	protected void setEndPoint(){
		endPoint = true;
	}
	
	protected void setBigJump(){
		this.teleportAhead = 3*size;
	}
}
