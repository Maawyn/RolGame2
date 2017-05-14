package entities;

import interfaces.IPersonaje;

public class Jugador implements IPersonaje {
	private int vida, mana;
	private String nombre;
	
	public Jugador(){
		this.vida = 100;
		this.mana = 100;
		this.nombre = "UsuarioGenerico";
	}
	
	public Jugador(String nombre){
		this.vida = 100;
		this.mana = 100;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public void morir() {
		
	}

	@Override
	public int atacar(int mod, IPersonaje obje) {	
		return 0;
	}

	@Override
	public void recuperarVida(int vida) {
		if(this.vida + vida >= 100) {this.vida = 100;}
		else {this.vida += vida;}
	}

	@Override
	public void perderVida(int vida) {
		if(this.vida - vida <= 0) {morir();}
		else {this.vida -= vida;}
	}

	public void recuperarMana(int mana) {
		if(this.mana + mana >= 100) {this.mana = 100;}
		else {this.mana += mana;}
	}

	public void perderMana(int mana) {
		if(this.mana - mana <= 0) {this.mana = 0;}
		else {this.mana -= mana;}
	}
}
	