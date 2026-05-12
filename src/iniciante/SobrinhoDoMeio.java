package iniciante;

import java.util.Scanner;

public class SobrinhoDoMeio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int Z = sc.nextInt();
            int L = sc.nextInt();

            if ((H > Z && H < L) || (H < Z && H > L)) {
                System.out.println("huguinho");
            } else if ((Z > H && Z < L) || (Z < H && Z > L)) {
                System.out.println("zezinho");
            } else {
                System.out.println("luisinho");
            }
        }

        sc.close();
    }
}
