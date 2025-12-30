package genericss.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private int ID;
    private List<Integer> id = new ArrayList<>();

    public Pagamento() {
    }

    public int getID() {
        return ID;
    }

    public List<Integer> getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "ID=" + ID +
                '}';
    }
}
