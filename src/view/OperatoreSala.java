package view;

import java.util.*;

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
			case 1: //Inserisco Dati Operatore nell'intervento
					break;
			case 2: esaminaCartella(new Paziente(""));
				break;
			default: //errore
		
		
		}
		
	}

}