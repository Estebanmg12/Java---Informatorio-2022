import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
    
        System.out.println("Hola ¿Cómo te llamas?");
        nombre = entrada.nextLine();
        System.out.println("HOLA " + nombre + "!!!");
        entrada.close();
    }
}