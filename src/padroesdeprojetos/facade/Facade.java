package padroesdeprojetos.facade;

import padroesdeprojetos.facade.subsistema1cep.CrmService;
import padroesdeprojetos.facade.subsistema2crm.CepApi;

public class Facade {

    public void migrarCliente (String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
