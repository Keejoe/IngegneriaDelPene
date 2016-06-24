package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Esame {

    /**
     * Default constructor
     * @param string 
     * @param id 
     */
    public Esame(String id, String nomeEsame) {
    	idRicovero=id;
    	this.nomeEsame=nomeEsame;
    	
    }

    /**
     * 
     */
    private String nomeEsame;
    
    private String idRicovero;
    
    private String risultato;

    /**
     * @param risultato
     */
    public void aggiungiRisultato(String risultato) {
        this.risultato=risultato;
    }

    public static String listaEsami(){
    	//TODO
    	String listaEsami = new String("");
    	return listaEsami;
    }

	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}
}