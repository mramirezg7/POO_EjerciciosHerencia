package Figuras;

public class Circulo extends Figura{

    private double radio;

    //Constructor
    public Circulo (String nombreObjeto, String colorObjeto, double radioObjeto){
        super(nombreObjeto, colorObjeto);
        radio = radioObjeto;
    }

    //Getter
    public double getRadio() {
        return radio;
    }
    //Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodos
    public void calcularArea(){
        double area = Math.PI * (radio * radio);
        System.out.println("La fórmula para calcular el área del círculo es " +
                "π × (r^2), o sea: " + String.format("%.2f",Math.PI) + " x " + String.format("%.2f",radio) + " elevado a la 2.");
        System.out.println("El área del " + getNombre() + ": " + String.format("%.2f",area));
    }
    public void calcularPerimetro(){
        double perimero = 2 * Math.PI * radio;
        System.out.println("Y la fómula para el perímetro o circunferencia del " + getNombre() +" es" +
                " 2 x π x radio, o sea: 2 x " + String.format("%.2f",Math.PI) + " x " + String.format("%.2f",radio) + ".");
        System.out.println("El perímetro de " +getNombre() + ": " + String.format("%.2f",perimero));
    }
}
