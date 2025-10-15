package Animal;

public class MainAnimal {
    public static void main(String[] args) {

        Gato miMascota = new Gato("Michi", (byte)3, "Naranja", "Naranja");

        //Hace el sonido de gato, pero si gato no lo tuviera modificado, haría el sonido que está en animal
        miMascota.hacerSonido();

        //Por herencia nos da el color de "animal" aunque no está en gato.
        System.out.println("El color de mi gato es: " + miMascota.color);

    }
}
