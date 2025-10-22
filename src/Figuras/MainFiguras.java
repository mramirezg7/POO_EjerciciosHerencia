package Figuras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainFiguras {
    public static void main(String[] args) {

        //Rectángulo
        Rectangulo miRectangulo = new Rectangulo("Rectangulo Rojo",
                "Rojo",
                10.0,
                5.0);

        //Círculo
        Circulo miCirculo = new Circulo("Circulo Verde",
                "Verde",
                3.0);
        Circulo miOtroCirculo = new Circulo("Círculo Azul",
                "Azul", 4.5);

        //Para mostrar en pantalla
        System.out.println("\nRectangulo");
        miRectangulo.calcularArea();
        miRectangulo.calcularPerimetro();

        System.out.println("\nCírculo");
        miCirculo.calcularArea();
        miCirculo.calcularPerimetro();
        miOtroCirculo.calcularPerimetro();
    }
}