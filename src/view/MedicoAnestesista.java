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
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: //Inserisco dati dell'anestesia
					break;
			case 2: esaminaCartella(new Paziente(""));
					break;
			default: //errore
		
		
		}
		
	}

}