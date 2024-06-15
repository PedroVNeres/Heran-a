public abstract class Funcionario {
    protected String nome;
    protected double valorHora;
    protected int horasTrabalhadas;

    public Funcionario(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract double calcularSalario();
}
