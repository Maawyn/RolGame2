package controllers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import controllers.EnemyManager;
import controllers.ItemManager;
import entities.Node;
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
	private HashMap<Integer, GroupEnemies> hmge;
	private HashMap<Integer, Item> hmio;
	private HashMap<Integer, Item> hmid;
	private HashMap<Integer, String[]> hma;
	
	public GameControler(){
		this.em = new EnemyManager();
		this.inventory = new ItemManager();
		this.am = new AchievemetManager();
		this.hmge = new HashMap<Integer, GroupEnemies>();
		this.hmio = new HashMap<Integer, Item>();
		this.hmid = new HashMap<Integer, Item>();
		this.hma = new HashMap<Integer,  String[]>();
	}
		
	public void startGame(Historic historic){
		TreeManager treeManager = new TreeManager();
		BinaryTree binaryTree = treeManager.generateBinaryTree();
		Node actual = binaryTree.getRoot();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		am.fillAchievements(historic.getAchievements());
		Random rd = new Random();
		generateEnemiesTable();
		generateItemObtainedTable();
		generateItemDeletedTable();
		generateAchievemetsTable();
//		int[] deathEnemyNodeList = {67, 74, 76, 104, 256, 257, 260, 280, 526};
//		int[] obtainItemNodeList = {6, 72, 264, 265, 76};
//		int[] deleteItemNodeList = {6, 264, 304, 305, 307};
//		int[] achievementNodeList = {5,6,7,18,19,25,66,67,70,71,74,76,104,110,111,256,257,258,259,260,262,263,275,276,280,288,289,290,291,427,426};
		try{
			while(actual.hasChildren()){
				System.out.println(actual.show()); //Printa el primer nodo y sus hijos.
				historic.addNode(actual.getId());
				int pos = scanner.nextInt(); //Elección del jugador
				if(pos > 2 || pos < 1)
					throw new Exception("El número introducido es diferente a las opciones disponibles.");
				actual = actual.getNext(pos);
				historic.addNode(actual.getId());
				actual = actual.getNextByIA(rd.nextBoolean());
				historic.addNode(actual.getId());
				if(Arrays.asList(67, 74, 76, 104, 256, 257, 260, 280, 526).contains(actual.getId())){ //enemigos eliminados
					checkDeathEnemy(actual.getId());
				}
				if(Arrays.asList(6, 72, 264, 265, 76).contains(actual.getId())){ //objetos obtenidos
					checkItemObtained(actual.getId());
				}
				if(Arrays.asList(6, 264, 304, 305, 307).contains(actual.getId())){ //objetos eliminados
					checkItemDeleted(actual.getId());
				}
				if(Arrays.asList(5,6,7,18,19,25,66,67,70,71,74,76,104,109,110,111,256,257,258,
						259,260,262,263,275,276,280,288,289,290,291,427,426).contains(actual.getId())){
					System.out.println(actual.getId());
					checkAchievement(actual.getId());
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
			System.out.println("\n||-------Estadísticas-------||"); // Estadísticas
			em.printEnemyStats();  // Enemigos eliminados
			inventory.printItemsStats(); // Objetos obtenidos
			am.printAchievementStats(); // Logros obtenidos
			System.out.println("\n\n\n");
			
		}catch(InputMismatchException e){
			System.out.println("ERROR: Has introducido un valor que no es un número/opción.\n");
		}
		catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("ERROR: " + e.getMessage() + "\n");
		}
	}
	
	private void checkDeathEnemy(int id){
		em.addEnemy(this.hmge.get(id));
	}
	
	private void checkItemObtained(int id){
		inventory.addItem(this.hmio.get(id));
		System.out.println("Objeto obtenido: " + this.hmio.get(id).getName() + ".\nDescripción: "+ this.hmio.get(id).getDescription() +".");
	}
	private void checkItemDeleted(int id){
		inventory.removeItem(this.hmio.get(id));
		System.out.println("Objeto eliminado: " + this.hmio.get(id).getName() + ".");
	}
	private void checkAchievement(int id){
		for (String achievement : this.hma.get(id)) {
			if(am.addAchievement(achievement))
				System.out.println("Logro obtenido: " + achievement + ".");
		}
		
	}
	private void generateEnemiesTable(){
		this.hmge.put(67, new GroupEnemies("Ratón-nube",1));
		this.hmge.put(74, new GroupEnemies("Goblins de las nubes",10));
		this.hmge.put(76, new GroupEnemies("Coloso llorón",1));
		this.hmge.put(104, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		this.hmge.put(256, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		this.hmge.put(257, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		this.hmge.put(280, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		this.hmge.put(260, new GroupEnemies("Caníbales",20));
	}
	
	private void generateItemObtainedTable(){
		this.hmio.put(6, new Item("Cucurucho de helado","Comida suculenta con sabor a cactus suculento."));
		this.hmio.put(72, new Item("Poción misteriosa","Burbujeaba exotéricamente, cuyo color no era muy agradable a la vista."));
		this.hmio.put(265, new Item("Corona del Rey atormentado de la Tormenta Tormentosa","Sientes un dolor indescriptible cuando está cerca."
				+ " Mirarla durante mucho tiempo seguido produce ceguera del reflejo deslumbrante que tiene."));
		this.hmio.put(76, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		this.hmio.put(264, new Item("Corona del Rey atormentado de la Tormenta Tormentosa","Sientes un dolor indescriptible cuando está cerca."
				+ " Mirarla durante mucho tiempo seguido produce ceguera del reflejo deslumbrante que tiene."));
		
	}
	
	private void generateItemDeletedTable(){
		this.hmid.put(304, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		this.hmid.put(306, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		this.hmid.put(307, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		this.hmid.put(264, new Item("Corona del Rey atormentado de la Tormenta Tormentosa","Sientes un dolor indescriptible cuando está cerca."
				+ " Mirarla durante mucho tiempo seguido produce ceguera del reflejo deslumbrante que tiene."));
		this.hmio.put(6, new Item("Cucurucho de helado","Comida suculenta con sabor a cactus."));
	}
	
	private void generateAchievemetsTable(){
		this.hma.put(5, new String[]{"Al cabo de 100 años todos seremos calvos"});
		this.hma.put(6, new String[]{"Desobedecer"});
		this.hma.put(7, new String[]{"Desobedecer"});
		this.hma.put(18, new String[]{"Desobedecer"});
		this.hma.put(19, new String[]{"Desobedecer"});
		this.hma.put(66, new String[]{"Desobedecer"});
		this.hma.put(67, new String[]{"Desobedecer","Asesina","Extinguir a los Ratón Nube"});
		this.hma.put(70, new String[]{"Desobedecer"});
		this.hma.put(71, new String[]{"Desobedecer"});
		this.hma.put(258, new String[]{"Desobedecer"});
		this.hma.put(259, new String[]{"Desobedecer"});
		this.hma.put(262, new String[]{"Desobedecer"});
		this.hma.put(263, new String[]{"Desobedecer"});
		this.hma.put(276, new String[]{"Desobedecer"});
		this.hma.put(275, new String[]{"Desobedecer","Hasta morir, todo es vida"});
		this.hma.put(256, new String[]{"Cuando corre la ventura, las aguas son truchas"});
		this.hma.put(74, new String[]{"Asesina"});
		this.hma.put(76, new String[]{"Asesina"});
		this.hma.put(104, new String[]{"La suerte te acompañó por este camino","Asesina"}); // !!!
		this.hma.put(256, new String[]{"Asesina"});
		this.hma.put(257, new String[]{"Asesina", "Hoy figura, mañana sepultura"});
		this.hma.put(260, new String[]{"Asesina"});
		this.hma.put(280, new String[]{"Asesina","A los bienes y a los males, la muerte los hace iguales"});
		this.hma.put(426, new String[]{"Rebelde"});
		this.hma.put(427, new String[]{"Error 404"});
		this.hma.put(25, new String[]{"Plato gourmet"});
		this.hma.put(288, new String[]{"Esto es mejor que las drogas"});
		this.hma.put(289, new String[]{"Lección aprendida, no te fíes de un Goblin"});
		this.hma.put(110, new String[]{"Quitate tú, para que me ponga yo"});
		this.hma.put(111, new String[]{"Quitate tú, para que me ponga yo"});
		this.hma.put(290, new String[]{"Quien con Goblins ha de entender, muy avisado ha de ser"});
		this.hma.put(291, new String[]{"Quien con Goblins ha de entender, muy avisado ha de ser"});
		this.hma.put(109, new String[]{"Fuente de sangre"});
	}
}
