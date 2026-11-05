package Estructurales;

public abstract class ArmaDecorator implements Ataque {

    protected Ataque ataqueDecorado;

    public ArmaDecorator(Ataque ataque) {
        this.ataqueDecorado = ataque;
    }

    @Override
    public int ejecutarAtaque() {
        return ataqueDecorado.ejecutarAtaque();
    }

    @Override
    public String getDescripcion() {
        return ataqueDecorado.getDescripcion();
    }
}