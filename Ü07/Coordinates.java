
/**
 * Diese Klasse repräsentiert ein 2-dimensionales Koordinatenpaar.
 */
public class Coordinates {
	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gibt die x-Koordinate zurück.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gibt die y-Koordinate zurück.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Gibt true zurück, falls die übergebenen Koordinaten mit diesen
	 * übereinstimmen.
	 */
	public boolean equals(int x, int y) {
		return (x == this.x) && (y == this.y);
	}

	/**
	 * Gibt true zurück, falls die Koordinaten des übergebenen
	 * Coordinates-Objekt mit diesen übereinstimmen.
	 */
	public boolean equals(Coordinates other) {
		return other.equals(x, y);
	}
}
