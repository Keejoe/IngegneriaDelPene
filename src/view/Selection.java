package view;

import controller.TOperatore;
import controller.TSegreteria;
import java.util.Scanner;

public class Selection {

	public Selection(){
		
		Scanner scan = new Scanner(System.in);
		int cho;
		String intro = "Benvenuti\n Seleziona il tuo ruolo:\n";
		String first = "1. Segreteria\t2. Operatore";
		String segreteria = "SEGRETERIA\n";
		String sec_segreteria = "1. Accettazione\t2.Reparto";
		String operatore = "OPERATORE\n";
		String sec_operatore = "1. Medico\t2. Altro";
		String medico = "MEDICO\n";
		String ter_medico = "1. Anestesista\t2.Responsabile";
		String ter_altro = "1.Operatore di Sala\t2. Infermiere";
		
		System.out.println(intro+first);
		cho = scan.nextInt();
		switch(cho){
		case 1:
			TSegreteria tipos;
			System.out.println(segreteria+sec_segreteria);
			do{
				cho = scan.nextInt();
				tipos = cho == 1 ? TSegreteria.ACCETTAZIONE : TSegreteria.REPARTO;
			}while (cho != 1 && cho != 2);
			create(tipos);
			break;
		case 2:
			TOperatore tipo;
			System.out.println(operatore+sec_operatore);
			do{
				cho = scan.nextInt();
				if (cho == 1){
					System.out.println(medico+ter_medico);
					do{
						cho = scan.nextInt();
						tipo = cho == 1 ? TOperatore.ANESTESISTA : TOperatore.RESPONSABILE;
					}while (cho != 1 && cho != 2);
				}else{
					System.out.println(operatore+ter_altro);
					do{
						cho = scan.nextInt();
						tipo = cho == 1 ? TOperatore.SALA : TOperatore.INFERMIERE;
					}while (cho != 1 && cho != 2);
				}
			}while (cho != 1 && cho != 2);
			create(tipo);
			break;
		default:
			System.out.println("Scelta invalida");
			new Selection();
			break;
		}
	}
		
	private void create(TOperatore type){
		Operatore operatore = inizialize(type);
		//TODO verify();		
	}
	
	private Operatore inizialize(TOperatore tipo) {
		switch(tipo){
		case SALA:
			return new OperatoreSala();
		case INFERMIERE:
			return new Infermiere();
		case RESPONSABILE:
			return new MedicoResponsabile();
		case ANESTESISTA:
			return new MedicoAnestesista();
		default:
			return null;
		}
	}
	
	private void create(TSegreteria type){
		Segreteria segreteria = inizialize(type);
		//TODO verify();
	}
	
	private Segreteria inizialize(TSegreteria tipo) {
		switch(tipo){
		case ACCETTAZIONE:
			return new SegreteriaAccettazione();
		case REPARTO:
			return new SegreteriaReparto();
		default:
			return null;
		}
	}
}
