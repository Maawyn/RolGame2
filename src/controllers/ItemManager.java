package controllers;
import java.util.HashMap;
import entities.Item;

//Inventory
public class ItemManager {
	private HashMap<String,Integer> hmi;
	
	public ItemManager(){
		this.hmi = new HashMap<String, Integer>();
		this.hmi.put("Cucurucho de helado", 0);
		this.hmi.put("Poción misteriosa", 0);
		this.hmi.put("Corona del Rey atormentado de la Tormenta Tormentosa", 0);
		this.hmi.put("Corazón de Coloso Llorón", 0);
	}
	
	public void addItem(Item item){
		String itemName = item.getName();
		this.hmi.replace(itemName, this.hmi.get(itemName) + 1);
	}
	
	public void removeItem(Item item){
		String itemName = item.getName();
		this.hmi.replace(itemName, this.hmi.get(itemName) - 1);
	}
	
	public void printItemsStats(){
		System.out.println("[- Objetos obtenidos -]");
		int total = totalItems();
		if(total == 0){
			System.out.println("\tNingún objeto.");
			return;
		}
		for (String item : this.hmi.keySet()) {
			int value = this.hmi.get(item);
			if(value > 0){
				System.out.println("\t" + item + " --> " + value);
			}
		}
		System.out.println("\tTotal de objetos obtenidos --> " + total);
	}
	
	private int totalItems(){
		int total = 0;
		for (Integer itemValue : this.hmi.values()) {
			total += itemValue;
		}
		return total;
	}
}
