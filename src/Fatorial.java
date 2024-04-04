import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 0;

        for (int i = numero - 1; i >= 1; i--) {
            if (i == numero - 1) {
                fatorial = numero * i;
                continue;
            }

            fatorial = fatorial * i;
        }

        System.out.printf("O fatorial de %d é %d", numero, fatorial);
    }
}