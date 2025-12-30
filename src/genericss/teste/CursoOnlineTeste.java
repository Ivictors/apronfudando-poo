package genericss.teste;

import genericss.dominio.Aluno;
import genericss.dominio.Curso;
import genericss.dominio.Instrutor;

import java.util.*;


public class CursoOnlineTeste {
    public static class Inicializacao {
      Aluno aluno1;
      Aluno aluno2;
      Aluno aluno3;
      Aluno aluno4;
      Instrutor instrutor;
      Curso curso1;
      Curso curso2;
      Curso curso3;
    }
    private static List<Aluno> listAlunos (Inicializacao inicializacao){
        List<Aluno> alunoList = new ArrayList<>();
        for (int i = 0; i < inicializacao.instrutor.getCursoList().size(); i++) {
            alunoList.addAll(inicializacao.instrutor.getCursoList().get(i).getAlunoList());
        }
        return alunoList;
    }

    public static void main(String[] args) {
        Inicializacao dados = instancias();
        testeAssociacao(dados);
        qtd(listAlunos(dados));
    }

    private static Inicializacao instancias (){
        Inicializacao inicializacao = new Inicializacao();
        inicializacao.aluno1 = new Aluno("Victor");
        inicializacao.aluno2 = new Aluno("Marques");
        inicializacao.aluno3 = new Aluno("Oliveira");
        inicializacao.aluno4 = new Aluno("Silva");
        inicializacao.instrutor = new Instrutor("Alex");
        inicializacao.curso1 = new Curso("A", inicializacao.instrutor);
        inicializacao.curso2 = new Curso("B", inicializacao.instrutor);
        inicializacao.curso3 = new Curso("C", inicializacao.instrutor);
        return inicializacao;
    }

    private static void testeAssociacao (Inicializacao inicializacao){
        inicializacao.curso1.addList(inicializacao.aluno1);
        inicializacao.curso1.addList(inicializacao.aluno2);
        inicializacao.curso1.addList(inicializacao.aluno3);
        inicializacao.curso2.addList(inicializacao.aluno1);
        inicializacao.curso2.addList(inicializacao.aluno2);
        inicializacao.curso2.addList(inicializacao.aluno4);
        inicializacao.curso3.addList(inicializacao.aluno2);
        inicializacao.curso3.addList(inicializacao.aluno3);
        inicializacao.curso3.addList(inicializacao.aluno4);
        inicializacao.instrutor.addCursoList(inicializacao.curso1);
        inicializacao.instrutor.addCursoList(inicializacao.curso2);
        inicializacao.instrutor.addCursoList(inicializacao.curso3);
    }

    private static void qtd(Collection<Aluno> alunos) {
        Set<Aluno> alunoSet = new HashSet<>(alunos);
        System.out.printf("Quantidade de alunos %d", alunoSet.size());
    }
}
