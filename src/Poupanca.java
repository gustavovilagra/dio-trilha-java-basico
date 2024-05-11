public class Poupanca extends ContaCorrente {

	public Poupanca() {

	}

	public Poupanca(int numero, String nome) {
		numConta = numero;
		titular = nome;
	}

	public void resgatar(double valor, ContaCorrente destino) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);

		} else {
			System.out.println("saldo insuficiente: Saldo atual: " + getSaldo());
		}
	}

	@Override
	public void mostrarSaldo() {
		System.out.println("Saldo atual da Poupanca: " + this.getSaldo());
	}

	@Override
	public void dadosDaConta() {
		System.out.println("+-------------------------------+");
		System.out.println("| Titular Poupanca: " + titular);
		System.out.println("| Numero da Conta: " + this.getNumConta() + "-1");
		System.out.println("| Saldo atual: " + this.getSaldo());
		System.out.println("+-------------------------------+\n");
	}

}
