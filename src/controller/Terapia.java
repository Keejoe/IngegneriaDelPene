package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Terapia {

    private String idRicovero;
	private String cf;
	private Date dataInizio;
	private Date dataFIne;
	private String dose;
	private String modalita;

	/**
     * Default constructor
     * @param codf 
     * @param idRicovero 
     */
    public Terapia(String idRicovero, String codf) {
    	this.idRicovero=idRicovero;
    	this.cf=codf;
    }


    /**
     * @param dataInizio 
     * @param dataFine 
     * @param dose 
     * @param modalita 
     * @param medico 
     * @param cartella
     */
    public void aggiungiTerapia(Date dataInizio, Date dataFine, String dose, String modalita) {
        this.dataInizio=dataInizio;
        this.dataFIne=dataFine;
        this.dose=dose;
        this.modalita=modalita;
        
    }

    /**
     * @param data 
     * @param ora 
     * @param minuto 
     * @param dose
     */
    public void aggiungiSomministrazione(Date data, int ora, int minuto, String dose) {
        // TODO implement here
    }


	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}

}