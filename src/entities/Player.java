package entities;

public class Player {
	private int life;
	private String name;
	private boolean isAlive = true;
	
	public Player(){
		this.life = 100;
		this.name = "UsuarioGenrico";
	}
	
	public Player(String name){
		this.life = 100;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void modifiedLife(int life) {
		if(this.life + life <= 0) {this.isAlive = false;}
		else {this.life += life;}
	}
	
	public boolean isAlive(){
		return this.isAlive;
	}
}
	