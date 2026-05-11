package iniciante;

import java.util.Scanner;

public class Salario {
    public static void calcular(int numero, int horas, double valor) {
        double valorFinal = valor * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", valorFinal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valor = sc.nextDouble();

        calcular(numero, horas, valor);

        sc.close();
    }
}
