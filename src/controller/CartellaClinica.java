package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class CartellaClinica {

    /**
     * Default constructor
     */
    public CartellaClinica(String codiceSanitario) {
    	this.codiceSanitario=codiceSanitario;
    	idRicovero=generaID(codiceSanitario);
    }

    /**
     * 
     */
    private String codiceSanitario;

    /**
     * 
     */
    private String idRicovero;






    /**
     * @return
     */
    private String generaID(String codiceSanitario) {
        // TODO direi di fare hash codiceSanitario e data Accettazione
        return "";
    }

    /**
     * @param codiceSanitario
     */
    public void aggiungiPaziente(String codiceSanitario) {
        // TODO implement here
    }

    /**
     * @param dataInizio 
     * @param dataFine 
     * @param motivo
     */
    public void aggiungiRicovero(Date dataInizio, Date dataFine, String motivo) {
        // TODO implement here
    }

    /**
     * @param letto
     */
    public void aggiungiLetto(Letto letto) {
        // TODO implement here
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

}