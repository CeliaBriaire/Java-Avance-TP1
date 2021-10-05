package fr.dauphine.javaavance.td1;

public class Ring extends Circle {
	private final int radius2;
	
	public Ring() {
		super();
		radius2 = 2;
	}
	
	public Ring(Point p, int r1, int r2) {
		super(p,r1);
		if(this.getRadius()<r2) {
			radius2 = r2;
		}
		else {
			throw new IllegalArgumentException("r1 must be smaller than r2");
		}
	}
	
	public int getRadius2() {
		return radius2;
	}
	
	public boolean contains(Point p) {
		return new Circle(this.getCenter(),radius2).contains(p);
	}
	
	public boolean contains(Point p, Ring[] rings) {
		for(Ring r : rings) {
			if(r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object objet) {
		if (!super.equals(objet)) return false;
		if(this==objet) return true;
		if(!(objet instanceof Ring)) return false;
		Ring r = (Ring) objet;
		return r.getRadius2()== radius2;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Radius2:" + radius2;
	}
	

}
