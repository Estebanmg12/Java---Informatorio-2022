import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        String ciudad, calle, nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingresa tu Nombre y Apelido: ");
        nombre = entrada.nextLine();
        System.out.println("Por favor ingresa tu edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor ingresa tu dirección: ");
        calle = entrada.nextLine();
        System.out.println("Por favor ingresa tu ciudad: ");
        ciudad = entrada.nextLine();
        entrada.close();
        System.out.println(ciudad+ " - " +calle+ " - " +edad+ " - " + nombre);
    }
}
