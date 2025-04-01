import java.util.Scanner;

public class exMat5 {
    public static void main(String[] args) {
        int tam = 3;
        int matrizA[][] = new int[tam][tam];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva os numeros inteiros da matriz: ");
        for (int linha = 0; linha < tam; linha++) {
            for (int coluna = 0; coluna < tam; coluna++) {
                matrizA[linha][coluna] = scanner.nextInt();
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                int aux = i + j;
                if (aux % 2 == 0) {
                    System.out.print(matrizA[i][j] + "|");
                }
                else{
                    System.out.print(" |");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
