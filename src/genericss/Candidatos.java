package genericss;

public class Candidatos {
    private String nome;
    private Integer votos;

    public Candidatos(String nome) {
        this.nome = nome;
        votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos += votos;
    }
}
