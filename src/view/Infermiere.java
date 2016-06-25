package view;
import controller.Paziente;
import controller.TOperatore;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Infermiere extends Operatore {

    /**
     * Default constructor
     */
    public Infermiere() {
    	super(TOperatore.INFERMIERE);
    }


    /**
     * @param paziente
     */
    public void stampaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * 
     */
    public String listaPossibiliOperazioni(){
    	return "INFERMIERE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Registrazione Somministrazione Farmaco\n"
    			+ "2) Esamina Cartella Clinica\n";
    }
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: 
					break;
			case 2: terminal.setTerminal(Paziente.PazientiRicoverati());
					terminal.setTerminal("Inserire ID del Ricovero di cui visionare la cartella:\n");
					esaminaCartella(terminal.getAnswer());
					break;
			default: //errore
		
		
		}
		
	}

}