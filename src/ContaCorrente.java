
public class ContaCorrente {
    protected int numConta;
    protected String titular;
    protected double saldo;

    public ContaCorrente() {

    }

    public ContaCorrente(int numero, String nome, double saldoInicial) {
        numConta = numero;
        titular = nome;
        // this.saldo = saldo;
        depositar(saldoInicial);
    }

    public ContaCorrente(int numero, String nome) {
        numConta = numero;
        titular = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void sacar(double quantidade) {
        if (this.saldo < quantidade) {
            System.out.println("Saque nao Realizado");
        } else {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque Realizado");
            // return true;
        }
    }

    void depositar(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }

    // void criarConta(String nome, int num, double valor) {
    // this.titular = nome;
    // this.numConta = num;
    // this.saldo = valor;
    //
    // }

    public void dadosDaConta() {
        System.out.println("+-------------------------------+");
        System.out.println("|          DADOS DA CONTA        ");
        System.out.println("| Titular Conta Corrente: " + this.getTitular());
        System.out.println("| Numero da Conta: " + this.getNumConta());
        System.out.println("| Saldo atual: " + this.getSaldo());
        System.out.println("+-------------------------------+");
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo Atual Conta Corrente: %.2f\n", this.getSaldo());

    }

    public void aplicar(double valor, Poupanca destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            // return true;
        }
        // return false;
    }

    @Override
    public String toString() {
        return "Numero Conta Corrente: "
                + numConta
                + ", Titular: "
                + titular
                + ", Saldo: "
                // + saldo;
                + String.format("%.2f", saldo);
    }

}
