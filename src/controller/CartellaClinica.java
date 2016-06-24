package controller;

import java.util.ArrayList;

public class CartellaClinica {
	
	Paziente paziente;
	Ricovero ricovero;
	private ArrayList<Esame> esami;
	private ArrayList<Intervento> interventi;
	private ArrayList<Terapia> terapie;
	
	public CartellaClinica(String idRicovero){
		ricovero=popolaRicovero(idRicovero);
		paziente=popolaPaziente(idRicovero);
		associaEsami(esami, idRicovero);
		associaInterventi(interventi, idRicovero);
		associaTerapie(terapie, idRicovero);
	}

	private void associaTerapie(ArrayList<Terapia> terapie2, String idRicovero) {
		// TODO Auto-generated method stub
		
	}

	private void associaInterventi(ArrayList<Intervento> interventi2, String idRicovero) {
		// TODO Auto-generated method stub
		
	}

	private void associaEsami(ArrayList<Esame> esami2, String idRicovero) {
		// TODO Auto-generated method stub
		
	}

	private Paziente popolaPaziente(String idRicovero) {
		// TODO Auto-generated method stub
		return null;
	}

	private Ricovero popolaRicovero(String idRicovero) {
		// TODO Auto-generated method stub
		return null;
	}

	public void printPaziente() {
		// TODO Auto-generated method stub
		
	}

	public void printDatiRicovero() {
		// TODO Auto-generated method stub
		
	}

	public void printEsami() {
		// TODO Auto-generated method stub
		
	}

	public void printInterventi() {
		// TODO Auto-generated method stub
		
	}

	public void printTerapie() {
		// TODO Auto-generated method stub
		
	}
	
	
}
