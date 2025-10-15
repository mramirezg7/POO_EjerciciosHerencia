package Figuras;

public class Figura {

    //Atributos
    protected String nombre;
    protected String color;

    //Métodos

    public void calcularArea() {
        System.out.println("-1");
    }

    public void calcularPerimetro(){

    }


    //Constructor
    public Figura (String nombreObjeto,
                   String colorObjeto){
        nombre = nombreObjeto;
        color = colorObjeto;
    }

    //Getter
    public String getNombre(){ return nombre;}
    public String getColor(){ return color;}

    //Setter
    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setColor(String color) {this.color = color;}



}
