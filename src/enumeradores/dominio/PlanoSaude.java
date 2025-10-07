package enumeradores.dominio;

public enum PlanoSaude {
    BASICO(100.00){
        @Override
        public double valorAnual() {
            return BASICO.mensalidade * 12;
        }
    },
    STANDART(200.00){
        @Override
        public double valorAnual() {
            return STANDART.mensalidade * 12;
        }
    },
    PREMIUM(400.00){
        @Override
        public double valorAnual() {
            return PREMIUM.mensalidade * 12;
        }
    };

    private double mensalidade;

    PlanoSaude(double mensalidade){
        this.mensalidade = mensalidade;
    }

    public abstract double valorAnual();

    public double getMensalidade() {
        return mensalidade;
    }
}
