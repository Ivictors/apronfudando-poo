package genericss.dominio;

import java.util.List;

public class ProcessadorPagamento {

    public void processarPagamentos(List<? super Pagamento> list) {
        list.add(new Pagamento());
        list.add(new PagamentoCartao());
        list.add(new PagamentoPix());
        list.add(new PagamentoBoleto());
        list.add(new PagamentoBoleto());
        for (int i = 0; i < list.size(); i++) {
           Object tipo = list.get(i);
            System.out.println(tipo);
        }
    }
}
