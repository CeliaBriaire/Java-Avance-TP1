package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class PolyLine {
	private LinkedList<Point> listePoint;
	
	public PolyLine() {
		listePoint = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		listePoint.add(p);
	}
	
	public int nbPoints() {
		return listePoint.size();
	}
	
	public boolean contains(Point p) {
		return listePoint.contains(p);
	}
	
}
