package adhoc;
import java.util.Scanner;

public class FloresFlorecemDaFranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String frase = sc.nextLine();

            if (frase.equals("*")) {
                break;
            }

            String[] palavras = frase.toLowerCase().split(" ");

            char primeiraLetra = palavras[0].charAt(0);

            boolean aliteracao = true;

            for (int i = 1; i < palavras.length; i++) {
                if (palavras[i].charAt(0) != primeiraLetra) {
                    aliteracao = false;
                    break;
                }
            }

            System.out.println(aliteracao ? "Y" : "N");
        }

        sc.close();
    }
}