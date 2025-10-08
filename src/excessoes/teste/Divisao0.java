package excessoes.teste;


import excessoes.dominio.DivisaoPorZero;

import java.util.Scanner;

public class Divisao0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with 2 values Intergers:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            divide(x, y);
        }
        catch (DivisaoPorZero e){
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }

    public static int divide(int x, int y) throws DivisaoPorZero {
        try{
            return x / y;
        } catch (ArithmeticException e){
            throw new DivisaoPorZero("Argumento invalido, não é possivel dividir um inteiro por 0.");
        }
    }
}