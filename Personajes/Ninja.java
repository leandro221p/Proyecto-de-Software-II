package Personajes;

public class Ninja extends Personaje {

    public Ninja(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipo() {
        return "Ninja";
    }
}