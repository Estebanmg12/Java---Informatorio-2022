import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int comienzo=1;

        System.out.print("Por favor introduzca un número: ");
        numero = entrada.nextInt();
        entrada.close();
        while (comienzo<=numero) {
            comienzo++;
            for(int i=1; i<comienzo;i++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
