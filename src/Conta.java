
public class Conta extends Pessoafj{
	protected String numero;
	protected double saldo;

	public Conta(String nome, String cpf, String sobrenome, String numero, double saldo) {
		super(nome, sobrenome, cpf);
		this.numero = numero;
		this.saldo = saldo;

	}

	public Conta(String numero, String razaoSocial, String nome, int cnpj, double saldo) {
		super(nome, cnpj, razaoSocial);
		this.numero = numero;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getCliente() {
		return super.toString();
	}

}
