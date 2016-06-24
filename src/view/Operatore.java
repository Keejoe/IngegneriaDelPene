package view;

import java.util.*;

import controller.CartellaClinica;
import controller.PartecipazioneIntervento;
import controller.Paziente;
import controller.TOperatore;
import model.Model;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Operatore {

	protected Terminal terminal;
	protected Model model;
    /**
     * Default constructor
     */
    public Operatore(TOperatore tipo) {
    	this.tipo = tipo;
    	terminal = new Terminal(this, tipo);
    	model = new Model(terminal);
    	terminal.restart();
    	
    }

    /**
     * 
     */
    private TOperatore tipo;
    
    public Terminal getTerminal(){
    	return terminal;
    }
    
    public void esaminaCartella(String idRicovero) {
        CartellaClinica cartella=new CartellaClinica(idRicovero);
        cartella.printPaziente();
        cartella.printDatiRicovero();
        cartella.printEsami();
        cartella.printInterventi();
        cartella.printTerapie();
    }
    
	protected void partecipazioneIntervento(String cf, String ci) {
		PartecipazioneIntervento part=new PartecipazioneIntervento(cf, ci);
		if(part.commit()==true)
			terminal.setTerminal("Inserimento completato\n");
		else
			terminal.setTerminal("Inserimento fallito\n");
		
	}

    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);

	public String getName() {
		// TODO Auto-generated method stub
		return "OPERATORE";
	}
}