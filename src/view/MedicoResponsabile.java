package view;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.*;

import controller.Intervento;
import controller.Paziente;
import controller.TOperatore;
import controller.Terapia;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class MedicoResponsabile extends Medico {

    /**
     * Default constructor
     */
    public MedicoResponsabile() {
    	super(TOperatore.RESPONSABILE);
    }


    public String listaPossibiliOperazioni(){
    	return "MEDICO RESPONSABILE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento dati operatore (Intervento)\n"
    			+ "2) Compila Scheda Prescrizione\n"
    			+ "3) Compila Lettera Dimissione\n"
    			+ "4) Esamina Cartella Clinica\n";

    }
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: 
					terminal.setTerminal("Inserire ricovero associato all'intervento:\n");
					Intervento intervento=new Intervento(terminal.getAnswer());
					compilaSchedaIntervento(intervento);
					if(intervento.commit()==true)
						terminal.setTerminal("Inserimento completato\n");
					else
						terminal.setTerminal("Inserimento fallito\n");
					terminal.setTerminal("Inserisci CF:\n");
					String cf=terminal.getAnswer();
					partecipazioneIntervento(cf,intervento.getCI());
					break;
			case 2: terminal.setTerminal("Inserire ricovero a cui associare la terapia\n");
					String idRicovero=terminal.getAnswer();
					terminal.setTerminal("Inserire medico che prescrive la terapia\n");
					String codf=terminal.getAnswer();
					Terapia terapia=new Terapia(idRicovero, codf);
					compilaSchedaTerapia(terapia);
					if(terapia.commit()==true)
						terminal.setTerminal("Inserimento completato\n");
					else
						terminal.setTerminal("Inserimento fallito\n");
					
			
					break;
			case 3: //compila lettera dimissione
					break;
			case 4: terminal.setTerminal(Paziente.PazientiRicoverati());
					terminal.setTerminal("Inserire ID del Ricovero di cui visionare la cartella:\n");
					esaminaCartella(terminal.getAnswer());;
					break;
			default: //errore
		
		
		}
		
	}


	private void compilaSchedaTerapia(Terapia terapia) {
		terminal.setTerminal("Inserire data inzio terapia:\n");
		Date inizioTerapia=new Date();
		Date fineTerapia=new Date();
		try {
			inizioTerapia = new SimpleDateFormat("dd-MM-yyyy").parse(terminal.getAnswer());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		terminal.setTerminal("Inserire data fine terapia:\n");
		try {
			fineTerapia = new SimpleDateFormat("dd-MM-yyyy").parse(terminal.getAnswer());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		terminal.setTerminal("Inserire modalità terapia:\n");
		String modalita=terminal.getAnswer();
		terminal.setTerminal("Inserire dose terapia:\n");
		String dose=terminal.getAnswer();
		terapia.aggiungiTerapia(inizioTerapia, fineTerapia, dose, modalita);
		
	}


	private void compilaSchedaIntervento(Intervento intervento) {
		Date giorno=new Date();
		int ora, minuto, durata;
		String tipo, livelloUrgenza;
		terminal.setTerminal("Inserire data intervento:\n");
		try {
			giorno = new SimpleDateFormat("dd-MM-yyyy").parse(terminal.getAnswer());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		terminal.setTerminal("Inserire ora intervento:\n");
		ora=Integer.parseInt(terminal.getAnswer());
		terminal.setTerminal("Inserire minuto intervento:\n");
		minuto=Integer.parseInt(terminal.getAnswer());
		terminal.setTerminal("Inserire durata intervento:\n");
		durata=Integer.parseInt(terminal.getAnswer());
		terminal.setTerminal("Inserire tipo intervento:\n");
		tipo=terminal.getAnswer();
		terminal.setTerminal("Inserire data intervento:\n");
		livelloUrgenza=terminal.getAnswer();
		intervento.dettagliIntervento(giorno, ora, minuto, durata, tipo, livelloUrgenza);
		
	}

}