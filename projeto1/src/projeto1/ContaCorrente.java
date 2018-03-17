package projeto1;

public class ContaCorrente extends Conta {

	
	public ContaCorrente(int agencia, int conta, String titular, double limite, double saldo,float valorlimite) {
		super(agencia, conta, titular, limite, saldo, valorlimite);
	}

	
	@Override
	public void depositar(int valorDepositado) {
		super.saldo = saldo + valorDepositado;
	}
	
	@Override
	public int sacar(int valorSaque) {
		if (valorSaque <= super.saldo)
			super.saldo = super.saldo - valorSaque ;
		else
			System.out.println("Saldo insuficiente!");
		return valorSaque;
	}
	

	public void mostrarStatus() {
		System.out.println(super.titular);
		System.out.println(super.conta);
		System.out.println("R$ " + saldo);
	}


}