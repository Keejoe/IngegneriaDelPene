package controller;

import java.util.*;
import java.text.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Paziente {
	
	private String nome, cognome, luogoNascita, provinciaResidenza;
	private SimpleDateFormat dataNascita;
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
    
    public void setDataNascita(SimpleDateFormat dataNascita){
    	this.dataNascita=dataNascita;
    }
    
    public void setFuoriRegione(boolean fuoriRegione){
    	this.fuoriRegione=fuoriRegione;
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

}