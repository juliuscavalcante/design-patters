package padroesdeprojetos.decorator;

public class CarroLuxuoso extends CarroDecorator {

    public CarroLuxuoso(Carro c) {
        super(c);
    }

    @Override
    public void montar(){
            super.montar();
        System.out.println("Equipando Carro Luxuoso.");
    }
}
