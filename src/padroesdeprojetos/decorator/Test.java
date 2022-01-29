package padroesdeprojetos.decorator;


public class Test {
    public static void main(String[] args) {

        // Design Patters Decorator

        System.out.println("--- --- ---");
        Carro carroEsportivo = new CarroEsportivo(new CarroBasico());
        carroEsportivo.montar();
        System.out.println("\n--- --- ---");
        Carro carroEsportivoLuxuoso = new CarroEsportivo(new CarroLuxuoso(new CarroBasico()));
        carroEsportivoLuxuoso.montar();
    }

}
