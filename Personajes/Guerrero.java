package Personajes;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipo() {
        return "Guerrero";
    }
}