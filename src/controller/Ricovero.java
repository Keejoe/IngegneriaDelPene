package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Ricovero {

	private String codiceSanitario;
	private String idRicovero;
	private Date dataInizio;
	private Date dataFine;
	private String motivo;
	private Letto letto;
	
    public Ricovero(String codiceSanitario) {
    	this.codiceSanitario=codiceSanitario;
    	idRicovero=generaID(codiceSanitario);
    }

   






    /**
     * @return
     */
    private String generaID(String codiceSanitario) {
        // TODO direi di fare hash codiceSanitario e data Accettazione
        return "";
    }


    /**
     * @param dataInizio 
     * @param dataFine 
     * @param motivo
     */
    public void aggiungiRicovero(Date dataInizio, Date dataFine, String motivo) {
        this.dataInizio=dataInizio;
        this.dataFine=dataFine;
        this.motivo=motivo;
    }

    /**
     * @param letto
     */
    public void aggiungiLetto(Letto letto) {
        this.letto=letto;
    }

    /**
     * @param esame
     */
    public void allegaEsame(Esame esame) {
        // TODO implement here
    }

    /**
     * @param esame
     */
    public void rimuoviEsame(Esame esame) {
        // TODO implement here
    }

    /**
     * @param lettera
     */
    public void scriviDimissioni(String lettera) {
        // TODO implement here
    }


	public String getID() {
		// TODO Auto-generated method stub
		return idRicovero;
	}


	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}

}