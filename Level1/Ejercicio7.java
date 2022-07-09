import java.util.Scanner;

public class Ejercicio7 {
 
    public static void main(String[] args) {
        String texto;
        char c;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una palabra en minuscula: ");
        texto = entrada.nextLine();
        entrada.close();
 
        for(int i=0; i<texto.length(); i++) {
            c = (texto.charAt(i));
            c = (char)(c + (int) 'A' - (int) 'a');

            System.out.print(c);
        }
    }
}

