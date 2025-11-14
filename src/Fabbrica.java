import java.util.ArrayList;
import java.util.Scanner;

/**
 * La classe Fabbrica simula il processo di produzione di camicie,
 * includendo le fasi di filatura e cucitura.
 * 
 * @author Berti Filippo
 * @version 1.0
 */
public class Fabbrica {
    /**
     * Metodo principale che gestisce l'intero processo di produzione.
     *
     * @param args Argomenti della riga di comando (non utilizzati).
     */
    public static void main(String[] args) {
        Scanner Tastiera = new Scanner(System.in);
        ArrayList<Camicia> Magazzino = new ArrayList<>();
        Filatura filatura = new Filatura("giordano bianchi");

        System.out.print("inserisci il numero di camicie da produrre:");
        int numeroCamicie = Tastiera.nextInt();
        Tastiera.nextLine();

        filatura.start();
        try {
            filatura.join();
        } catch (InterruptedException exception) {
            System.err.println("Errore durante l'attesa del completamento della filatura: " + exception.getMessage());
        }

        for (int i = 0; i < numeroCamicie; i++) {
            Cucitura cucitura = new Cucitura("lucia neri");
            System.out.println("inserisci la taglia della camicia da produrre:");
            String taglia = Tastiera.nextLine();
            System.out.println("inserisci il colore della camicia:");
            String colore = Tastiera.nextLine();

            cucitura.start();
            try {
                cucitura.join();
            } catch (InterruptedException exception) {
                System.err.println("Errore durante l'attesa del completamento della cucitura: " + exception.getMessage());
            }

            Camicia temp = new Camicia(colore, taglia);
            Magazzino.add(temp);
            System.out.println("nuova camicia creata con colore: " + temp.getColore() + " e taglia: " + temp.getTaglia());
        }

        System.out.println("ora in magazzino ci sono: " + Magazzino.size() + " camicie");
    }
}

