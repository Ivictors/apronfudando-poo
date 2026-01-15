package excessoes.dominio;

public class PagamentoService {
    private double valorPagamento;
    private MetodoPagamento metodoPagamento;

    public PagamentoService(double valorPagamento, MetodoPagamento metodoPagamento) throws PagamentoException {
        if (valorPagamento <= 0){
            throw new PagamentoException();
        }
        if (metodoPagamento.equals(MetodoPagamento.CARTAO_CREDITO) && valorPagamento > 0){
            if(valorPagamento > 1000.00){
                throw new PagamentoException("Confirme a transação com seu banco, e tente novamente.");
            }
        }
        if (metodoPagamento.equals(MetodoPagamento.CARTAO_DEBITO) && valorPagamento > 0){
            if(valorPagamento > 1000.00){
                throw new PagamentoException("Confirme a transação com seu banco, e  tente novamente.");
            }
            if (metodoPagamento.equals(MetodoPagamento.PIX) && valorPagamento > 0){
                if(valorPagamento > 5000.00){
                    throw new PagamentoException("Pagamento recusado, confirme o valor da transação com seu banco, e tente novamente.");
                }
            }
        }
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
