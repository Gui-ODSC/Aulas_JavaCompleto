package Funcionario;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(){
	}
	public Funcionario(int id, String nome, double salario){
		setId(id);
		setNome(nome);
		setSalario(salario);
	}
	public void aumentaSalario(double porcent) {
		this.salario += (this.salario * porcent / 100);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	public double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		return this.id + ", " + this.nome + ", " + String.format("%.2f", this.salario);
	}
}
