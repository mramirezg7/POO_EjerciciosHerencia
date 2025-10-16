package Empleados;

public class MainEmpleado {
    public static void main(String[] args) {
        //Empleado normal
        Empleado empleadoUno = new Empleado("Michael", "Ramírez",
                "Recepcionista", 8.0, 2500);
        System.out.println("\nEmpleado Regular");
        empleadoUno.trabajar();
        empleadoUno.calcularSalario();

        //Empleado RRHH
        EmpleadoRH empleadoRH = new EmpleadoRH("Mikeila",
                "Ramírez", "Gerente de RRHH",
                10, 3200);
        System.out.println("\nEmpleada de RRHH");
        empleadoRH.trabajar();
        empleadoRH.contratarEmpleado();
        empleadoRH.calcularSalario();


    }
}
