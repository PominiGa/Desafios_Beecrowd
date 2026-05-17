package iniciante;

import java.util.Scanner;

public class RespostaCerta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            int num = sc.nextInt();
            int numResposta = 1;
            numResposta += i;
            System.out.println("resposta " + numResposta + ": " + num);
        }

        sc.close();
    }
}
