import java.util.Scanner;
public class RelembraVetor {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int vetor [] = new int[5];
        int aux = 0;

        System.out.println("Digite o valor do 5 numeros inteiros: ");
        for(int i=0;i<5;i++){
            vetor[i]=scanner.nextInt();
        }
        for(int i=0;i<5;i++){
            if(vetor[i]>aux){
                aux = vetor[i];
            }
        }

        System.out.println("O valor mais alto e: "+aux);

        scanner.close();
    }
}
