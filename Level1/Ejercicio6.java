import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        System.out.println("Por favor introduzca 2 números para realizar la operación : ");
        int numero1, numero2;
        int resultado=1;
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        entrada.close();

        for(int i=1; i<=numero2; i++) {
            resultado *= numero1;
        }
        System.out.println("El rsultado de "+numero1+" elevado a "+numero2+" = "+resultado);
    }
}
