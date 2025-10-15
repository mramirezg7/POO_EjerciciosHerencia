package Empleados;

public class EmpleadoRH extends Empleado {

    //Constructor
    public EmpleadoRH(String nombreObjeto, String apellidosObjeto, String puestoObjeto,
                      double horasTrabajadasAlDiaObjeto, double pagoHoraObjeto){
        super(nombreObjeto, apellidosObjeto, puestoObjeto,
                horasTrabajadasAlDiaObjeto, pagoHoraObjeto);
    }

    public void contratarEmpleado(){
        System.out.println(nombre + " de RRHH contraró un nuevo empleado");
    }

    public void trabajar(){
        System.out.println(nombre + " está revisando CVs y actualizando " +
                "el manual del trabajandor.");
    }

}
