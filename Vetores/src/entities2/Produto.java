package entities2;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto(){
		
	}
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public String toString() {
		return "Nome: " + nome + "\nPreco: " + preco;
	}
}
