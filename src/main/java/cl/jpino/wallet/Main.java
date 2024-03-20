package cl.jpino.wallet;

import cl.jpino.wallet.model.Cuenta;
import cl.jpino.wallet.model.Dolar;
import cl.jpino.wallet.model.Euro;
import cl.jpino.wallet.service.Conversion;


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numeroCuenta =  (int) (Math.random() * 100000000);
        int saldo = 0;
        int monto;
        boolean salir = false;
        boolean volver = false;


        Euro euro = new Euro (saldo, "USD");

        System.out.println("Bienvenido a tu billetera digital");
        System.out.println("-----------------------------------");


        do {
            System.out.println("Ingresa tu nombre");
            nombre = sc.next();
            System.out.println("Ingresa tu saldo inicial");
            saldo = sc.nextInt();
        //set saldno
        } while (nombre.isEmpty() || saldo == 0);

        do {
        System.out.println("\n");
        System.out.println("Billetera digital de: " + nombre);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("-----------------------------------");
        System.out.println("1. Administracion de tus fondos");
        System.out.println("2. Ver saldo en otra moneda");
        System.out.println("3. Resumen de cuenta");
        System.out.println("4. Salir");

            do {
                switch (sc.nextInt()) {
                    case 1 -> {
                        System.out.println("Administracion de fondos");
                        System.out.println("-----------------------------------");
                        System.out.println("1. Depositar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Consultar saldo");
                        System.out.println("4. Volver al menu principal");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.println("Ingrese el monto a depositar");
                                monto = sc.nextInt();
                            }
                            //cuentacorriente.depositar(monto);
                            case 2 -> {
                                System.out.println("Ingrese el monto a retirar");
                                monto = sc.nextInt();
                            }
                            //saldoSuficiente = validarSaldoSuficiente(saldo, monto);
                            //cuentacorriente.retirar(monto);
                            case 3 -> System.out.println("Saldo actual: " + saldo);
                            case 4 -> volver = true;
                            default -> System.out.println("Opcion no valida");
                        }
                    }
                    case 2 -> {
                        System.out.println("Ver saldo en otra moneda");
                        System.out.println("-----------------------------------");
                        System.out.println("1. Ver saldo en dolares");
                        System.out.println("2. Ver saldo en euros");
                        System.out.println("5. Volver al menu principal");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.println("****Saldo en Dolares****");
                                Dolar dolar = new Dolar (saldo, "USD");
                                sc.nextLine();
                            }

                            case 2 -> {
                                System.out.println("****Saldo en Euros****");

                            }

                            case 5 -> volver = true;
                            default -> System.out.println("Opcion no valida");
                        }
                    }
                    case 3 -> {
                        System.out.println("Resumen de cuenta");
                        System.out.println("-----------------------------------");
                    }
                    //cuentacorriente.resumenDeCuenta();
                    case 4 -> salir = true;
                    default -> System.out.println("Opcion no valida");
                }
            } while (!volver);

        } while (!salir);
    }
}
