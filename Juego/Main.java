package Juego;

import java.util.Scanner;

import Personajes.Personaje;

import Creacionales.CrearPersonaje;
import Creacionales.GuerreroFactory;
import Creacionales.NinjaFactory;

import Estructurales.Ataque;
import Estructurales.AtaqueBasico;
import Estructurales.EspadaDecorator;
import Estructurales.FuegoDecorator;

public class Main {

    // Seleccionar el arma de cada jugador
    public static Ataque seleccionarAtaque(Scanner scanner) {

        System.out.println("\nSelecciona tu arma:");
        System.out.println("1. Ataque basico");
        System.out.println("2. Espada (+10 daño)");
        System.out.println("3. Fuego (+15 daño)");

        int opcion = scanner.nextInt();

        Ataque ataque = new AtaqueBasico();

        switch (opcion) {

            case 1:
                return ataque;

            case 2:
                return new EspadaDecorator(ataque);

            case 3:
                return new FuegoDecorator(ataque);

            default:
                System.out.println("Opcion no valida. Se usara ataque basico.");
                return ataque;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       JUEGO DE LUCHA");
        System.out.println("================================");

        // Solicitar nombres
        System.out.print("\nNombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        // Crear personajes utilizando Factory Method
        CrearPersonaje fabricaGuerrero = new GuerreroFactory();
        CrearPersonaje fabricaNinja = new NinjaFactory();

        Personaje jugador1 = fabricaGuerrero.crearPersonaje(nombre1);
        Personaje jugador2 = fabricaNinja.crearPersonaje(nombre2);

        // Mostrar personajes
        System.out.println("\nPersonajes seleccionados:");
        System.out.println(jugador1.getNombre() + " - " + jugador1.getTipo());
        System.out.println(jugador2.getNombre() + " - " + jugador2.getTipo());

        // Seleccionar ataques
        System.out.println("\nArma del jugador 1:");
        Ataque ataque1 = seleccionarAtaque(scanner);
        jugador1.setAtaque(ataque1);

        System.out.println("\nArma del jugador 2:");
        Ataque ataque2 = seleccionarAtaque(scanner);
        jugador2.setAtaque(ataque2);

        // Crear e iniciar el juego
        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();

        scanner.close();
    }
}