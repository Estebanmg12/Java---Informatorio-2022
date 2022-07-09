import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int inicio=0;
        int factorial=1;

        System.out.print("Ingrese el número que desea calcular su factorial: ");
        inicio = entrada.nextInt();
        entrada.close();
        int numero=inicio;
        while(inicio!=0){
            factorial *= inicio;
            inicio--;
        }
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}
