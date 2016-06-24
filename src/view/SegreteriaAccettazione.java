package view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import controller.CartellaClinica;
import controller.Esame;
import controller.Paziente;
import controller.TOperatore;
import controller.TSegreteria;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class SegreteriaAccettazione extends Segreteria {

    /**
     * Default constructor
     */
    public SegreteriaAccettazione() {
    	super(TSegreteria.ACCETTAZIONE);
    }



    /**
     * 
     */

    public String listaPossibiliOperazioni(){
    	
    	
    	return "SEGRETERIA ACCETTAZIONE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Accettazione Paziente\n"
    			+ "2) Inserisci Dati Ricovero\n"
    			+ "3) Allega Esami\n"
    			+ "4) Stampa Cartella Clinica\n"
    			+ "5) Esamina Cartella Clinica\n";
    }



    @Override
	public void eseguiOperazione(int val) {
    	if (terminal == null)
    		System.out.println("PDD");
		switch(val){
			case 1: terminal.setTerminal("Inserisci Codice Sanitario:\n");
					String cod = terminal.getAnswer();
					Paziente paziente = new Paziente(cod);
					if(paziente.pazienteEsistente())
						terminal.setTerminal("Paziente già inserito. Procedere a inserimento dati ricovero.\n");
					else{
						terminal.setTerminal("Inserisci Nome:\n");
						paziente.setName(terminal.getAnswer());
						terminal.setTerminal("Inserisci cognome:\n");
						paziente.setSurname(terminal.getAnswer());
						terminal.setTerminal("Inserisci Data Nascita(dd-mm-yyyy):\n");
						try {
							paziente.setDataNascita(new SimpleDateFormat("dd-MM-yyyy").parse(terminal.getAnswer()));
						} catch (ParseException e) {
							e.printStackTrace();
						}
						terminal.setTerminal("Inserisci Luogo Nascita:\n");
						paziente.setLuogoNascita(terminal.getAnswer());
						terminal.setTerminal("Inserisci Provincia di residenza:\n");
						paziente.setProvinciaResidenza(terminal.getAnswer());
						terminal.setTerminal("Inserisci se proveniente da fuori regione(s=sì,*=no):\n");
						String str=new String(terminal.getAnswer());
						if(str=="s")
							paziente.setFuoriRegione(true);
						else
							paziente.setFuoriRegione(false);
						if(paziente.commit()==true)
							terminal.setTerminal("Inserimento completato\n");
						else
							terminal.setTerminal("Inserimento fallito\n");
						
						
					}	
					break;
			case 2: terminal.setTerminal("CREAZIONE CARTELLA CLINICA\n"
					+ "Inserire codice Sanitario:\n");
					CartellaClinica cartella=new CartellaClinica(terminal.getAnswer());
					terminal.setTerminal("Generato ID RICOVERO: " + cartella.getID() +"\n"
							+ "Procere ad inserimento dati Cartella.\nData inizio ricovero:");
					Date inizio=new Date();
					Date fine= new Date();
					String motivo;
					try {
						inizio = new SimpleDateFormat("dd-MM-yyyy").parse(terminal.getAnswer());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					terminal.setTerminal("Data fine ricovero:\n");
					try {
						fine = new SimpleDateFormat("dd-MM-yyyy").parse(terminal.getAnswer());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					terminal.setTerminal("Motivo:\n");
					motivo=terminal.getAnswer();
					cartella.aggiungiRicovero(inizio, fine, motivo);
					if(cartella.commit()==true)
						terminal.setTerminal("Inserimento completato\n");
					else
						terminal.setTerminal("Inserimento fallito\n");
					break;
			case 3: boolean stop=false;
					terminal.setTerminal("Inserire ID ricovero a cui associare gli esami");
					String id=terminal.getAnswer();
					while(!stop){
						terminal.setTerminal(Esame.listaEsami());
						terminal.setTerminal("Esame da aggiungere:\n");
						Esame esame=new Esame(id,terminal.getAnswer());
						terminal.setTerminal("Inserisci esito esame:\n");
						esame.aggiungiRisultato(terminal.getAnswer());
						if(esame.commit()==true)
							terminal.setTerminal("Inserimento completato\n");
						else
							terminal.setTerminal("Inserimento fallito\n");
						terminal.setTerminal("Inserire altro esame? (s=sì,*=no)");
						if(terminal.getAnswer()!="s")
							stop=true;
					}
					terminal.setTerminal("Inserimento esami completato\n");
					break;
			case 4: terminal.setTerminal("Contatto stampante in corso...\nCartella Clinica Stampata\n");
					break;
			case 5: esaminaCartella(new Paziente(""));
					break;
			default: //errore
		
		
		}

		
	}

}