package enumeradores.dominio;

public enum Livros {
    JCP ("Java como programar","edição 1"),
    JEI ("Java efetivo para iniciantes", "edição 2");

    private final String nome;
    private final String nomeEdicao;

    Livros(String nome, String nomeEdicao) {
        this.nome = nome;
        this.nomeEdicao = nomeEdicao;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeEdicao() {
        return nomeEdicao;
    }

    @Override
    public String toString() {
        return "Livros " +
                "nome = '" + nome + '\'' +
                ", nomeEdicao = '" + nomeEdicao + '\'';
    }
}
