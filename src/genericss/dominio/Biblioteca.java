package genericss.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
    private List<T> list = new ArrayList<>();

    public void add(T elemento) {
        this.list.add(elemento);
    }

    public void objetosMidia() {
        for (T elementos : list){
            System.out.println(elementos.getNome());
        }
    }
}
