
/**
 * Hauptklasse des Memory-Spiels
 */
public class Main {

	// Dimensionen des Spielfelds
	private static int WIDTH = 4;
	private static int HEIGHT = 2;

	// Schalter zum Debuggen
	public static boolean SHOW_SOLUTION = true;

	/**
	 * Erzeugt ein Spielfeld der Gr��e WIDTH x HEIGHT und �bergibt es der
	 * gew�nschten View. Anschlie�end wird die View "aktiviert".
	 */
	public static void main(String[] args) {

		if(WIDTH < 1 || HEIGHT <1){
			System.out.println("Höhe oder Breite des Spielfeldes ist kleiner als 1 !");
			return;
		}
		MemoryBoard board = new MemoryBoard(WIDTH, HEIGHT);

		View view = new ConsoleView(board);

		if(SHOW_SOLUTION){
			view.printSolution();
		}

		while(board.isDone() != true){
			view.show();
		}
	}

}
