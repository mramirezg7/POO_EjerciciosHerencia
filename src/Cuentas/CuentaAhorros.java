package Cuentas;

public class CuentaAhorros extends Cuenta{

    //Constructor
    public CuentaAhorros (String nuevoTitular, double nuevoSaldo) {
        super(nuevoTitular, nuevoSaldo);
    } //Constructor

    //Métodos
    public void retirar(double monto) {
        double saldoRestante = saldo - monto;

        if (monto <= 0) {
            System.out.println("ERROR! El monto a retirar tiene que ser positivo.");
        } // if

        else if (monto > saldo) {
            System.out.println("ERROR! No hay fondos suficientes. Saldo: $" + String.format("%,.2f", saldo));
        } // elif
        else if (saldoRestante <100) {
            System.out.println("ERROR! " + titular + " no puede retirar $" + monto + " ya que necesita " +
                    "tener un saldo mínimo de $100 y ahora cuenta con un saldo de: $" + String.format("%,.2f", saldo));
            System.out.println("El retiro lo dejaría con $" + String.format("%,.2f", saldoRestante) + ".");
        } //elif

        else {
            saldo -= monto;
            System.out.println("Se hizo un retiro de: $" + String.format("%,.2f", monto) + " para un saldo " +
                    "restante de ahorros: $" + String.format("%,.2f", saldo));
        } //Else
    } //retirar


} // CuentaAhorros
