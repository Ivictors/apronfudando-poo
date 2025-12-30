package genericss.teste;

import genericss.dominio.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch_Conversao {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(5);
        n.add(3);
        n.add(4);
        n.add(2);
        n.add(1);
        n.add(0);

        Collections.sort(n);

        for (Integer a : n){
            System.out.println(a);
        }
        System.out.println();
        System.out.println(Collections.binarySearch(n, 3));

        List<String> listString = new ArrayList<>(Arrays.asList("1", "2", "3"));
        List<Integer> integerList =new ArrayList<>( List.of(1, 2, 3, 5));
        List<Aluno> alunoList =new ArrayList<>( List.of(new Aluno("jose"),new Aluno("ig")));

        listString.add("6");
        System.out.println(listString);
        System.out.println(integerList);
        System.out.println(alunoList);
    }
}
