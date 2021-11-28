package fr.dauphine.javaavance.td1;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(center, radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;

		return Objects.equals(center, other.center)
				&& Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}

	public double getRadius() {
		return radius;
	}

}
