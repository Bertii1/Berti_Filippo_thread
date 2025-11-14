/**
 * La classe Cucitura rappresenta il processo di cucitura del filato
 * per completare la produzione di camicie.
 * 
 * @author Berti Filippo
 * @version 1.0
 */
public class Cucitura extends Thread{
    /*Indico il Nome dell Operatore da usare nel logging del processo nel*/
    private String NomeOperatore;

    /**
     * Costruttore della classe Cucitura.
     * 
     * @param NomeOperatore Nome dell'operatore che esegue la cucitura.
     */
    public Cucitura(String NomeOperatore){
        this.NomeOperatore = NomeOperatore;
    }

    /**
     * Metodo eseguito quando il thread viene avviato.
     * Simula il processo di cucitura del filato.
     */
    @Override
    public void run(){
        try{
            System.out.println("Il filato e arrivato nel reparto di cucitura e l'operatore "+NomeOperatore+"\n"+"inizia a cucire il filato per renderlo un prodotto finito");
            Thread.sleep(2500);
            System.out.println("la cucitura è completa ora la camicia e pronta per essere portata in magazzino");
            Thread.sleep(500);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}

