package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Letto {

    /**
     * Default constructor
     */
    public Letto(String idRicovero, TReparto reparto) {
    	this.idRicovero = idRicovero;
    	codLetto=genCodLetto(idRicovero, reparto);
    }

    /**
     * 
     */
    private String codLetto;
    
    private String idRicovero;
    
    private String genCodLetto(String idRicovero, TReparto Reparto){
    	//TODO
    	String str="";
    	return "";
    }
    
    public String getCodLetto(){
    	return codLetto;
    }
    
    public boolean commit(){
    	//TODO
    	return true;
    }

}