package Enumeradores.dominio;

public enum Calculadora {
    SOMA("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRAÇAO("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVISAO("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    };

    private String tipo;
    Calculadora(String tipo) {
    }
    public abstract double executarOperacao(double x, double y);

}
