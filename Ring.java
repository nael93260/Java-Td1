package fr.dauphine.javaavance.td1;

public class Ring extends Circle {
	private double innerRadius;

	public Ring(Point center, double outerRadius, double innerRadius) {
		super(center, outerRadius);
		if (innerRadius >= outerRadius) {
			throw new IllegalArgumentException("innerRadius have to be smaller than outerRadius");
		}

		this.innerRadius = innerRadius;
	}

}
