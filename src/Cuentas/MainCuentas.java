package Cuentas;

public class MainCuentas {
    public static void main(String[] args) {

        CuentaAhorros miCuentaAhorros = new CuentaAhorros("Michael Ramírez", 500.0);
        System.out.println(miCuentaAhorros.toString());

        System.out.println(miCuentaAhorros.getTitular() + " empezó una cuenta de ahorros con: $" + miCuentaAhorros.getSaldo());

        miCuentaAhorros.depositar(100);
        miCuentaAhorros.retirar(200);
        miCuentaAhorros.retirar(301);
        miCuentaAhorros.retirar(300);

        System.out.println("El Saldo final de la cuenta es de: " +miCuentaAhorros.getSaldo());

        Cuenta miCuenta = new Cuenta("Yaniny Zúñiga", 100);
        System.out.println("\nLa cuenta de " + miCuenta.getTitular() + " empieza con $" + miCuenta.getSaldo());
        miCuenta.retirar(100);

    } // main
} //main cuentas
