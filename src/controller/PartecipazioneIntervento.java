package controller;

public class PartecipazioneIntervento {

	int giorno, ora, minuto;
	int idRicovero;
	String cf;
	public PartecipazioneIntervento(String cf, String ci) {
		this.cf=cf;
		giorno=ciToGiorno(ci);
		ora=ciToOra(ci);
		minuto=ciToMinuto(ci);
		idRicovero=ciToRicovero(ci);
	}

	private int ciToRicovero(String ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int ciToMinuto(String ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int ciToOra(String ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int ciToGiorno(String ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}

}
