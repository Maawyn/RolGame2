package entities;

public class Node {
	private Node pred, left, right;
	private String info;
	private int grado, id;
	
	public Node() { // Nodo vacio
		this.pred = null;
		this.left = null;
		this.right = null;
		this.info = null;
		this.grado = 0;
		this.id = -1;
	}
	
	public Node(String info,int grado, int id) { //Nodo con informacion
		this.pred = null;
		this.left = null;
		this.right = null;
		this.info = info;
		this.grado = grado;
		this.id = id;
	}

	public Node(Node pred, Node left, Node right, String info, int grado, int id) { //
		this.pred = pred;
		this.left = left;
		this.right = right;
		this.info = info;
		this.grado = grado;
		this.id = id;
	}

	public Node getPred() {
		return pred;
	}

	public void setPred(Node pred) {
		this.pred = pred;
	}

	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	
	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}


	public Object getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public boolean hasLeft(){
		return this.left != null;
	}
	
	public boolean hasChildren(){
		return hasLeft() && hasRight();
	}
	
	public boolean hasRight(){
		return this.right != null;
	}
	
	public Node getNext(int pos){
		if(pos == 1)
			return this.left;
		if(pos == 2)
			return this.right;
		return null;
	}
	public Node getNextByIA(boolean pos){
		if(pos)
			return this.left;
		if(!pos)
			return this.right;
		return null;
	}
	@Override
	public String toString(){
		return this.info;
	}
	public String show(){
		String message = this.info;
		if(hasLeft()) message += "\n"+ this.getLeft().toString();
		if(hasRight()) message += "\n"+ this.getRight().toString();
		return message;
	}
}
