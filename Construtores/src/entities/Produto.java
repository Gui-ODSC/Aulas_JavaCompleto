package entities;
public class Produto {
	//atributos
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor
	public Produto() {//sobrecarga
		
	}
	
	public Produto(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//sets e gets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	//metodos
	public double precoEstoque() {
		return quantidade * preco;
	}
	public void aumentaQuant(int aumento) {
		this.quantidade+=aumento;
	}
	public void diminuiQuant(int reducao) {
		this.quantidade-=reducao;
	}
	public String toString(){
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$ "
			+ String.format("%.2f", precoEstoque());
	}
}

