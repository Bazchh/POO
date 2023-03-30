package ClassesAbstratas.Empresa;

public class Funcionario {
    private double salario;
    private int horasTrabalhadas;
    private String nome;

    Funcionario(String nome) {
        this.nome = nome;
        this.horasTrabalhadas = 1;
        this.salario = 2 * this.horasTrabalhadas;
    }

    Funcionario(String nome, double salario, int horasTrabalhadas) {
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
