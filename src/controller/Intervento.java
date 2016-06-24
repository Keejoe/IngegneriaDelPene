package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Intervento {

	String idRicovero;
	private Date giorno;
	private int minuti;
	private int ora;
	private int durata;
	private String tipo;
	private String livelloUrgenza;
    /**
     * Default constructor
     * @param idRicovero 
     */
    public Intervento(String idRicovero) {
    	this.idRicovero=idRicovero;
    }


    /**
     * @param cartella 
     * @param giorno 
     * @param ora 
     * @param minuto 
     * @param durata 
     * @param tipo 
     * @param livelloUrgenza
     */
    public void dettagliIntervento(Date giorno, int ora, int minuto, int durata, String tipo, String livelloUrgenza) {
        this.giorno=giorno;
        this.ora=ora;
        this.minuti=minuto;
        this.durata=durata;
        this.tipo=tipo;
        this.livelloUrgenza=livelloUrgenza;
    }

   
	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}


	public String getCI() {
		
		return "CI"+ idRicovero + giorno.getDay() + ora + minuti;
	}

}