
package Personajes;


import Estructurales.Ataque;
import Estructurales.AtaqueBasico;

public abstract class Personaje {

    protected String nombre;
    protected int puntosDeVida;
    protected Ataque ataque;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.ataque = new AtaqueBasico();
    }

    // Asignar un ataque al personaje
    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    // Realizar un ataque
    public void atacar(Personaje oponente) {

        int dano = ataque.ejecutarAtaque();

        oponente.recibirDano(dano);

        System.out.println(nombre + " (" + getTipo() + ") ataca a "
                + oponente.getNombre()
                + " usando " + ataque.getDescripcion()
                + " y causa " + dano + " puntos de daño.");
    }

    // Recibir daño
    public void recibirDano(int dano) {

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    // Verificar si sigue vivo
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    // Obtener nombre
    public String getNombre() {
        return nombre;
    }

    // Obtener puntos de vida
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    // Obtener tipo de personaje
    public abstract String getTipo();
}
