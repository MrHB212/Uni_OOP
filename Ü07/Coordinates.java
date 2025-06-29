
/**
 * Diese Klasse repr�sentiert ein 2-dimensionales Koordinatenpaar.
 */
public class Coordinates {
	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gibt die x-Koordinate zur�ck.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gibt die y-Koordinate zur�ck.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Gibt true zur�ck, falls die �bergebenen Koordinaten mit diesen
	 * �bereinstimmen.
	 */
	public boolean equals(int x, int y) {
		return (x == this.x) && (y == this.y);
	}

	/**
	 * Gibt true zur�ck, falls die Koordinaten des �bergebenen
	 * Coordinates-Objekt mit diesen �bereinstimmen.
	 */
	public boolean equals(Coordinates other) {
		return other.equals(x, y);
	}
}
