package Animal;

public class Gato extends Animal{
    //Atributos
    private String raza;


    public Gato(String nombreObjeto,
                byte edadObjeto,
                String colorObjeto, String razaObjeto) {
        super(nombreObjeto, edadObjeto, colorObjeto);
        raza = razaObjeto;
    }

    //Getter
    public String getRaza() {
        return raza;
    }

    //Setter
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void hacerSonido (){
        System.out.println("El gato hace miau.");
    }

    //toString sobreescrito
    public String toString() {
        return super.toString() +
                ", Gato {" +
                "raza='" + raza + '\'' +
                '}';
    }


}
