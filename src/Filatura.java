/**
 * La classe Filatura rappresenta il processo di filatura del cotone
 * per la produzione di camicie.
 * 
 * @author Berti Filippo
 * @version 1.0
 */
public class Filatura extends Thread {
    public String NomeOperatore;

    /**
     * Costruttore della classe Filatura.
     *
     * @param NomeOperatore Nome dell'operatore che esegue la filatura.
     */
    public Filatura(String NomeOperatore) {
        this.NomeOperatore = NomeOperatore;
    }

    /**
     * Metodo eseguito quando il thread viene avviato.
     * Simula il processo di filatura del cotone.
     */
    @Override
    public void run() {
        try {
            System.out.println("l'operatore " + NomeOperatore + " inizia a filare il cotone per l assemblaggio della camicia");
            Thread.sleep(2000);
            System.out.println("l'operatore " + NomeOperatore + " ha finito la filatura \nora la camicia è in viaggio verso il reparto di cucitura");
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

