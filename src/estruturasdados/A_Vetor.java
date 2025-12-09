package estruturasdados;

public class A_Vetor {
    String[] elementos;
    int tamanho;

    public A_Vetor(final int quantidade) {
        this.elementos = new String[quantidade];
        this.tamanho = 0;
    }

    public boolean adicionar(String elemento) {
        if (tamanho < elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void doubleVetor() {
        if (tamanho == elementos.length) {
            String[] novoVetor = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novoVetor[i] = elementos[i];
            }
            elementos = novoVetor;
        }
    }

    public static void main(String[] args) {
        A_Vetor a = new A_Vetor(5);
        a.adicionar("a");
        a.adicionar("b");
        a.adicionar("c");
        a.adicionar("d");
        a.adicionar("e");

        for (String x : a.elementos) {
            System.out.println(x);
        }
    }
}
