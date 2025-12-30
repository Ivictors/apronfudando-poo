package genericss;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Urnas {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo:");
        Path path = Paths.get(scanner.nextLine());

        Candidatos c1 = new Candidatos("Alex Blue");
        Candidatos c2 = new Candidatos("Bob Brown");
        Candidatos c3 = new Candidatos("Maria Green");

        Map<String, Integer> candidatosMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            String votos;

            while ((votos = bufferedReader.readLine()) != null) {
                String[] candidatosVotos = votos.split(",");
                String nome = candidatosVotos[0];
                Integer voto = Integer.parseInt(candidatosVotos[1]);

                if (nome.equals(c1.getNome())) {
                    c1.setVotos(voto);
                } else if (nome.equals(c2.getNome())) {
                    c2.setVotos(voto);
                } else if (nome.equals(c3.getNome())) {
                    c3.setVotos(voto);
                }
            }
            candidatosMap.put(c1.getNome(), c1.getVotos());
            candidatosMap.put(c2.getNome(), c2.getVotos());
            candidatosMap.put(c3.getNome(), c3.getVotos());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry<String, Integer> entry : candidatosMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
