package strings;

import java.util.Scanner;

public class Criptografia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String texto = sc.nextLine();

            StringBuilder primeira = new StringBuilder();

            for (char c : texto.toCharArray()) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    primeira.append((char) (c + 3));
                } else {
                    primeira.append(c);
                }
            }

            primeira.reverse();

            int metade = primeira.length() / 2;

            for(int j = metade; j < primeira.length(); j++) {
                primeira.setCharAt(j, (char) (primeira.charAt(j) - 1));
            }

            System.out.println(primeira);
        }
        sc.close();

    }
}
