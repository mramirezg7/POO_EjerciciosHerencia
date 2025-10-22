package Empleados;

import java.security.PublicKey;

public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String puesto;

    //Se utiliza la plabra FINAL para que no se pueda cambiar el valor
    protected final double horasTrabajadasAlDia;
    protected final double pagoHora;

    //Constructor
    public Empleado (String nombreObjeto, String apellidosObjeto,
                     String puestoObjeto, Double horasTrabajadasAlDiaObjeto,
                     double pagoHoraObjeto){
        this.nombre = nombreObjeto;
        this.apellidos = apellidosObjeto;
        this.puesto = puestoObjeto;
        this.horasTrabajadasAlDia = horasTrabajadasAlDiaObjeto;
        this.pagoHora = pagoHoraObjeto;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getHorasTrabajadasAlDia (){
        return horasTrabajadasAlDia;
    }
    public double getPagoHora (){return pagoHora; }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    //Métodos
    public void trabajar(){
        System.out.println(nombre + " está trabajando " +
                "en sus tareas de " + puesto);
    }

    public void calcularSalario(){
        double salario = pagoHora * horasTrabajadasAlDia *
                5 /*dias a la semana */ * 4 /*4 semanas al mes*/;
        System.out.println(nombre + " trabajó " + horasTrabajadasAlDia + " horas al día " +
                "por 5 días a la semana, por lo que este mes tuvo un salario de" +
                ": ₡" + String.format("%.2f", salario));

    }


}
