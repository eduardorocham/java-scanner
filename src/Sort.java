import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = temp;
                }
            }
        }

        for (int numero: numeros) {
            System.out.println(numero);
        }
    }
}
