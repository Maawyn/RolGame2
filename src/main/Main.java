package main;

import java.util.Scanner;
import controllers.GameControler;
import entities.Historic;

public class Main {
	public static Scanner sc;
	public static String dialogsPath = "./files/dialogs.txt";
	
	public static void main(String[] args) {
		boolean playGame = true;
		sc = new Scanner(System.in);
		GameControler gc = new GameControler();
		Historic historic = new Historic();
		gc.startGame(historic);
		
		while(playGame){
			System.out.println("¿Quieres jugar otra partida? S/N");
			sc = new Scanner(System.in);
			String answer = sc.nextLine().toUpperCase();
			if(answer.equals("S")){
				gc  = new GameControler();
				historic.resetHistoricNodes();
				gc.startGame(historic);
			}
			if(answer.equals("N")){
				System.out.println("--- ¡Muchas gracias por jugar! ---");
				playGame = false;
				sc.close();
			}
		}
	}
}