package genericss.dominio;


import java.util.*;

public class Instrutor {
    private String nome;
    private int codigo;
    private List<Curso> cursoList = new ArrayList<>();

    public Instrutor(String nome) {
        this.nome = nome;
        this.codigo = 0;
    }

    public void addCursoList(Curso curso){
        cursoList.add(curso);
    }

    public void removeCursoList(Curso curso){
        cursoList.remove(curso);
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Instrutor instrutor = (Instrutor) object;
        return codigo == instrutor.codigo && Objects.equals(nome, instrutor.nome) && Objects.equals(cursoList, instrutor.cursoList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + codigo;
        result = 31 * result + Objects.hashCode(cursoList);
        return result;
    }
}