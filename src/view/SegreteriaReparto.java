package view;
import java.util.*;

import controller.Paziente;
import controller.TSegreteria;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class SegreteriaReparto extends Segreteria {

    /**
     * Default constructor
     */
    public SegreteriaReparto() {
    	super(TSegreteria.REPARTO);
    }


    /**
     * 
     */

    public String listaPossibiliOperazioni() {
    	return "SEGRETERIA REPARTO - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento Dati Letto\n"
    			+ "2) Prenotazione Controllo Post-Ricovero\n"
    			+ "3) Esamina Cartella Paziente";
    }
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: //Inserisco Dati Letto
					break;
			case 2: //Prenoto controllo post-ricovero
					break;
			case 3: esaminaCartella(new Paziente(""));
					break;
			default: //errore
		
		
		}
		
	}

}