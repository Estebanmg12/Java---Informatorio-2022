import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2,suma,resta,multiplicacion,division,modulo;

        System.out.println("Por favor introduzca 2 numeros para realizar las opreaciones");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        entrada.close();
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1 * numero2;
        division = numero1/numero2;
        modulo = numero1%numero2;

        System.out.println(numero1+" + "+numero2+" = "+suma);
        System.out.println(numero1+" - "+numero2+" = "+resta);
        System.out.println(numero1+" * "+numero2+" = "+multiplicacion);
        System.out.println(numero1+" / "+numero2+" = "+division);
        System.out.println(numero1+" % "+numero2+" = "+modulo);
    }
}
