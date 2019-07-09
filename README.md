# UNITN-lingProg-Compito
Università di Trento - Soluzione esercizio di Linguaggi di Programmazione, Modulo 1 – compito **NON COMPLETO**

### TESTO
Costruire un’applicazione definita come segue:
1) Sono definite una classe astratta “Terreno” che implementa una cella quadrata, e due sue
sottoclassi “Strada” e “Prato”. Strada è caratterizzata da uno sfondo grigio e Prato da uno
sfondo verde. Strada può essere occupata da un oggetto di tipo Auto, Prato no.
2) Inizialmente viene presentata una finestra che mostra una griglia 8x8 riempita di celle di
tipo “Terreno”: quelle sul bordo della griglia saranno “Strada”, le altre saranno di tipo
“Prato”.
3) Nella finestra vi è anche un contatore contenente un numero inizializzato a 3, con label
“Auto disponibili”, un bottone “Aggiungi Auto”, ed un bottone “Inizia”.
4) Cliccando su una cella di un tipo, questa viene sostituita con una di tipo diverso (Prato ->
Strada, Strada -> Prato). Se la strada è occupata da un auto, non può divenire Prato.
5) Cliccando il bottone “Aggiungi Auto” e successivamente cliccando su una cella di tipo
“Strada”, sulla cella individuata viene posta una macchina, rappresentata da un cerchio
colorato. Se la cella è già occupata da un’auto non avviene nulla. 
6) Opzionale: Quando l’auto viene aggiunta il contatore viene decrementato, e quando raggiunge zero il
bottone “Aggiungi Macchina” viene disabilitato.
7) Quando si preme il bottone “Avvia”, compare una seconda finestra con vari altri bottoni:
“Destra”, “Sinistra”, “Su”, “Giù”, “Random”, “Start”, ”Stop” (quest’ultimo inizialmente
disabilitato.
8) Premendo uno dei primi quattro bottoni, ciascuna automobile si sposta nella direzione
indicata, se la cella corrispondente esiste ed è di tipo “strada”, altrimenti resta dove si trova.
9) Se due automobili finiscono nella stessa cella (ad esempio perché è un bordo, ed una delle due
resta ferma perché non può procedere, appare una finestra modale che dice “Crash”.
Chiudendola l’applicazione termina.
10) Premendo il bottone “Random”, ciascuna automobile si sposta in una direzione casuale (la
scelta è fatta indipendentemente per ciascuna auto), o resta ferma se la direzione scelta non è
percorribile. In console compare una scritta che indica “Auto n. X – direzione Y – mossa
permessa” (oppure “non permessa”).
11) Si faccia sì che il movimento sia mostrato da una animazione.
12) Premendo il bottone “Start”, inizia un loop nel quale ogni secondo le automobili effettuano
uno spostamento di tipo “Random”. Il bottone “Start” viene disabilitato, lo “Stop” viene
abilitato.
13) Premendo il bottone “Stop”, termina il movimento continuo delle auto. Il bottone “Stop”
viene disabilitato, lo “Start” viene abilitato.
14) Classi e metodi dell’applicazione siano documentati tramite javadoc.

  
## In questo progetto sono stati svolti i punti:
- [x] 1 2 3 4 5
- [ ] 6 7 8 9 10 11 12 13 14
