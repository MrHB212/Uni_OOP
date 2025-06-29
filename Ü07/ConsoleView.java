
/**
 * Konsolen-basierte View
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ConsoleView extends View {

	/**
	 * L�sst die Superklasse eine Referenz zum MemoryBoard speichern und beginnt
	 * mit dem Spiel.
	 */
	public ConsoleView(MemoryBoard board) {
		super(board);
	}

	/**
	 * L�sst den Benutzer so lange Eingaben (Kartenkoordinaten) t�tigen, bis
	 * keine weiteren Z�ge m�glich sind.
	 */
	public void show() {
		//Variablen für die Eingabe
		Coordinates card1;
		Coordinates card2;

		printBoard();
		System.out.println("--- 1. Karte ---");
		card1 = readInput();

		//Bricht Vorgang ab wenn readInput -1 zurückgibt, also Fehler
		if(card1.getX() == -1){
			return;
		}

		System.out.println("--- 2. Karte ---");
		card2 = readInput();

		//Bricht Vorgang ab wenn readInput -1 zurückgibt, also Fehler
		if(card1.getX() == -1){
			return;
		}

		if (board.revealCards(card1, card2)){
			System.out.println("+++ Du hast ein Kartenpaar gefunden ! +++");
		}else{
			System.out.println("+++ Das ist leider kein Kartenpaar ! +++");
		}

	}

	private void printBoard() {
		for(int a=0; a != board.height; a++){
			System.out.println();
			for(int b = 0; b != board.width; b++){
				if (board.flipped[b][a] == false) {
					System.out.print("X ");
				}else{
					System.out.print(board.content[b][a] + " ");
				}
			}
		}
		System.out.println();
	}

	public void printSolution() {
		System.out.print("~~~~~~DEBUG MODE: ZEIGE DIE LÖSUNGEN AN~~~~~~");
		for(int a=0; a != board.height; a++){
			System.out.println();
			for(int b = 0; b != board.width; b++){
					System.out.print(board.content[b][a] + " ");
				}
			}
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}



	//Methode zum lesen der Eingabe
	//Gibt Koordinaten zurück
	private Coordinates readInput(){
		try {
			Scanner input = new Scanner(System.in);
			int in1;
			int in2;
			System.out.print("Spalte: ");
			in1 = input.nextInt();
			System.out.print("Zeile: ");
			in2 = input.nextInt();

			//Überprüft ob die Koordinaten im Spielfeld liegen
			if (in1 > board.width || in2 > board.height){
				System.out.println("Koordinate liegt außerhalb des Spielfeldes !");
				return new Coordinates(-1,-1);
			}

			return new Coordinates(in1, in2);
		} catch (Exception e) {
			if (e instanceof InputMismatchException){
				System.out.println("Bitte nur ganze positive Zahlen eingeben und Koordinaten beachten !");
			}
			return new Coordinates(-1,-1);
		}
		
	}

}
