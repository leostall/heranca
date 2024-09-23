public class Animal {
    private String nome;
    private String raca;

    public Animal(){
        this.nome = "Rex";
        this.raca = "Vira-Lata";
    }

    public Animal(String nome){
        this.nome = nome;
        this.raca = "Vira-Lata";
    }

    public void caminhar(){
        System.out.printf("%s andou\n", this.nome);
    }

    public String getNome(){
        return this.nome;
    }

    // ----------------------------------------------
}

class Cachorro extends Animal{
    public Cachorro (String nome){
        super(nome);
    }

    public void latir(){
        System.out.printf("%s latiu\n", getNome());
    }
}

class Gato extends Animal{
    public Gato (String nome){
        super(nome);
    }

    public void miar(){
        System.out.printf("%s miou\n", getNome());
    }
}


/*class Main{
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Totó");
        Gato g1 = new Gato("Gatinho");

        c1.latir();
        g1.miar();

        c1.caminhar();
        g1.caminhar();
    }
}*/


