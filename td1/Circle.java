package fr.dauphine.javaavance.td1;

public class Circle {
	private final Point centre;
	private final int radius;
	
	public Circle() {
		this.centre = new Point(1,1);
		this.radius = 1;
	}
	
	public Circle(Point p, int r) {
		this.centre = p;
		this.radius = r;
	}
	
	public Circle translate(int dx, int dy) {
		return new Circle(centre.translate(dx, dy),radius);
	}
	
	public Point getCenter() {
		return this.centre;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public double area() {
		return Math.pow(radius, 2)* Math.PI;
	}
	
	public boolean contains(Point p) {
		double distance_p = Math.sqrt(Math.pow((p.getX()-centre.getX()),2) + Math.pow((p.getY()-centre.getY()),2) );
		if(distance_p<=radius) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Circle[] circles) {
		for(Circle c : circles) {
			if(c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object objet) {
		if(this==objet) return true;
		if(!(objet instanceof Circle)) return false;
		Circle c = (Circle) objet;
		return c.getCenter().equals(this.getCenter()) && c.getRadius() == this.getRadius();
	}
	
	@Override
	public String toString() {
		return "Centre:" + centre.toString() + ", Radius:" + radius + ", Area:" + this.area();
	}

}
