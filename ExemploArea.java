import java.util.Scanner;

public class ExemploArea {
    public static void main(String[] args) {
        double A = 0, B = 0, C = 0;
        double auxA = 0, auxB = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores de A,B e C: ");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        scanner.close();

        // Cálculo e exibição

        // Área do triangulo
        auxA = (A * C) / 2;
        System.out.printf("TRIANGULO: " + "%.3f\n", auxA);
        // Área do circulo
        auxB = 3.14159 * (C * C);
        System.out.printf("CIRCULO: " + "%.3f\n", auxB);
        // Área do trapezio
        auxA = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO: " + "%.3f\n", auxA);
        // Área do quadrado
        auxB = B * B;
        System.out.printf("QUADRADO: " + "%.3f\n", auxB);
        // Área do retângulo
        auxA = A * B;
        System.out.printf("RETANGULO: " + "%.3f\n", auxA);
    }
}