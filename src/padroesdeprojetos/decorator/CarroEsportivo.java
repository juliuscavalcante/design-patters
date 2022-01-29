package padroesdeprojetos.decorator;

public class CarroEsportivo extends CarroDecorator {

    public CarroEsportivo(Carro c) {
        super(c);
    }
    @Override
    public void montar(){
            super.montar();
        System.out.println("Equipando Carro Esportivo.");
    }
}
