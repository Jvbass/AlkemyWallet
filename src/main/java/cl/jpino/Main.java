package cl.jpino;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int numeroCuenta =  (int) (Math.random() * 100000000);;
        int saldo;
        String opcion = "";

        System.out.println("Bienvenido a tu billetera digital");
        System.out.println("-----------------------------------");

        do {
            System.out.println("Ingresa tu nombre de usuario");
            nombre = sc.next();
            System.out.println("Ingresa tu saldo inicial");
            saldo = sc.nextInt();
        } while (nombre.isEmpty() || saldo == 0);


        System.out.println("\n");
        System.out.println("Billetera digital de: " + nombre);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("-----------------------------------");
        System.out.println("1. Administracion de tus fondos");
        System.out.println("2. Conversion de moneda");
        System.out.println("3. Resumen de cuenta");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Administracion de fondos");
                System.out.println("-----------------------------------");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Consultar saldo");

                break;
            case 2:

                break;
            default:
                System.out.println("Opcion no valida");

        }
    }
}
