public class Lider extends Funcionario {
    public Lider(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        // Adicione a lógica para calcular o salário de um líder
        return valorHora * horasTrabalhadas * 1.02; // Incremento de 2%
    }
}
