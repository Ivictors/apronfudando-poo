package genericss.dominio;


import java.util.*;

public class Curso {
    private String nome;
    private Instrutor instrutor;
    private List<Aluno> alunoList = new ArrayList<>();

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void addList(Aluno aluno) {
        alunoList.add(aluno);
    }

    public void removeList(Aluno aluno) {
        alunoList.remove(aluno);
    }

    public int quantAlunos() {
        return alunoList.size();
    }

    public String getNome() {
        return nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Curso curso = (Curso) object;
        return Objects.equals(nome, curso.nome) && Objects.equals(instrutor, curso.instrutor) && Objects.equals(alunoList, curso.alunoList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(instrutor);
        result = 31 * result + Objects.hashCode(alunoList);
        return result;
    }
}