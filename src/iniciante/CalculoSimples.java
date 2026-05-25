package iniciante;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int quantidadePeca1 = sc.nextInt();
        double valor = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int quantidadePeca2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double valorTotal = (quantidadePeca1 * valor) + (quantidadePeca2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        sc.close();
    }
}
