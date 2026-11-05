package Creacionales;

import Personajes.Personaje;
import Personajes.Ninja;

public class NinjaFactory extends CrearPersonaje {

    @Override
    public Personaje crearPersonaje(String nombre) {

        return new Ninja(nombre);

    }
}