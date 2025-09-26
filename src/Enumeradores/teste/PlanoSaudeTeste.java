package Enumeradores.teste;

import Enumeradores.dominio.PlanoSaude;

public class PlanoSaudeTeste {
    public static void main(String[] args) {
        for (PlanoSaude planoSaude : PlanoSaude.values()){
            System.out.println("Tipo de Plano: " + planoSaude);
            System.out.println("Mensalidade: " + planoSaude.getMensalidade());
            System.out.println("Plano Anual: " + planoSaude.valorAnual());
            System.out.println();
        }
    }
}
