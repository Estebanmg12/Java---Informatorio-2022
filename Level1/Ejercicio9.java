import java.util.Scanner;

public class Ejercicio9 {
   
    public static int contarCaracter (String cadena, char letra) {
        int posicion=0;
        int contador=0;
        posicion=cadena.indexOf(letra);

        while(posicion!=-1){
            contador++;
            posicion=cadena.indexOf(letra, posicion+1);
        }
        return contador;
    }

    public static void main(String [] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese el texto a analizar");
        String texto;
        texto= entrada.nextLine();
        System.out.println("Ingrese la letra a buscar y contar");
        char letra;
        letra = entrada.next().charAt(0);
        entrada.close();
        int cont=0;
        cont = contarCaracter(texto, letra);
        System.out.println(cont);
    }
    
}
