package controller;

import java.util.*;
import java.text.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Paziente {
	
	private String nome, cognome, luogoNascita, provinciaResidenza;
	private Date dataNascita;
	private Boolean fuoriRegione;

    /**
     * Default constructor
     */
    public Paziente(String codiceSanitario) {
    	this.codiceSanitario=codiceSanitario;
    }

    /**
     * 
     */
    private String codiceSanitario;
    
    public boolean pazienteEsistente(){
    	
    	
    	//TODO
    	
    	return false;
    }
    



    /**
     * @param nome 
     * @param cognome 
     * @param dataNascita 
     * @param luogoNascita 
     * @param provinciaResidenza 
     * @param fuoriRegione
     */
    public void creaPaziente(String nome, String cognome, SimpleDateFormat dataNascita, String luogoNascita, String provinciaResidenza, boolean fuoriRegione) {
        // TODO implement here
    	
    }
    
    public void setName(String nome){
    	this.nome=nome;
    }
    
    public void setSurname(String cognome){
    	this.cognome=cognome;
    }
    
    public void setLuogoNascita(String luogoNascita){
    	this.luogoNascita=luogoNascita;
    }
    
    public void setProvinciaResidenza(String provinciaResidenza){
    	this.provinciaResidenza=provinciaResidenza;
    }
    
    public void setDataNascita(Date date){
    	this.dataNascita=date;
    }
    
    public void setFuoriRegione(boolean fuoriRegione){
    	this.fuoriRegione=fuoriRegione;
    }
    
    //funzione per buttare i valori correnti nel database
    public boolean commit(){
    	//TODO
    	return true;
    }
    /**
     * @param nomeULSS 
     * @param regione
     */
    private void impostaRegione(String nomeULSS, String regione) {
        // TODO implement here
    }

    /**
     * @return
     */
    public HashSet<Esame> recuperaEsami() {
        // TODO implement here
        return null;
    }




	public static String PazientiRicoverati() {
		// TODO Auto-generated method stub
		return null;
	}

}