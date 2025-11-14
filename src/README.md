# Simulazione Maglieria

## Descrizione del Progetto

Questo progetto simula il processo di produzione di camicie, partendo dalla filatura del cotone fino alla cucitura e al completamento del prodotto finito. La simulazione utilizza thread per rappresentare le diverse fasi del processo produttivo, con operatori dedicati per ogni fase.

## Struttura del Progetto

Il progetto è composto dai seguenti file:

1. **Fabbrica.java**  
   Questo file contiene il metodo `main` che coordina l'intero processo di produzione. Gestisce l'interazione con l'utente per specificare il numero di camicie da produrre, le loro caratteristiche (colore e taglia) e avvia i thread per le fasi di filatura e cucitura.

2. **Filatura.java**  
   Rappresenta il processo di filatura del cotone. La classe estende `Thread` e simula il lavoro di un operatore che prepara il filato per la fase successiva.

3. **Cucitura.java**  
   Rappresenta il processo di cucitura del filato. Anche questa classe estende `Thread` e simula il lavoro di un operatore che trasforma il filato in una camicia completa.

4. **Camicia.java**  
   Modello di una camicia con due attributi principali: `colore` e `taglia`. Contiene i metodi getter per accedere a queste proprietà.

## Come Eseguire il Progetto

1. Compilare tutti i file `.java` presenti nella directory `src`.
2. Eseguire il file `Fabbrica.java`.
3. Seguire le istruzioni fornite dal programma per specificare il numero di camicie da produrre e le loro caratteristiche.

## Funzionalità Principali

- Simulazione multi-threading per rappresentare le fasi di produzione.
- Interazione con l'utente per personalizzare le camicie.
- Gestione del magazzino con un elenco di camicie prodotte.

## Autore

- **Berti Filippo**

## Versione

- **1.0**
