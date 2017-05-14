package generator;

import java.util.HashMap;

import entities.GroupEnemies;
import entities.Item;

public class Generator {

	public void generateEnemiesTable(HashMap<Integer, GroupEnemies> hmge){
		hmge.put(67, new GroupEnemies("Ratón-nube",1));
		hmge.put(76, new GroupEnemies("Coloso llorón",1));
		hmge.put(74, new GroupEnemies("Goblins de las nubes",10));
		hmge.put(104, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		hmge.put(256, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		hmge.put(257, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		hmge.put(280, new GroupEnemies("Rey atormentado de la Tormenta Tormentosa",1));
		hmge.put(260, new GroupEnemies("Caníbales",20));
	}
	
	public void generateItemObtainedTable(HashMap<Integer, Item> hmio){
		hmio.put(6, new Item("Cucurucho de helado","Comida suculenta con sabor a cactus suculento."));
		hmio.put(72, new Item("Poción misteriosa","Burbujeaba exotéricamente, cuyo color no era muy agradable a la vista."));
		hmio.put(265, new Item("Corona del Rey atormentado de la Tormenta Tormentosa","Sientes un dolor indescriptible cuando está cerca."
				+ " Mirarla durante mucho tiempo seguido produce ceguera del reflejo deslumbrante que tiene."));
		hmio.put(76, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		hmio.put(264, new Item("Corona del Rey atormentado de la Tormenta Tormentosa","Sientes un dolor indescriptible cuando está cerca."
				+ " Mirarla durante mucho tiempo seguido produce ceguera del reflejo deslumbrante que tiene."));
	}
	
	public void generateItemDeletedTable(HashMap<Integer, Item> hmid){
		hmid.put(306, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		hmid.put(307, new Item("Corazón de Coloso Llorón","Es un hongo latente y desgastado con el paso de los eones. Sin embargo, se sigue"
				+ " reproduciendo por esporas."));
		hmid.put(264, new Item("Corona del Rey atormentado de la Tormenta Tormentosa","Sientes un dolor indescriptible cuando está cerca."
				+ " Mirarla durante mucho tiempo seguido produce ceguera del reflejo deslumbrante que tiene."));
		hmid.put(6, new Item("Cucurucho de helado","Comida suculenta con sabor a cactus."));
	}
	
	public void generateAchievemetsTable(HashMap<Integer, String[]> hma){
		hma.put(5, new String[]{"Al cabo de 100 años todos seremos calvos"});
		hma.put(6, new String[]{"Desobedecer"});
		hma.put(7, new String[]{"Desobedecer"});
		hma.put(18, new String[]{"Desobedecer"});
		hma.put(19, new String[]{"Desobedecer"});
		hma.put(66, new String[]{"Desobedecer"});
		hma.put(67, new String[]{"Desobedecer","Asesina","Extinguir a los Ratón Nube"});
		hma.put(70, new String[]{"Desobedecer"});
		hma.put(71, new String[]{"Desobedecer"});
		hma.put(258, new String[]{"Desobedecer"});
		hma.put(259, new String[]{"Desobedecer"});
		hma.put(262, new String[]{"Desobedecer"});
		hma.put(263, new String[]{"Desobedecer"});
		hma.put(276, new String[]{"Desobedecer"});
		hma.put(275, new String[]{"Desobedecer","Hasta morir, todo es vida"});
		hma.put(273, new String[]{"Estafado"});
		hma.put(256, new String[]{"Cuando corre la ventura, las aguas son truchas"});
		hma.put(74, new String[]{"Asesina"});
		hma.put(76, new String[]{"Asesina"});
		hma.put(104, new String[]{"La suerte te acompañó por este camino","Asesina"}); // !!
		hma.put(256, new String[]{"Asesina"});
		hma.put(257, new String[]{"Asesina", "Hoy figura, mañana sepultura"});
		hma.put(260, new String[]{"Asesina"});
		hma.put(280, new String[]{"Asesina","A los bienes y a los males, la muerte los hace iguales"});
		hma.put(426, new String[]{"Rebelde"});
		hma.put(427, new String[]{"Error 404"});
		hma.put(25, new String[]{"Plato gourmet"});
		hma.put(288, new String[]{"Esto es mejor que las drogas"});
		hma.put(289, new String[]{"Lección aprendida, no te fíes de un Goblin"});
		hma.put(110, new String[]{"Quitate tú, para que me ponga yo"});
		hma.put(111, new String[]{"Quitate tú, para que me ponga yo"});
		hma.put(290, new String[]{"Quien con Goblins ha de entender, muy avisado ha de ser"});
		hma.put(291, new String[]{"Quien con Goblins ha de entender, muy avisado ha de ser"});
		hma.put(109, new String[]{"Fuente de sangre"});
	}
}
