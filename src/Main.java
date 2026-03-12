/* En este ejercicio limpié más la estructura del código
empezando a usar MÉTODOS,
y también se recorrieron*/

// Estoy haciendo mis primeras pruebas con Github
// Comentario 2

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    static int saldo = 0;
    static boolean encendido = true;

    public static void main(String[] args) {

        System.out.println("Eliud Flores Hernández");

        int eligeOpcion;

        while (encendido) {

            System.out.println("\n\n*** MENU BANCARIO ***");
            System.out.println("1. SALDO");
            System.out.println("2. DEPÓSITO");
            System.out.println("3. RETIRO");
            System.out.println("4. SALIR");
            System.out.print("Elige la opción (1-4): ");

            eligeOpcion = teclado.nextInt();

            switch (eligeOpcion) {

                case 1 -> mostrarSaldo();

                case 2 -> realizarDeposito();

                case 3 -> retiro();

                case 4 -> salir();

                default -> System.out.println("Opción incorrecta");
            }

        }

    }

    //MÉTODO DEL SALDO
    public static void mostrarSaldo() {
        System.out.println("Tu saldo es de: $ " + saldo);
    }

    //MÉTODO DEPÓSITO
    public static void realizarDeposito() {
        System.out.print("Cantidad a depositar: $ ");
        int capturaDeposito = teclado.nextInt();
        saldo += capturaDeposito;
        System.out.println();

    }

    //MÉTODO RETIRO
    public static void retiro() {
        System.out.print("Dime cuánto retiras: $ ");
        int capturaRetiro = teclado.nextInt();
        saldo -= capturaRetiro;
        System.out.println();
    }

    //MÉTODO SALIR

    public static void salir() {

        System.out.println("\n\nHasta luego Eliud");
        encendido = false;

    }
}
