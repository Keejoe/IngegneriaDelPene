package view;
import java.util.*;

import controller.Letto;
import controller.Paziente;
import controller.TReparto;
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
    	if (terminal == null)
    		System.out.println("Terminale non inizializzato\n");
		switch(val){
			case 1: terminal.setTerminal("Inserire idRicovero:");
					String idRicovero=terminal.getAnswer();
					terminal.setTerminal("Inserire Reparto: 1"
							+ "Cardiologia: 1 /"
							+ "Pediatria: 2 /"
							+ "Pneumologia: 3 /"
							+ "Psichiatria: 4");
					TReparto rep;
					switch(Integer.parseInt(terminal.getAnswer())){
						case 1: rep=TReparto.CARDIOLOGIA;
								break;
						case 2: rep=TReparto.PEDIATRIA;
								break;
						case 3: rep=TReparto.PNEUMOLOGIA;
								break;
						case 4: rep=TReparto.PSICHIATRIA;
								break;
						default: terminal.setTerminal("Inserimento errato\n");
								 return;
					}
					
					Letto letto=new Letto(idRicovero, rep);
					terminal.setTerminal("Letto assegnato: " + letto.getCodLetto());
					if(letto.commit()==true)
						terminal.setTerminal("Inserimento completato\n");
					else
						terminal.setTerminal("Inserimento fallito\n");
					break;
			case 2: terminal.setTerminal("Controlli post ricoveri non gestiti momentaneamente\n");
					break;
			case 3: esaminaCartella(new Paziente(""));
					break;
			default: //errore
		
		
		}
		
	}

}