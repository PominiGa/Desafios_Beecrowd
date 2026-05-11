package iniciante;

import java.util.Scanner;

public class Palavrao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();

        if (palavra.length() < 10) {
            System.out.println("palavrinha");
        }else {
            System.out.println("palavrao");
        }
    }
}
