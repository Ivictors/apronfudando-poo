package streamss.teste;

import streamss.dominio.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1 {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\victo\\OneDrive\\Documentos\\Preco.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            String string;
            Double soma = 0.0;
            List<Produto> produtoList = new ArrayList<>();
            while ((string = bufferedReader.readLine()) != null) {
                String[] split = string.split(",");
                produtoList.add(new Produto(split[0], Double.parseDouble(split[1])));
            }
            Double media = produtoList.stream().map(p -> p.getPreco())
                    .reduce(0.0, (x, y) -> (x + y) / produtoList.size());

            Comparator<String> compar = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> collect = produtoList.stream().filter(x -> x.getPreco() < media)
                    .map(x -> x.getNome()).sorted(compar.reversed()).collect(Collectors.toList());

            collect.forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
