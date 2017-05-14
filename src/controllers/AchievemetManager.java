package controllers;

import java.util.ArrayList;
import java.util.HashMap;

public class AchievemetManager {
	private HashMap<String,Boolean> hma;
	
	public AchievemetManager(){
		this.hma = new HashMap<String, Boolean>();
		this.hma.put("Desobedecer", false);
		this.hma.put("Al cabo de 100 años todos seremos calvos", false);
		this.hma.put("Cuando corre la ventura, las aguas son truchas", false);
		this.hma.put("Asesina", false);
		this.hma.put("Rebelde", false);
		this.hma.put("Error 404", false);
		this.hma.put("Plato gourmet", false);
		this.hma.put("Esto es mejor que las drogas", false);
		this.hma.put("Lección aprendida, no te fíes de un Goblin", false);
		this.hma.put("Quitate tú, para que me ponga yo", false);
		this.hma.put("Quien con Goblins ha de entender, muy avisado ha de ser", false);
		this.hma.put("A los bienes y a los males, la muerte los hace iguales", false);
		this.hma.put("Hoy figura, mañana sepultura", false);
		this.hma.put("Hasta morir, todo es vida", false);
		this.hma.put("Extinguir a los Ratón Nube", false);
		this.hma.put("La suerte te acompañó por este camino", false);
		this.hma.put("Fuente de sangre", false);
		this.hma.put("Estafado", false);
	}
	
	public boolean addAchievement(String achievement){
		if(this.hma.get(achievement))
			return false;
		this.hma.replace(achievement, true);
		return true;
	}
	
	public void printAchievementStats(){
		System.out.println("[- Logros obtenidos -]");
		int total = totalAchievement();
		if(total == 0){
			System.out.println("\tNingún logro.");
			return;
		}
		for (String achievement : this.hma.keySet()) {
			Boolean value = this.hma.get(achievement); //Rip parenthesis [(] 2017 -2017
			if(value){
				System.out.println("\t" + achievement + ".");
			}
		}
		System.out.println("\tTotal de logros obtenidos --> " + total + "/" + hma.size());
	}
	
	private int totalAchievement(){
		int total = 0;
		for (Boolean achievement : this.hma.values()) {
			if(achievement){
				total += 1;
			}
		}
		return total;
	}
	
	public ArrayList<String> getAchievements(){
		ArrayList<String> achievements = new ArrayList<>();
		for (String achievement : this.hma.keySet()) {
			Boolean value = this.hma.get(achievement);
			if(value){
				achievements.add(achievement);
			}
		}
		return achievements;
	}
	
	public void fillAchievements(ArrayList<String> achievements){
		for (String achievement : this.hma.keySet()) {
			if(achievements.contains(achievement)){
				this.hma.replace(achievement, true);
			}
		}
	}
}
