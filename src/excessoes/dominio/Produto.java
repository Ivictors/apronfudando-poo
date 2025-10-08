package excessoes.dominio;

public class Produto {
    String nome;
    double preco;

    public Produto() {
    }

    public Produto(String nome, double preco) throws PrecoInvalido {
        this.nome = nome;
        if (preco <= 0.0){
            throw new PrecoInvalido("Preço invalido, informe um valor positivo.");
        }
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: "+ nome + '\'' +
                ", preco: " + preco;
    }
}
