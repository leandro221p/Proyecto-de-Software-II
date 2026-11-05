package Juego;

import Personajes.Personaje;

public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    // Iniciar el combate
    public void iniciarPelea() {

        System.out.println("\n================================");
        System.out.println("       ¡COMIENZA LA PELEA!");
        System.out.println("================================");

        System.out.println(jugador1.getNombre() + " (" 
                + jugador1.getTipo() + ") VS "
                + jugador2.getNombre() + " (" 
                + jugador2.getTipo() + ")");

        int turno = 1;

        while (jugador1.estaVivo() && jugador2.estaVivo()) {

            System.out.println("\n---------- TURNO " + turno + " ----------");

            // Ataca el jugador 1
            realizarTurno(jugador1, jugador2);

            // Verificar si el jugador 2 sigue vivo
            if (jugador2.estaVivo()) {

                // Ataca el jugador 2
                realizarTurno(jugador2, jugador1);
            }

            turno++;
        }

        mostrarGanador();
    }

    // Ejecutar un turno
    private void realizarTurno(Personaje atacante, Personaje defensor) {

        System.out.println("\nTurno de " + atacante.getNombre());

        atacante.atacar(defensor);

        System.out.println("Vida de " + defensor.getNombre()
                + ": " + defensor.getPuntosDeVida() + " HP");
    }

    // Mostrar el ganador
    private void mostrarGanador() {

        System.out.println("\n================================");
        System.out.println("          FIN DE LA PELEA");
        System.out.println("================================");

        if (jugador1.estaVivo()) {

            System.out.println("¡GANADOR: " + jugador1.getNombre() + "!");

        } else {

            System.out.println("¡GANADOR: " + jugador2.getNombre() + "!");
        }
    }
}