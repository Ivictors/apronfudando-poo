package genericss.teste;

import genericss.dominio.Aluno;

import java.util.*;

class AlunoComparator implements Comparator<Aluno>{
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class NavigableSetTeste {
    public static void main(String[] args) {
        NavigableSet<Aluno> alunos = new TreeSet<>(new AlunoComparator());
        alunos.add(new Aluno("Joao"));
        alunos.add(new Aluno("Jose"));
        alunos.add(new Aluno("Marcos"));
        alunos.add(new Aluno("Adrian"));

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println();
        }
    }
}
