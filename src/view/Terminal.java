package view;

import controller.TOperatore;
import controller.TSegreteria;
import java.util.Scanner;

public class Terminal {
	
	private Object operatore;
	private boolean isSeg;

	public Terminal(Operatore operatore, TOperatore tipo){
		this.operatore = operatore;
		isSeg = false;
	}
	
	public Terminal(Segreteria operatore, TSegreteria tipo){
		this.operatore = operatore;
		isSeg = true;
	}
	
	public void restart(){
		if (isSeg)
			System.out.println(((Segreteria) operatore).listaPossibiliOperazioni());
		else
			System.out.println(((Operatore) operatore).listaPossibiliOperazioni());
		getSel();
	}
	
	public void getSel(){
		Scanner sc = new Scanner(System.in);
		if (isSeg)
			((Segreteria) operatore).eseguiOperazione(sc.nextInt());
		else
			((Operatore) operatore).eseguiOperazione(sc.nextInt());
	}
	
	public String getAnswer(){
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public void setTerminal(String str){
		System.out.println(str);
	}
}
