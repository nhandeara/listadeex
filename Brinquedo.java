package Listadeex;

public class Brinquedo {
	
	private String cor;
	private String tipo;
	private int velocidade;
	private String nome;
	
	public Brinquedo (String cor, String tipo, int velocidade, String nome) {
	this.nome = cor;
	this.tipo= tipo;
	this.velocidade = velocidade;
	this.nome = nome;
	
	}
public void mover() {
	System.out.println("mover");
}
}
