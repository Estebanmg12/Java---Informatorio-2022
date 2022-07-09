import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        int suma=0;
        int i=1;

        System.out.println("Por favor introduzca 2 números enteros: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        entrada.close();

        while(i<=numero2) {
            suma += numero1;
            i++;
        }
        System.out.println("El resultado de la operación "+numero1+" x "+numero2+" = "+suma);
    }
}
