public class Gerente extends Funcionario {
    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        // Adicione a lógica para calcular o salário de um gerente
        return valorHora * horasTrabalhadas * 1.05; // Incremento de 5%
    }
}