public class MemoryBoard implements Board{

    int height; 
    int width;
    int[][] id; //enthält ID der karten
    int[][] content; //enthält wert der karten
    int[] contentCounter; // zählt wie oft eine zahl bereits vorkam
    boolean[][] flipped; //Ist eine Karte umgedreht oder nicht ? 
    
    Coordinates a;
    Coordinates b;

    //Konstruktor der Klasse
    public MemoryBoard(int width, int height){
        //Korrigiere Spielfeldgröße falls nicht gerade
        if(height*width % 2 != 0){
            width++;
        }

        this.height = height;
        this.width = width;
    

        this.flipped = new boolean[width][height]; //Standardwerte sind false
        this.content = new int[width][height];
        
        //fülle den Inhalt der Karten
        this.contentCounter = new int[height*width/2];
        boolean continueFlag = false;

        //Nimmt eine Zufällige Zahl von bis zu Anzahl der Paare
        //Danach bestimmt es nacheinander welche Karte welchen Wert hat
        //Sollte die ausgesuchte Zahl bereits 2-mal gewählt worden sein, wird eine neue Zahl ausgewählt
        //Hätte man eigentlich mit Collections.shuffle machen können, aber scheint auch so zu funktionieren
        for(int row = 0; row != height; row++){
            for(int column = 0; column != width; column++){
                int selected = (int)(Math.random()*(height*width/2));
                continueFlag = false;
                while(continueFlag == false){
                    if (contentCounter[selected] < 2){
                        content[column][row] = selected;
                        contentCounter[content[column][row]] +=1;
                        continueFlag = true;
                    }else{
                        selected = (int)(Math.random()*(height*width/2));
                    } 
                }
            }
        }
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
       return height;
    }

    @Override
    public int getPairId(int x, int y) {
        try {
            if(flipped[x][y] == false){
                return -1;
            }else{
                return id[x][y];
            }
        } catch (Exception e) {
            System.out.println("Die Karte liegt außerhalb des Feldes !");
            return -1;
        }
    }

    @Override
    public void hideNonMatches() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hideNonMatches'");
    }

    @Override
    public boolean isDone() {
        int count = 0;
        for(int h = 0; h != height; h++){
            for(int w = 0; w != width; w++){
                if (flipped[w][h] == true){
                    count++;
                }
            }
        }
        if (count == width*height){
            System.out.println();
            System.out.println("Du hast alle Kartenpaare gefunden ! ");
            return true;
        } 
        count = 0;
        return false;
    }

    @Override
    public boolean revealCards(Coordinates a, Coordinates b) {
        if (content[a.getX()][a.getY()] == content[b.getX()][b.getY()]){
            flipped[a.getX()][a.getY()] = true;
            flipped[b.getX()][b.getY()] = true;
            return true;
        }else{
            return false;
        }
    }
    
}
