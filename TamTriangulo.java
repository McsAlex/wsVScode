import java.util.Scanner;

public class TamTriangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com os valores dos tres inteiros: ");
        int numero=scanner.nextInt();
        int numero1=scanner.nextInt();
        int numero2=scanner.nextInt();
        int higher = max(numero,numero1,numero2);

        showResult(higher);

        scanner.close();
    }
    public static int max(int x, int y, int z){
        int aux = 0;
        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("higher = "+value);
    }
}
