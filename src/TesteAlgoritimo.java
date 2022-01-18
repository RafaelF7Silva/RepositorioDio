import java.util.Scanner;

public class TesteAlgoritimo {

    public static void main (String [] args){

        int numero;
        Scanner teclado = new Scanner( System .in);

        System.out.println("Informe um número:");
        numero = teclado.nextInt();

        if ( numero > 10 ) {
            System.out.println(numero);
        }else{
            numero = 0;
            System.out.println(numero);
            }
        }
    }


