
package Estructurales;

public class FuegoDecorator extends ArmaDecorator {

    public FuegoDecorator(Ataque ataque) {
        super(ataque);
    }

    @Override
    public int ejecutarAtaque() {
        return super.ejecutarAtaque() + 15;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con fuego";
    }
}
