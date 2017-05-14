package controllers;

import tree.BinaryTree;
import entities.Node;
import main.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TreeManager {
	private String name = "Babah";
	private BinaryTree BTree = new BinaryTree();
	
	public BinaryTree generateBinaryTree(){
		BTree = new BinaryTree();
		BTree.addRoot(new Node(name + " era la maga m�s reconocida y m�s poderosa del reino. Y hac�a ya un tiempo, que los habitantes del valle del Agua Clara"
				+ " estaban siendo afectado por unas tormentas bestiales. Por eso, le hab�an encargado derrotar al gran rey de la Tormenta, y ah� estaba ella,"
				+ " decidida a acabar con �l. Nuestra protagonista " + name + " estaba en un acantilado, a lo lejos pod�a ver la tormenta."
						+ " Entonces " + name + " decidi� atravesar las nubes hacia la tormenta.", 0, 1));

		File fileDialogs = new File(Main.dialogsPath);
		try {
			addNodesByFile(new FileReader(fileDialogs));
		} catch (FileNotFoundException e) {
			System.out.println("No ha sido encontrado el fichero de Dialogs correctamente por favor introduce la path del fichero dialogs.txt:");
			Main.dialogsPath = Main.sc.nextLine();
			openDialogFile();
		}
		return BTree;
	}
	
	private void openDialogFile(){
		try {
			addNodesByFile(new FileReader(Main.dialogsPath));
		} catch (FileNotFoundException e) {
			System.err.println("No has introducido una ruta para el fichero de dialogs v�lido.");
			System.exit(-1);
		}
	}
	
	private void addNodesByFile(FileReader fr){
		String line;
		try (BufferedReader br  = new BufferedReader(fr);) {
			while((line=br.readLine()) != null){
				if("".equals(line)){
					continue;
				}
				if(line.contains("--name")){
					line = line.replaceAll("--name", name);
				}
				if(line.contains("\"")){
					line = line.replaceAll("\"", "");
				}
				String[] newObjectNode = line.split("#");
				int parentId = Integer.valueOf(newObjectNode[0].trim());
				String content = newObjectNode[1];
				int grade = Integer.valueOf(newObjectNode[2].trim());
				int id = Integer.valueOf(newObjectNode[3].trim().replaceAll(";", ""));
				BTree.addTo(parentId, new Node(content, grade, id));
			}
		} catch (NumberFormatException e) {
			System.err.println("En el fichero de dialogs hay valores corrupto.");
			System.exit(-1);
		} catch (IOException e) {
			System.err.println("El fichero de dialogs introducido esta corrupto.");
			System.exit(-1);
		} catch (Exception e){
			System.err.println("Ha ocurrido un error en la aplicaci�n: " + e.getMessage());
			System.err.println("Saliendo de la aplicaci�n.");
			System.exit(-1);
		}
	}
}
