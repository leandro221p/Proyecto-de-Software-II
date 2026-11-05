package Estructurales;

import java.util.Random;

public class AtaqueBasico implements Ataque {

    private Random random = new Random();

    @Override
    public int ejecutarAtaque() {
        return random.nextInt(21) + 10;
    }

    @Override
    public String getDescripcion() {
        return "Ataque básico";
    }
}