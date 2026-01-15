package genericss.teste;

import genericss.dominio.Pagamento;
import genericss.dominio.ProcessadorPagamento;

import java.util.ArrayList;
import java.util.List;

public class PagamentoTeste {
    public static void main(String[] args) {
        List<Pagamento> id = new ArrayList<>();
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        processadorPagamento.processarPagamentos(id);
    }
}
