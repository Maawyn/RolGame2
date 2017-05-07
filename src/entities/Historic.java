package entities;

import java.util.ArrayList;

public class Historic {
	private ArrayList<String> achievements = new ArrayList<>();
	private ArrayList<Integer> historicNodes = new ArrayList<>();
	
	public void addAchievements(ArrayList<String> newAchievements){
		for (String achievement : newAchievements) {
			if(!achievements.contains(achievement))
				achievements.add(achievement);
		}
	}
	public void addNode(int idNode){
		if(!historicNodes.contains(idNode))
			historicNodes.add(idNode);
	}
	
	public ArrayList<String> getAchievements(){
		return achievements;
	}
	public ArrayList<Integer> getHistoricNodes() {
		return historicNodes;
	}
	
	public void resetHistoricNodes(){
		historicNodes = new ArrayList<>();
	}
}
