package Listadeex;

public class Moto extends Brinquedo{
	public Moto(String cor, String tipo, int velocidade, String nome) {
		super(cor, tipo, velocidade, nome);
			}
			
			@Override
			public void mover() {
				System.out.println("O navio está em movimento");
			}
}
