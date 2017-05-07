package entities;

public class Effect {
	private int life, mana;
	
	public Effect(int life, int mana){
		this.life = life;
		this.mana = mana;
	}

	public int getLife() {
		return life;
	}
	public int getMana() {
		return mana;
	}	
}
