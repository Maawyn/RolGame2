package main;

import java.util.Scanner;
import controllers.GameControler;
import entities.Historic;

public class Main {

	public static void main(String[] args) {
		//generateTreeTemplate();
		//generateLogros();
		Scanner sc = new Scanner(System.in);
		boolean playGame = true;
		GameControler gc = new GameControler();
		Historic historic = new Historic();
		gc.startGame(historic);
		while(playGame){
			System.out.println("¿Quieres jugar otra partida? S/N");
			String respuesta = sc.nextLine().toUpperCase();
			if(respuesta.equals("S")){
				gc  = new GameControler();
				historic.resetHistoricNodes();
				gc.startGame(historic);
			}
			if(respuesta.equals("N")){
				playGame = false;
				sc.close();
			}
		}
	}
	
//	private static void generateLogros(){
//		String[] logros = {"Desobedecer","Al cabo de 100 años todos seremos calvos","Cuando corre la ventura, las aguas son truchas","Asesina","Rebelde","Error 404","Plato gourmet","Esto es mejor que las drogas","Lección aprendida, no te fíes de un Goblin","Quitate tú, para que me ponga yo","Quien con Goblins ha de entender, muy avisado ha de ser","A los bienes y a los males, la muerte los hace iguales","Hoy figura, mañana sepultura","Hasta morir, todo es vida","Extinguir a los Ratón Nube"};
//		for (String string : logros) {
//			System.out.println("this.hma.put(\""+ string + "\", false);");
//		}
//	}
	
//	private static void generateTreeTemplate(){
//		int elem = 1;
//		for(int l = 1; l<= 8; l++){
//			int p = elem;
//			for(int i = p*2; i< p*4; i++){
//				System.out.println("BTree.addTo(" + elem + ", new Node(\"\", "+ l +", "+ i +"));");
//				if (i % 2 != 0){
//					elem++;
//				}
//			}
//		}
//	}
}
