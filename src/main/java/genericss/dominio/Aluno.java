package genericss.dominio;


import java.security.SecureRandom;
import java.util.Objects;

public class Aluno implements Comparable <Aluno> {
    private String nome;
    private int codigo;
                 SecureRandom sr = new SecureRandom();

    public Aluno(String nome) {
        this.nome = nome;
        this.codigo = sr.nextInt(10);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Aluno o) {
        return getNome().compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Aluno aluno = (Aluno) object;
        return codigo == aluno.codigo && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + codigo;
        return result;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
