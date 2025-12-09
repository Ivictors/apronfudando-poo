package genericss.teste;

import genericss.dominio.Biblioteca;
import genericss.dominio.Podcast;

public class MidiasTeste01 {
    public static void main(String[] args) {
        Biblioteca<Podcast> podcastBiblioteca = new Biblioteca<>();

        Podcast podcast1 = new Podcast("Podpah");
        Podcast podcast2 = new Podcast("PodpahDelas");
        Podcast podcast3 = new Podcast("PodpahCats");

        podcastBiblioteca.add(podcast1);
        podcastBiblioteca.add(podcast2);
        podcastBiblioteca.add(podcast3);

        podcastBiblioteca.objetosMidia();

    }
}
