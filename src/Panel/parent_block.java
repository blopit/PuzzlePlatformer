package Panel;

public class parent_block extends Object {
	
	private int depth;
	protected double x;
	protected double y;
	protected double hsp;
	protected double vsp;
	protected double hacc;
	protected double vacc;
	protected int width;
	protected int height;
	
	public parent_block(double x1, double y1, int w, int h){
		setDepth(0);
    	width = w;
    	height = h;
		x = x1;
		y = y1;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getVsp() {
		return vsp;
	}
	public void setVsp(double vsp) {
		this.vsp = vsp;
	}
	public double getHsp() {
		return hsp;
	}
	public void setHsp(double hsp) {
		this.hsp = hsp;
	}
	public double getVacc() {
		return vacc;
	}
	public void setVacc(double vacc) {
		this.vacc = vacc;
	}
	public double getHacc() {
		return hacc;
	}
	public void setHacc(double hacc) {
		this.hacc = hacc;
	}
}
