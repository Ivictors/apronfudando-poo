package enumeradores.teste;

import enumeradores.dominio.Imposto;

import java.util.Scanner;

public class ImpostoTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor com ponto flutuante:");
        double valor = sc.nextDouble();

        for (Imposto imposto: Imposto.values()){
            System.out.println(imposto.calcular(valor));
        }





        sc.close();
    }
}
