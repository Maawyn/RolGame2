package tree;

import entities.Node;

public class BinaryTree {
	private Node root;
	private Node current;
	
	public BinaryTree(){
		root = null;
	}
	
	//Insertion method
	public void addRoot(Node e){
		if(isEmpty()) {
			root = e;
		}else{
			throw new RuntimeException("Root has already a value");
		}
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	public Node getActual(){
		return current;
	}
	public void addTo(int idParent, Node e){
		inOrder(idParent, root);
		Node parent = current;
		
		if(!parent.hasLeft()){
			parent.setLeft(e);
			e.setPred(parent);
			return;
		}
		if(!parent.hasRight()){
			parent.setRight(e);
			e.setPred(parent);
			return;
		}
	}
	
	public void inOrder(int id, Node e){
        if(e != null){
            this.inOrder(id, e.getLeft());
            if(e.getId() == id)
                this.current = e;
            this.inOrder(id, e.getRight());
        }
    }
	
	public Node searchId(int id, Node start){ //start. Node were we start the search		
		if(isEmpty()) throw new RuntimeException ("This tree is empty"); 
		if(start.getId() == id) //CORRECT
			return start; // CORRECT
		else if(start.hasLeft() && start.getId() != id) // If the actual node has a different id look the left child
			return searchId(id, start.getLeft());
		else if(start.hasRight() && start.getId() != id) // If the actual node has a different id look the right child
			return searchId(id, start.getRight());
		
		return start;
	}
	
	public Node getRoot(){
		return root;
	}
}

