package fr.dauphine.javaavance.td1;

public class Polyline {

	private Point[] line;
	private int indexInsert;

	public Polyline(int maxNumerOfPoints) {
		this.line = new Point[maxNumerOfPoints];
		this.indexInsert = 0;

	}

	public void add(Point p) {
		this.line[indexInsert] = p;// Objects.requireNonNull(p);
		indexInsert++;
	}

	public int pointCapacity() {
		return line.length;
	}

	public int nbPoints() {
		return indexInsert;
	}

	public boolean contains(Point p1) {
		for (Point p2 : line) {
			if (p2.equals(p1)) {
				return true;
			}
		}
		return false;
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
		Polyline p = new Polyline(1);
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = null;
		p.add(p3);
		System.out.println(p.contains(null));

	}
}
