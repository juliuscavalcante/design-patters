package padroesdeprojetos.decorator;

public class CarroDecorator implements Carro {

    protected Carro carro;

    public CarroDecorator(Carro c) {
        this.carro=c;
    }

    @Override
    public void montar() {
        this.carro.montar();

    }
}
