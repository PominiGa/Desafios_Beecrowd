package adhoc;

import java.util.Scanner;

public class Dama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            if (X1 == 0 && Y1 == 0 && X2 == 0 && Y2 == 0) {
                break;
            }

            if (X1 == X2 && Y1 == Y2) {
                System.out.println(0);
            } else if (X1 == X2 || Y1 == Y2 || Math.abs(X1 - X2) == Math.abs(Y1 - Y2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}
