package view;

import java.util.*;

import controller.Paziente;
import controller.TOperatore;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Medico extends Operatore {

    /**
     * Default constructor
     */
    public Medico(TOperatore tipo) {
    	super(tipo);
    }
    
    public Medico() {
    	super(TOperatore.MEDICO);
    }



    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();

}