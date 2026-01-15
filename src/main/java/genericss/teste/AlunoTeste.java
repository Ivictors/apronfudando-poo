package genericss.teste;

import genericss.dominio.Aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlunoTeste {

    static class ChangeSearch implements Comparator <Aluno> {
        @Override
        public int compare(Aluno o1, Aluno o2) {
            return Integer.compare(o1.getCodigo(), o2.getCodigo());
        }
    }
    public static void main(String[] args) {
        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(new Aluno("Jose"));
        alunoList.add(new Aluno("Osmar"));
        alunoList.add(new Aluno("Maria"));
        alunoList.add(new Aluno("Adriano"));

        Collections.sort(alunoList);

        for (Aluno a : alunoList){
            System.out.println(a);
        }

        System.out.println();

       alunoList.sort(new ChangeSearch());

        for (Aluno a : alunoList){
            System.out.println(a);
        }
    }
}
