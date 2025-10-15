package Figuras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainFiguras {
    public static void main(String[] args) {

        //Rectángulo
        Rectangulo miRectangulo = new Rectangulo("Figuras.Rectangulo Rojo",
                "Rojo",
                10.0,
                5.0);

        //Círculo
        Circulo miCirculo = new Circulo("Figuras.Circulo Verde",
                "Verde",
                3.0);

        //Mostrar en pantalla
        System.out.println("Figuras.Rectangulo");
        miRectangulo.calcularArea();
        miRectangulo.calcularPerimetro();

        System.out.println("\nCírculo");
        miCirculo.calcularArea();
        miCirculo.calcularPerimetro();
    }
}