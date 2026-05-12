package iniciante;

import java.util.Scanner;

public class InversaoDeNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int invertido = (unidade * 100) + (dezena * 10) + centena;

        System.out.println(invertido);

        sc.close();
    }
}
