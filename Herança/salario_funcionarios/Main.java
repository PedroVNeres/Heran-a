public class Main {
    public static void main(String[] args) {
        // Criando alguns funcionários para teste
        Funcionario funcionario1 = new Lider("João", 20.0, 160);
        Funcionario funcionario2 = new Gerente("Maria", 25.0, 180);

        // Calculando e exibindo os salários dos funcionários
        System.out.println("Salário de " + funcionario1.getNome() + ": R$" + funcionario1.calcularSalario());
        System.out.println("Salário de " + funcionario2.getNome() + ": R$" + funcionario2.calcularSalario());
    }
}