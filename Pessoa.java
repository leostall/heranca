public class Pessoa {
    private String Nome;
    private int Idade;
    private String Email;

    Pessoa(String Nome, int Idade, String Email){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Email = Email;
    }

    public void Apresentar(){
        System.out.printf("\n%s, possuí %s, e o e-mail: %s", this.Nome, this.Idade, this.Email);
    }
}

class Aluno extends Pessoa{
    private String Matricula;
    private String Curso;

    Aluno(String Nome, int Idade, String Email, String Matricula, String Curso){
        super(Nome, Idade, Email);
        this.Matricula = Matricula;
        this.Curso = Curso;
    }
}

class Professor extends Pessoa{
    private String Disciplina;
    private double Salario;

    Professor(String Nome, int Idade, String Email, String Disciplina, double Salario){
        super(Nome, Idade, Email);
        this.Disciplina = Disciplina;
        this.Salario = Salario;
    }

    void calcular_bonus(){
        this.Salario = this.Salario * 1.10;
    }
}

class Funcionario extends Pessoa{
    private String departamento;
    private int horas_trabalhadas;
    private double salario_hora;

    Funcionario(String Nome, int Idade, String Email, String departamento, int horas_trabalhadas, double salario_hora){
        super(Nome, Idade, Email);
        this.departamento = departamento;
        this.horas_trabalhadas = horas_trabalhadas;
        this.salario_hora = salario_hora;
    }

    double calcular_pagamento(){
        return (this.horas_trabalhadas * this.salario_hora);
    }
}

class Monitor extends Aluno{
    private int horas_monitoria;
    private double valor_hora = 8.2;

    Monitor(String Nome, int Idade, String Email, String Matricula, String Curso, int horas_monitoria){
        super(Nome, Idade, Email, Matricula, Curso);
        this.horas_monitoria = horas_monitoria;
    }

    double calcular_pagamento_monitoria(){
        return (this.horas_monitoria * this.valor_hora);
    }
}
