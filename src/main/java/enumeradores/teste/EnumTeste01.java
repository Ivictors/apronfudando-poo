package enumeradores.teste;

import enumeradores.dominio.Calculadora;

public class EnumTeste01 {
    public static void main(String[] args) {

        for(Calculadora calculadora : Calculadora.values()){
            System.out.println(calculadora.executarOperacao(1,2));
        }
    }
}
