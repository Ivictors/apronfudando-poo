package Enumeradores.teste;

import Enumeradores.dominio.StatusPedido;

import java.util.Scanner;

public class StatusPedidoTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (StatusPedido statusPedido : StatusPedido.values()){
            System.out.println(statusPedido + " Proximo estado " + statusPedido.proximo(statusPedido));
        }

        sc.close();
    }
}
