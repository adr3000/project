package projeto1;

public final class ContaPoupanca extends Conta{
	
	   
	public double percentAdd;

	   public ContaPoupanca(int agencia, int conta, String titular, double limite, double saldo, float valorlimite, float percentAdd) {
		super(agencia, conta, titular, limite, saldo, valorlimite);
		   this.percentAdd = percentAdd;
	   }
	   
	public void addRendimentos(float addrendimento){
	      this.saldo = this.saldo * addrendimento;
	   }
	}