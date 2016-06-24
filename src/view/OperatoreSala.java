package view;

import java.util.*;

import controller.PartecipazioneIntervento;
import controller.Paziente;
import controller.TOperatore;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class OperatoreSala extends Operatore {

    /**
     * Default constructor
     */
    public OperatoreSala() {
    	super(TOperatore.SALA);
    }


    /**
     * @param paziente
     */

    /**
     * 
     */

    public String listaPossibiliOperazioni(){
    	return "OPERATORE DI SALA - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento dati operatore (Intervento)\n"
    			+ "2) Esamina Cartella Clinica\n";
    }
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: terminal.setTerminal("Inserisci CF:\n");
					String cf=terminal.getAnswer();
					terminal.setTerminal("Inserisci Codice Intervento:\n");
					String ci=terminal.getAnswer();
					partecipazioneIntervento(cf,ci);
					break;
			case 2: terminal.setTerminal(Paziente.PazientiRicoverati());
					terminal.setTerminal("Inserire ID del Ricovero di cui visionare la cartella:\n");
					esaminaCartella(terminal.getAnswer());;
				break;
			default: //errore
		
		
		}
		
	}




}