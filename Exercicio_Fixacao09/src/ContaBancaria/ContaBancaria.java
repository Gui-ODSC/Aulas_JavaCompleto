package ContaBancaria;

public class ContaBancaria {
	private int numero;
	private String nome;
	private double depositoInicial;//opcional
	
	public ContaBancaria(){	
	}
	public ContaBancaria(int numero, String nome){
		this.numero = numero;
		this.nome = nome;
	}
	public ContaBancaria(int numero, String nome, double quantidade){
		this.numero = numero;
		this.nome = nome;
		realizaDeposito(quantidade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public double getDeposito() {
		return depositoInicial;
	}
	//deposito
	public double realizaDeposito (double quantia) {
		double novoSaldo = this.depositoInicial += quantia;
		return novoSaldo;
	}
	//saque
	public double realizaSaque (double quantia) {
		double novoSaldo = this.depositoInicial -= (quantia + 5);
		return novoSaldo;
	}
	
	public String toString() {
		return "Conta " + this.numero + ", Titular : " + this.nome +
				", Saldo: R$" + String.format("%.2f", this.depositoInicial);
	}
}
