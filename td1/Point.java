package fr.dauphine.javaavance.td1;

public class Point {
	
	private static int ptr = 0;
	private final int x;
	private final int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
		ptr++;
	}

	public Point(int px, int py) {
		ptr++;
		this.x = px;
		this.y = py;
	}
	
	public Point(Point p2) {
		ptr++;
		this.x = p2.x;
		this.y = p2.y;
	}
	
	public void question1() {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
	}
	
	static final int getNbPoint() {
		return ptr;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "("+ this.x + "," + this.y + ")";
	}
	
	public boolean isSameAs(Point p) {
		return (this.x == p.x) && (this.y == p.y);
	}
	
	@Override
	public boolean equals(Object objet) {
		if(this==objet) return true;
		if(!(objet instanceof Point)) return false;
		Point p = (Point) objet;
		return x==p.x && y==p.y;
	}
	
	public Point translate(int dx, int dy) {
		return new Point(x+dx, y+dy);
	}

}
