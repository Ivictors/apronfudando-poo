package streamss.teste;

import streamss.dominio.Vendas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//"C:\Users\victo\OneDrive\Documentos\vendas.cvs"

public class AnaliseVendasTeste1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Path path = Paths.get(sc.nextLine());
        if (Files.notExists(path)) {
            throw new FileNotFoundException("Arquivo não encontrado.");
        }

        Set<Vendas>  vendasSet = new HashSet<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(path.toString()))) {
            String string = null;
            while ((string = bf.readLine()) != null) {
                System.out.println(string);
                String[] split = string.split(",");
                vendasSet.add(new Vendas(split[0],split[1],split[2],Integer.parseInt(split[3]),Double.parseDouble(split[4])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Vendas vendas : vendasSet) {
            System.out.println(vendas);
        }
        sc.close();
    }
}