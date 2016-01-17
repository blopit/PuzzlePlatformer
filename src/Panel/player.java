package Panel;

import java.util.ArrayList;
import java.util.Arrays;
 


public class player extends parent_block {
	
	int R = 48;
	int detail = 32;
	
	private double gravity = 0.5;
	private double jumpspeed = -9;
	private double walkspeed = 3;
	
	public player(double x1, double y1){
		super(x1+2,y1+2,28,28); 
		setDepth(11);
	}
	
	public double getGravity() {
		return gravity;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	public double getJumpspeed() {
		return jumpspeed;
	}
	public void setJumpspeed(double jumpspeed) {
		this.jumpspeed = jumpspeed;
	}
	public double getWalkspeed() {
		return walkspeed;
	}
	public void setWalkspeed(double walkspeed) {
		this.walkspeed = walkspeed;
	}

} 
 
