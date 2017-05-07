package controllers;
import java.util.HashMap;
import entities.GroupEnemies;

public class EnemyManager {
	private HashMap<String,Integer> hme;
	
	public EnemyManager(){
		this.hme = new HashMap<String, Integer>();
		this.hme.put("Caníbales", 0);
		this.hme.put("Coloso llorón", 0);
		this.hme.put("Goblins de las nubes", 0);
		this.hme.put("Ratón-nube", 0);
		this.hme.put("Rey atormentado de la Tormenta Tormentosa", 0);
	}
	
	public void addEnemy(GroupEnemies enemies){
		String enemyName = enemies.getName();
		this.hme.replace(enemyName, this.hme.get(enemyName) + enemies.getCantidad());
	}
	
	public void printEnemyStats(){
		System.out.println("[- Enemigos eliminados -]");
		int total = totalEnemiesKilled();
		if(total == 0){
			System.out.println("\tNingún enemigo.");
			return;
		}
		for (String enemy : this.hme.keySet()) {
			int value = this.hme.get(enemy);
			if(value > 0){
				System.out.println("\t" + enemy + " --> " + value);
			}
		}
		System.out.println("\tTotal de enemigos eliminados --> " + total);
	}
	
	private int totalEnemiesKilled(){
		int total = 0;
		for (Integer enemyValue : this.hme.values()) {
			total += enemyValue;
		}
		return total;
	}
}
