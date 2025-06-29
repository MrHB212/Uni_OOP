
/**
 * Vorgabe von Methoden, die ein Memory-Spielfeld (das Model im MVC-Muster)
 * unterst�tzen muss.
 */
public interface Board {

	/**
	 * Gibt die Anzahl an Spalten im Spielfeld-Rasters zur�ck.
	 */
	public int getWidth();

	/**
	 * Gibt die Anzahl an Zeilen im Spielfeld-Rasters zur�ck.
	 */
	public int getHeight();

	/**
	 * Gibt Auskunft �ber die Karte an der entsprechenden Koordinate. Ist die Karte
	 * verdeckt, hat sie den Wert -1. F�r alle Werte ab 1 entspricht der
	 * R�ckgabewert der eindeutigen pairId eines Kartenpaars.
	 */
	public int getPairId(int x, int y);

	/**
	 * Informiert das Model dar�ber, dass die zwei zuletzt aufgedeckten Karten nun
	 * wieder zugedeckt werden k�nnen, falls es sich dabei nicht um ein Paar
	 * handelte. Diese Methode muss nicht zwangsl�ufig aufgerufen werden.
	 */
	public void hideNonMatches();

	/**
	 * Gibt true zur�ck, falls keine weiteren Z�ge m�glich sind.
	 */
	public boolean isDone();

	/**
	 * Der Spieler hat zwei Karten (repr�sentiert durch ihre Koordinaten)
	 * ausgew�hlt, die umgedreht werden. Gibt true zur�ck, falls es sich hierbei um
	 * ein Kartenpaar handelt.
	 */
	public boolean revealCards(Coordinates a, Coordinates b);

}
