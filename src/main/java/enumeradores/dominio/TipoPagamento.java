package enumeradores.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valorProduto) {
            return valorProduto * 0.05;
        }
    },
    PIX{
        @Override
        public double calcularDesconto(double valorProduto) {
            return valorProduto * 0.05;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valorProduto) {
            return valorProduto * 0.01;
        }
    },
    BOLETO{
        @Override
        public double calcularDesconto(double valorProduto) {
            return valorProduto * 0.03;
        }
    };

    public abstract double calcularDesconto(double valorProduto);
}
