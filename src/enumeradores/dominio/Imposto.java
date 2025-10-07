package enumeradores.dominio;

public enum Imposto {
    ICMS("18%"){
        @Override
        public double calcular(double valor) {
            return valor * 0.18;
        }
    },
    ISS("5%"){
        @Override
        public double calcular(double valor) {
            return valor * 0.05;
        }
    },
    IPI("12%"){
        @Override
        public double calcular(double valor) {
            return valor * 0.12;
        }
    };

    private String valor;

    Imposto(String valor) {
        this.valor = valor;
    }

    public abstract double calcular(double valor);
}
