package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class TestPoint {
	
	public static void main(String[] args) {

		Point point = new Point(1, 2);
		System.out.println(point);
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		PolyLineArrayList poly1 = new PolyLineArrayList(5);
		poly1.add(p3);
		poly1.add(p1);
		poly1.add(null);
		System.out.println(poly1.nbPoints());
		System.out.println(poly1.contains(p1));

		PolyLineLinkedList poly2 = new PolyLineLinkedList();
		poly2.add(p3);
		poly2.add(p1);
		System.out.println(poly2.nbPoints());
		System.out.println(poly2.contains(p1));
		
		Circle c = new Circle(p1,1);
		Circle c2 = new Circle(p1,2);
		c2.translate(1, 1);
		System.out.println(c+" "+c2);
		
		Circle c3= new Circle(new Point(1,2),1);
		c3.getCenter().translate(1, 1);
		System.out.println(c);
		
		Ring r = new Ring(new Point(1,2),1,2);
		Ring r2 = new Ring(new Point(1,2),1,2);
		System.out.println(r);
		System.out.println(r.equals(r2));
	}
}