import java.util.Scanner;
public class Num3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Números digitados:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
	}

}
