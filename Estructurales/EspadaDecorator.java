package Estructurales;

public class EspadaDecorator extends ArmaDecorator {

    public EspadaDecorator(Ataque ataque) {
        super(ataque);
    }

    @Override
    public int ejecutarAtaque() {
        return super.ejecutarAtaque() + 10;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con espada";
    }
}