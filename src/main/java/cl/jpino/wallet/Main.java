package cl.jpino.wallet;

import cl.jpino.wallet.model.Dolar;
import cl.jpino.wallet.model.Euro;
import cl.jpino.wallet.service.Cuenta;


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        String nombre;
        int numeroCuenta =  (int) (Math.random() * 100000000);
        double saldo = cuenta.getSaldo();
        double cantidad;
        boolean salir = false;
        boolean volver = false;


        System.out.println("Bienvenido a tu billetera digital");
        System.out.println("-----------------------------------");


        do {
            System.out.println("Ingresa tu nombre");
            nombre = sc.next();
            System.out.println("Ingresa tu saldo inicial");
            cantidad = sc.nextDouble();
            cuenta.ingresarDinero(cantidad);

        } while (nombre.isEmpty() || cantidad <= 0);

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
                                System.out.println("Ingrese la cantidad a depositar");
                                cantidad = sc.nextDouble();
                                cuenta.ingresarDinero(cantidad);
                            }
                            //cuentacorriente.depositar(monto);
                            case 2 -> {
                                System.out.println("Ingrese la cantidad a retirar");
                                cantidad = sc.nextDouble();
                                cuenta.retirarDinero(cantidad);
                            }
                            //saldoSuficiente = validarSaldoSuficiente(saldo, monto);
                            //cuentacorriente.retirar(monto);
                            case 3 -> {System.out.println("Saldo actual: " + saldo);}
                            case 4 -> {volver = true;}
                            default -> {System.out.println("Opcion no valida");}
                        }
                    }
                    case 2 -> {
                        System.out.println("Ver saldo en otra moneda");
                        System.out.println("-----------------------------------");
                        System.out.println("1. Ver saldo en dolares");
                        System.out.println("2. Ver saldo en euros");
                        System.out.println("3. Volver al menu principal");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.println("****Saldo en Dolares****");
                                Dolar dolar = new Dolar (cuenta.getSaldo(), "USD");
                                dolar.mostrarResultado();//devuelve el saldo en dolares
                                System.out.println("-----------------------------------");
                            }

                            case 2 -> {
                                System.out.println("****Saldo en Euros****");
                                Euro euro  = new Euro (saldo, "Euro");
                                euro.mostrarResultado();//devuelve 0.0 ??
                                System.out.println("-----------------------------------");
                            }

                            case 3 -> volver = true;
                            default -> System.out.println("Opcion no valida");
                        }
                    }
                    case 3 -> {
                        System.out.println("Resumen de cuenta");
                        System.out.println("-----------------------------------");
                        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

                    }
                    //cuentacorriente.resumenDeCuenta();
                    case 4 -> salir = true;
                    default -> System.out.println("Opcion no valida");
                }
            } while (volver);

        } while (!salir);
    }
}
