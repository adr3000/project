package projeto1;

public class Conta {
	private int agencia;
	protected int conta;
	protected String titular;
	private double limite;
	protected double saldo;
	private float valorlimite;

	public Conta(int agencia, int conta, String titular, double limite, double saldo, float valorlimite) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.limite = limite;
		this.saldo = saldo;
		this.valorlimite = valorlimite;
	}

	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorlimite() {
		return valorlimite;
	}

	public void setValorlimite(float valorlimite) {
		this.valorlimite = valorlimite;
	}

	public void depositar(int valorDepositado) {
		saldo += valorDepositado;
		System.out.println("Depositado: " + valorDepositado);
		System.out.println("Novo saldo: " + saldo + "\n");
	}

	public int sacar(int valorSaque) {
		if (saldo >= valorSaque) {
			saldo -= valorSaque;
			System.out.println("Sacado: " + valorSaque);
			System.out.println("Novo saldo: " + saldo + "\n");
		} else {
			System.out.println("Saldo insuficiente. Faça um depósito\n");
		}
		return valorSaque;
	}

	

}
