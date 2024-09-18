package exercicio1;

public class Retangulo {
    private int altura;
    private int largura;

    // Construtor para inicializar altura e largura
    public Retangulo(int altura, int largura) {
        setAltura(altura);
        setLargura(largura);
    }

    // Métodos getters e setters
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura >= 0 && altura <= 20) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida! Deve estar entre 0 e 20.");
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (largura >= 0 && largura <= 20) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida! Deve estar entre 0 e 20.");
        }
    }

    public int calcularArea() {
        return altura * largura;
    }

    public int calcularPerimetro() {
        return 2 * (altura + largura);
    }
}
