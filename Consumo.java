import java.util.Scanner;
public class Consumo {
    public static void main(String[]args){
        double X,Y,consumo=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da distancia percorrida [em KM] e o litros gastos: ");
        //Entrada de dados
        X=scanner.nextDouble();
        Y=scanner.nextDouble();
        scanner.close();
        //calculo e saída de dados
        consumo = X/Y;
        System.out.printf("%.3f km/l\n",consumo);
    }
}
