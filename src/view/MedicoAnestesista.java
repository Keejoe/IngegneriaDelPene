package view;

import java.util.*;

import controller.Paziente;
import controller.TOperatore;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class MedicoAnestesista extends Medico {

    /**
     * Default constructor
     */
    public MedicoAnestesista() {
    	super(TOperatore.ANESTESISTA);
    }

    public String listaPossibiliOperazioni(){
    	return "MEDICO ANESTESISTA - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento dati anestesia (Intervento)\n"
    			+ "2) Esamina Cartella Clinica\n";
    }
    
    public void inserisciAnestesia(){
    	//TODO
    	
    }
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: terminal.setTerminal("Inserisci CF:\n");
					String cf=terminal.getAnswer();
					terminal.setTerminal("Inserisci Codice Intervento:\n");
					String ci=terminal.getAnswer();
					inserisciAnestesia();
					partecipazioneIntervento(cf,ci);
					
					break;
			case 2: terminal.setTerminal(Paziente.PazientiRicoverati());
					terminal.setTerminal("Inserire ID del Ricovero di cui visionare la cartella:\n");
					esaminaCartella(terminal.getAnswer());
					break;
			default: //errore
		
		
		}
		
	}

}