package padroesdeprojetos.facade.subsistema2crm;

import padroesdeprojetos.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Juiz de Fora";
    }

    public String recuperarEstado(String cep) {
        return "MG";
    }

}


