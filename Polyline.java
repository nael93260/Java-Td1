package fr.dauphine.javaavance.td1;

import java.util.LinkedList;
import java.util.Objects;

public class Polyline {
	private LinkedList<Point> line;

	public Polyline() {
		this.line = new LinkedList<>();
	}

	public void add(Point p) {
		this.line.add(Objects.requireNonNull(p));

	}

//	public int pointCapacity() {
//		return line.size;
//	}

	public int nbPoints() {
		return line.size();
	}

	public boolean contains(Point p) {
		return line.contains(p);
	}

	@Override
	public String toString() {
		String texte = "";
		int i = 1;
		for (Point p : line) {
			texte = "Point " + i + " : " + p.toString();
			i++;
		}
		return texte;
	}

	public static void main(String[] args) {
		Polyline p = new Polyline();
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = null;
		p.add(p3);
		System.out.println(p.contains(null));

	}
}
