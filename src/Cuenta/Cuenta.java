package Cuenta;

public class Cuenta {
    //Atributos
    protected String titular;
    protected double saldo;

    //Constructor
    public Cuenta (String titularObjeto, double saldoObjeto){
        titular = titularObjeto;
        saldo = saldoObjeto;
    }

    //Getters
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(){
        double monto = 50.0; // Esto sería para quemar un valor en monto
        this.saldo += monto;
        System.out.println("Se logró depositar $" + String.format("%,.2f", monto) + " correctamente.");
        System.out.println("Saldo: $" + String.format("%,.2f", saldo));
    }

    public void retirar(){
        double monto = 50.0; // Esto sería para quemar un valor en monto
        this.saldo -= monto;
        System.out.println("Se logró retirar $" + String.format("%,.2f", monto) + " correctamente.");
        System.out.println("Saldo: $" + String.format("%,.2f", saldo));
    }


}
