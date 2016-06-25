package controller;

public class PartecipazioneIntervento {

	int giorno, ora, minuto;
	String idRicovero;
	String cf;
	public PartecipazioneIntervento(String cf, String ci) {
		this.cf=cf;
		giorno=ciToGiorno(ci);
		ora=ciToOra(ci);
		minuto=ciToMinuto(ci);
		idRicovero=ciToRicovero(ci);
	}

	private String ciToRicovero(String ci) {
		
		return ci.substring(2,12);
	}

	private int ciToMinuto(String ci) {
		
		return Integer.parseInt(ci.substring(17,18));
	}

	private int ciToOra(String ci) {
		// TODO Auto-generated method stub
		return Integer.parseInt(ci.substring(15,16));
	}

	private int ciToGiorno(String ci) {
		// TODO Auto-generated method stub
		return Integer.parseInt(ci.substring(13,14));
	}

	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}

}
