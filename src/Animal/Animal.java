package Animal;

public class Animal {
    //Atributos
    protected String nombre;
    protected byte edad;
    protected String color;

    //Métodos
    public void hacerSonido (){
        System.out.println("El animal hace su sonido.");
    }

    //Constructor

    public Animal(String nombreObjeto,
                  byte edadObjeto,
                  String colorObjeto){
        nombre = nombreObjeto;
        edad = edadObjeto;
        color = colorObjeto;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }
    public byte getEdad() {
        return edad;
    }
    public String getColor() {
        return color;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
