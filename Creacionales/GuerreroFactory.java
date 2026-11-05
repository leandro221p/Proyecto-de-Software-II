package Creacionales;

import Personajes.Personaje;
import Personajes.Guerrero;

public class GuerreroFactory extends CrearPersonaje {

    @Override
    public Personaje crearPersonaje(String nombre) {

        return new Guerrero(nombre);

    }
}