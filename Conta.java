import java.util.ArrayList;

public class Conta {
    protected String nomeTitular;
    protected String numeroConta;
    protected double saldo;
    protected String dataAbertura;

    Conta(String nome, String conta){
        this.nomeTitular = nome;
        this.numeroConta = conta;
        this.saldo = 0;
        this.dataAbertura = "11/09/2024";
    }

    double sacar(double valor){
        if(valor >= this.saldo){
            System.err.println("\nERRO: Saldo indisponível.");
            return -1;
        }

        this.saldo = (this.saldo - valor);
        return this.saldo;

    }

    double depositar(double valor){
        if(valor <= 0){
            System.err.println("\nERRO: Valor menor ou igual a 0.");
            return -1;
        }

        this.saldo = (this.saldo + valor);
        return this.saldo;
    }

    public String toString(){
        return String.format("Conta nome=%s, número=%, saldo=%.2f, dataAbertura=%s", this.nomeTitular, this.numeroConta, this.saldo, this.dataAbertura);
    }
}

class ContaPoupanca extends Conta{
    private double taxaRendimento;

    ContaPoupanca(String nome, String conta, double taxa){
        super(nome, conta);
        this.taxaRendimento = taxa;
    }

    public boolean debitarRendimento(double valor){
        this.saldo = this.saldo + valor * this.taxaRendimento;
        return true;
    }

    public String toString(){
        return String.format("Conta Poupança nome=%s, número=%s, saldo=%.2f, dataAbertura=%s, redimento=%.2f", this.nomeTitular, this.numeroConta, this.saldo, this.dataAbertura, this.taxaRendimento);
    }
}

class ContaCorrente extends Conta{
    private double taxaManutencao;

    ContaCorrente(String nome, String conta, double taxa){
        super(nome, conta);
        this.taxaManutencao = taxa;
    }

    public boolean debitarManutencao(){
        if(this.saldo >= this.taxaManutencao) {
            this.saldo = this.saldo - this.taxaManutencao;
            return true;
        } else{
            System.err.println("\nERRO: Saldo insuficiente.");
            return false;
        }
    }

    public String toString(){
        return String.format("Conta Corrente nome=%s, número=%s, saldo=%.2f, dataAbertura=%s, manutenção=%.2f", this.nomeTitular, this.numeroConta, this.saldo, this.dataAbertura, this.taxaManutencao);
    }
}

class Banco{
    private String nome;
    private ArrayList<Conta> contas;

    Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public String toString(){
        String retorno = "--- BANCO " + this.nome + "---";

        for(Conta c : contas){
            retorno = "\n" + retorno + "\n" + c.toString();
        }

        return retorno;
    }

}
/*
class Main{
    public static void main(String[] args) {
        Banco b1 = new Banco("Santo André");

        ContaCorrente cc1 = new ContaCorrente("Leonardo Alves", "012024", 0.1);
        ContaPoupanca cp1 = new ContaPoupanca("Giovanna de Lara", "022024", 100);

        b1.adicionarConta(cc1);
        b1.adicionarConta(cp1);

        System.out.print(b1);

        cc1.depositar(1000);
        cp1.depositar(500);

        cc1.sacar(600);
        cp1.sacar(700);
    }
}*/
