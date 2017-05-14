package controllers;

import java.util.Random;
import controllers.EnemyManager;
import controllers.ItemManager;
import entities.Node;
import entities.Player;
import generator.Generator;
import main.Main;
import tree.BinaryTree;
import entities.GroupEnemies;
import entities.Historic;
import entities.Item;
import java.util.HashMap;
import java.util.InputMismatchException;

public class GameControler {
	private EnemyManager em;
	private AchievemetManager am;
	private ItemManager inventory;
	private Player player;
	
	private HashMap<Integer, GroupEnemies> hmge;
	private HashMap<Integer, Item> hmio;
	private HashMap<Integer, Item> hmid;
	private HashMap<Integer, String[]> hma;
	private HashMap<Integer, Integer> lm;
	
	public GameControler(){
		this.em = new EnemyManager();
		this.inventory = new ItemManager();
		this.am = new AchievemetManager();
		this.player = new Player("Babah");
		
		this.hmge = new HashMap<Integer, GroupEnemies>();
		this.hmio = new HashMap<Integer, Item>();
		this.hmid = new HashMap<Integer, Item>();
		this.hma = new HashMap<Integer, String[]>();
		this.lm = new HashMap<Integer, Integer>();
	}
		
	public void startGame(Historic historic){
		TreeManager treeManager = new TreeManager();
		treeManager.setName(player.getName());
		BinaryTree binaryTree = treeManager.generateBinaryTree();
		Node actual = binaryTree.getRoot();
		am.fillAchievements(historic.getAchievements());
		Random rd = new Random();
		Generator g = new Generator();
		
		g.generateEnemiesTable(this.hmge);
		g.generateItemObtainedTable(this.hmio);
		g.generateItemDeletedTable(this.hmid);
		g.generateAchievemetsTable(this.hma);
		g.generateLifeEventsTable(this.lm);
		
		int[] deathEnemyNodeList = {67, 74, 76, 104, 256, 257, 260, 280, 526};
		int[] obtainItemNodeList = {6, 72, 264, 265, 76};
		int[] deleteItemNodeList = {6, 264, 306, 307};
		int[] achievementNodeList = {5,6,7,18,19,25,66,67,70,71,74,76,104,110,111,256,257,258,259,260,262,263,273,275,276,280,288,289,290,291,427,426};
		int[] lifeEventsNodeList = {7, 17, 25, 69, 71, 73, 74, 75, 77, 273, 78, 79, 105, 109, 257, 259, 261, 263, 275, 280, 281, 289, 291, 305, 307};
		try{
			while(actual.hasChildren()){
				System.out.println(actual.show()); // Print the first node and his child.
				historic.addNode(actual.getId());
				int pos = Main.sc.nextInt(); // Player choice
				if(pos > 2 || pos < 1)
					throw new Exception("El número introducido es diferente a las opciones disponibles.");
				actual = actual.getNext(pos);
				historic.addNode(actual.getId());
				actual = actual.getNextByIA(rd.nextBoolean());
				historic.addNode(actual.getId());
				if(checkIdList(actual.getId(), deathEnemyNodeList)){
					checkDeathEnemy(actual.getId());
				}
				if(checkIdList(actual.getId(), obtainItemNodeList)){
					checkItemObtained(actual.getId());
				}
				if(checkIdList(actual.getId(), deleteItemNodeList)){
					checkItemDeleted(actual.getId());
				}
				if(checkIdList(actual.getId(), achievementNodeList)){
					checkAchievement(actual.getId());
				}
				if(checkIdList(actual.getId(),lifeEventsNodeList)){
					player.modifiedLife(this.lm.get(actual.getId()));
				}
			}
			System.out.println(actual.show());
			
			System.out.println("\n/////////////////////////////////////////////////////////////"
					+ "\n///////////////////// Se acabó el juego /////////////////////\n"
					+ "/////////////////////////////////////////////////////////////");
			
			historic.addAchievements(am.getAchievements());
			Node root = binaryTree.getRoot();
			System.out.println("\n||-------Decisiones tomadas-------||");
			for (Integer idNode : historic.getHistoricNodes()) {
				binaryTree.inOrder(idNode, root);
				root = binaryTree.getActual();
				System.out.println(root.getInfo());
			}
			System.out.println("\n||-------Estadísticas-------||"); // Statistics
			em.printEnemyStats();  // Deleted Enemies
			inventory.printItemsStats(); // Obtained items 
			am.printAchievementStats(); // Obtained Achievement
			System.out.println("\n\n\n");
			
		}catch(InputMismatchException e){
			System.err.println("ERROR: Has introducido un valor que no es un número/opción.\n");
		}
		catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage() + "\n");
		}
	}
		
	private boolean checkIdList(int id, int[] list){
		for(int i=0;i<list.length; i++){
			if(list[i] == id){
				return true;
			}
		}
		return false;
	}
	
	private void checkDeathEnemy(int id){
		em.addEnemy(this.hmge.get(id));
	}
	
	private void checkItemObtained(int id){
		inventory.addItem(this.hmio.get(id));
		System.out.println("Objeto obtenido: " + this.hmio.get(id).getName() + ".\nDescripción: "+ this.hmio.get(id).getDescription() +".");
	}

	private void checkItemDeleted(int id){
		System.out.println("Objeto eliminado: " + this.hmio.get(id).getName() + ".");
		inventory.removeItem(this.hmio.get(id));
	}
	
	private void checkAchievement(int id){
		for (String achievement : this.hma.get(id)) {
			if(am.addAchievement(achievement))
				System.out.println("Logro obtenido: " + achievement + ".");
		}	
	}
}
