package Figuras;

public abstract class Figura {

    //Atributos
    protected String nombre;
    protected String color;


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

    //Métodos

    public abstract void calcularArea();
    /*{
        //System.out.println("-1");
    }*/

    /*NOTA Cuando es un métodos abstract, no puede tener cuerpo, o sea {} y se
    pone punto y coma ;
    */

    public abstract void calcularPerimetro();
    /*{
        //System.out.println("-1");
    }*/

}
