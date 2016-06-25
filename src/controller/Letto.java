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
    private int codLetto;
    
    private String idRicovero;
    
    private int genCodLetto(String idRicovero, TReparto Reparto){
    	int num=(int)(Math.random()*100);
    	if(Reparto==TReparto.CARDIOLOGIA)
    		return num;
    	if(Reparto==TReparto.PEDIATRIA)
    		return num+100;
    	if(Reparto==TReparto.PNEUMOLOGIA)
    		return num+200;
    	if(Reparto==TReparto.PSICHIATRIA)
    		return num+300;
    	return 0;
    }
    
    public int getCodLetto(){
    	return codLetto;
    }
    
    public boolean commit(){
    	//TODO
    	return true;
    }

}