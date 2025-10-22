package Cuentas;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Cuenta {

    protected String titular;
    protected double saldo;

    //Constructor
    public Cuenta(String titularObjeto, double saldoObjeto){
        titular = titularObjeto;
        saldo = saldoObjeto;
    }

    //Getter

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    //Setter
    public void setTitular(String nuevoTitular) {
        titular = nuevoTitular;
    }
    public void setSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    //Métodos
    public void depositar (double monto){
        if (monto > 0 ){
            saldo += monto;
            System.out.println("Se hizo un depósito de $" + String.format("%,.2f",
                    monto) + ", para un nuevo saldo de: $" + saldo);
        } // if
        else {
            System.out.println("El monto a depositar tiene que ser positivo.");
        } // else
    } //Depositar

    public void retirar(double monto){
        if (monto >0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Se retiró: $" + String.format("%,.2f",
                    monto) + ", para un nuevo saldo de: $" + saldo);
        } // if
        else if (monto > saldo) {
            System.out.println("ERROR!: No hay fondos suficientes. Su saldo es de: $" + String.format("%,.2f", saldo));
        } // El-if 1
        else {
            System.out.println("ERROR!: El monto a retirar tiene que ser positivo.");
        } // Else
    } //retirar

    public String toString() {
        return "Titular: " + titular + "\n"+
                "Saldo: " + saldo;
    } // toString
} //Cuenta
