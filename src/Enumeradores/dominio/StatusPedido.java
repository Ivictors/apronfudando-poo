package Enumeradores.dominio;

public enum StatusPedido {
    NOVO("Novo"){
        @Override
        public StatusPedido proximo(StatusPedido estado) {
            if(estado == CANCELADO){
                return CANCELADO;
            }
            return PROCESSANDO;
        }
    },
    PROCESSANDO ("Processando"){
        @Override
        public StatusPedido proximo(StatusPedido estado) {
            if(estado == CANCELADO){
                return CANCELADO;
            }
            return ENVIADO;
        }
    },
    ENVIADO ("Enviado"){
        @Override
        public StatusPedido proximo(StatusPedido estado) {
            if(estado == CANCELADO){
                return CANCELADO;
            }
            return ENTREGUE;
        }
    },
    ENTREGUE ("Entregue"){
        @Override
        public StatusPedido proximo(StatusPedido estado) {
            if(estado == CANCELADO){
                return CANCELADO;
            }
            return ENTREGUE;
        }
    },
    CANCELADO ("Cancelado"){
        @Override
        public StatusPedido proximo(StatusPedido estado) {
            return CANCELADO;
        }
    };

    private String estadoAtual;

    StatusPedido(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public abstract StatusPedido proximo(StatusPedido estado);
}