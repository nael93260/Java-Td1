package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	private double radius;

	public Circle(Point center, double radius) {
		this.center = new Point(center);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Center of the circle : " + center + " and radius  : " + radius + " and area : " + area();
	}

	public void translate(double dx, double dy) {
		center.translate(dx, dy);
	}

	public Point getCenter() {
		return new Point(center);
	}

	public double area() {
		return Math.PI * (radius * radius);
	}

	public boolean contains(Point p) {
		double distance = Math.sqrt(Math.pow(center.getY() - p.getY(), 2) + Math.pow(center.getX() - p.getX(), 2));
		return radius >= distance;
	}

	public static boolean contains(Point p, Circle... circles) {
		for (Circle c : circles) {
			if (c.contains(p)) {
				return true;
			}
		}
		return false;
	}
}
