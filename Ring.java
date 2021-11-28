package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class Ring extends Circle {
	private double innerRadius;

	public Ring(Point center, double outerRadius, double innerRadius) {
		super(center, outerRadius);
		if (innerRadius >= outerRadius) {
			throw new IllegalArgumentException("innerRadius have to be smaller than outerRadius");
		}

		this.innerRadius = innerRadius;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(innerRadius);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ring other = (Ring) obj;
		return Double.doubleToLongBits(innerRadius) == Double.doubleToLongBits(other.innerRadius);
	}

	@Override
	public String toString() {
		return "The center of the Ring is : " + super.getCenter() + " and inner radius : " + innerRadius
				+ " and outer radius : " + super.getRadius();
	}

	@Override
	public boolean contains(Point p) {
		double distance = Math.sqrt(
				Math.pow(super.getCenter().getX() - p.getX(), 2) + Math.pow(super.getCenter().getY() - p.getY(), 2));
		return innerRadius >= distance;
	}

	public static boolean contains(Point p, Ring... rings) {
		for (Ring r : rings) {
			if (r.contains(p)) {
				return true;
			}
		}
		return false;
	}

}
