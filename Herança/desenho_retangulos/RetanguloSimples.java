public class RetanguloSimples implements Desenhavel {
    private String texto;

    public RetanguloSimples(String texto) {
        this.texto = texto;
    }

    @Override
    public void desenhar() {
        int largura = texto.length() + 4;
        System.out.println("+" + "-".repeat(largura) + "+");
        System.out.println("| " + texto + " |");
        System.out.println("+" + "-".repeat(largura) + "+");
    }
}