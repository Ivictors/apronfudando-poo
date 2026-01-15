package enumeradores.dominio;

public class Cliente {
    public String nome;
    public Produto produto;
    public TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente(String nome, Produto produto, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.produto = produto;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", produto=" + produto +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
