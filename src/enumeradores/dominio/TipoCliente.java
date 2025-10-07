package enumeradores.dominio;

public enum TipoCliente {
    PESSOA_FISICA (1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int valor;
    private final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente cliente: values()){
            if (cliente.getNomeRelatorio().equals(nomeRelatorio)){
                return cliente;
            }
        }
        return null;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
