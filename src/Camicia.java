/**
 * La classe Camicia rappresenta una camicia con un colore e una taglia specifici.
 * 
 * @author Berti Filippo
 * @version 1.0
 */
public class Camicia {
    private String colore;
    private String taglia;

    /**
     * Costruttore della classe Camicia.
     * 
     * @param colore Colore della camicia.
     * @param taglia Taglia della camicia.
     */
    public Camicia(String colore, String taglia) {
        this.colore = colore;
        this.taglia = taglia;
    }

    /**
     * Restituisce il colore della camicia.
     * 
     * @return Colore della camicia.
     */
    public String getColore() {
        return colore;
    }

    /**
     * Restituisce la taglia della camicia.
     * 
     * @return Taglia della camicia.
     */
    public String getTaglia() {
        return taglia;
    }
}
