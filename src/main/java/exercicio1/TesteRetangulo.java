package exercicio1;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(15, 10);

        System.out.println("Área: " + retangulo.calcularArea()+" m²");
        System.out.println("Perímetro: " + retangulo.calcularPerimetro()+" metros");
    }
}
