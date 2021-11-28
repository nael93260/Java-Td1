package fr.dauphine.javaavance.td1;

import java.util.ArrayList;
import java.util.Objects;

public class Point {
	private double x;
	private double y;
	private static int nbPointsCreated = 0;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		nbPointsCreated++;
	}

	public Point(Point p2) {
		this.x = p2.getX();
		this.y = p2.getY();
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

//	public void translate(double tx, double ty) {
//		x += tx;
//		y += ty;
//
//	}

	public Point translate(double tx, double ty) {
		return new Point(x + tx, y + ty);

	}

	@Override
	public String toString() {

		return "(" + this.x + "," + this.y + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		return this.isSameAs((Point) obj);
	}

	public boolean isSameAs(Point p) {
		return (this.x == p.getX() && this.y == p.getY());

	}

	public static void main(String[] args) {
		// Point p = new Point();
		// System.out.println(p.x + " " + p.y);

		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);

		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}

}
