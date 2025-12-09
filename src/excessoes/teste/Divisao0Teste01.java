package excessoes.teste;


import excessoes.dominio.DivisaoPorZeroException;

import java.util.Scanner;

public class Divisao0Teste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with 2 values Intergers:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            divide(x, y);
        }
        catch (DivisaoPorZeroException e){
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }

    public static int divide(int x, int y) throws DivisaoPorZeroException {
        try{
            return x / y;
        } catch (ArithmeticException e){
            throw new DivisaoPorZeroException("Argumento invalido, não é possivel dividir um inteiro por 0.");
        }
    }
}