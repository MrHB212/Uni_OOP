
/**
 * Unterklassen dieser abstrakten Klasse dienen im Memory-Spiel als View im
 * MVC-Muster.
 */
public abstract class View {

	/**
	 * MemoryBoard, entspricht dem Model im MVC-Muster.
	 */
	protected MemoryBoard board;

	/**
	 * Speichern der Referenz zum MemoryBoard.
	 */
	public View(MemoryBoard board) {
		this.board = board;
	}

	/**
	 * View wird aktiviert bzw. sichtbar gemacht.
	 */
	public abstract void show();

	//Dient dazu die Lösungen zum testen anzuzeigen
	public abstract void printSolution();

}
