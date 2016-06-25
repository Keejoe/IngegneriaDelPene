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
    	
    }

   






    /**
     * @return
     */
    private void generaID(String codiceSanitario, Date dataInizio) {
    	int sum=dataInizio.getDay()+dataInizio.getMonth()+dataInizio.getYear();
        this.idRicovero=codiceSanitario + sum;
    }
    
    public String getID(){
    	return idRicovero;
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
        generaID(this.codiceSanitario,this.dataInizio);
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




	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}

}