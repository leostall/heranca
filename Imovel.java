public class Imovel {
    private String endereco;
    private double preco;

    Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    double getPreco(){
        return this.preco;
    }

    String getEndereco(){
        return this.endereco;
    }
}

class ImovelNovo extends Imovel{
    ImovelNovo(String endereco, double preco) {
        super(endereco, preco);
    }

    public double getAcrescimo(){
        return (getPreco() * 1.1);
    }

    public String toString(){
        return String.format("Imovel Novo %s, preço %f", getEndereco(), getAcrescimo());
    }

}

class ImovelVelho extends Imovel{
    ImovelVelho(String endereco, double preco) {
        super(endereco, preco);
    }

    public double getDesconto(){
        return (getPreco() * 0.9);
    }

    public String toString(){
        return String.format("Imovel Velho %s, preço %f", getEndereco(), getDesconto());
    }
}

/*class Main{
    public static void main(String[] args) {
        ImovelVelho iv = new ImovelVelho("Marcelo de Souza Alves", 1200000);
        ImovelNovo in = new ImovelNovo("José da Cruz", 2900000);

        System.out.println(iv.getDesconto());
        System.out.println(in.getAcrescimo());

        System.out.println(iv.toString());
        System.out.println(in.toString());
    }
}*/