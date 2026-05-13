package iniciante;

import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int al = 0;
        int gas = 0;
        int diesel = 0;

        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: al += 1;
                    break;
                case 2: gas += 1;
                    break;
                case 3: diesel += 1;
                    break;
                case 4:
                    break;
                default:
            }

        } while (opcao != 4);
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + al);
            System.out.println("Gasolina: " + gas);
            System.out.println("Diesel: " + diesel);

            sc.close();

    }
}
