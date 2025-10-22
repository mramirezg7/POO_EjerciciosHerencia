package Figuras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    //Constructor
    public Rectangulo (String nombreObjeto,
                       String colorObjeto,
                       double baseObjeto,
                       double alturaObjeto){
        super(nombreObjeto, colorObjeto);
        this.base = baseObjeto;
        this.altura = alturaObjeto;
    }

    //Getters
    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }

    //Setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos
    public void calcularArea(){
        double area = base * altura;
        System.out.println("La fórmula para el área del " +
                "rectangulo es: base x altura, o sea: " +
                + base + " x " + altura + ": ");
        System.out.println("El área del " + getNombre() + ": " + area);
    }

    public void calcularPerimetro(){
        double perimero = 2 * (base + altura);
        System.out.println("\nY la fórmula para el perímetro " +
                "es: 2 x (base + altura), o sea: " +
                "2 x (" + base + " + " + altura + "): ");
        System.out.println("El perímetro de " +getNombre() + ": " + perimero);
    }

}
