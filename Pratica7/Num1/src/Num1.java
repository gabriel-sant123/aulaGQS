import java.util.Scanner;
public class Num1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("Números digitados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSoma dos números pares: " + somaPares);
	}

}
