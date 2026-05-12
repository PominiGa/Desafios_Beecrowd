package iniciante;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();
        if (vendas <= 0) {
            System.out.printf("TOTAL = R$ %.2f%n", salarioFixo);
            return;
        }

        double salarioFinal = salarioFixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        sc.close();
    }
}