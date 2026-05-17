package iniciante;

import java.util.Scanner;

public class Bute {
    public static int f(int x) {
        String[] numbers = {
                "", "ONE", "TWO", "THREE", "FOUR",
                "FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
                "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
                "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
        };

        String[] tens = {
                "", "", "TWENTY", "THIRTY", "FORTY",
                "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
        };

        String word = "";

        if (x <= 19) {
            word = numbers[x];
        } else if (x <= 99) {
            word = tens[x / 10] + numbers[x % 10];
        } else if (x == 100) {
            word = "ONEHUNDRED";
        }

        return word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < 1000; i++) {
            x = f(x);
        }

        System.out.println(x);
    }
}
