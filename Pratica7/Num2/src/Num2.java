import java.util.Scanner;
public class Num2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double[] numeros = new double[10];
	        int[] posicoesNegativos = new int[10];
	        int contadorNegativos = 0;

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Digite o número " + (i + 1) + ":");
	            numeros[i] = scanner.nextDouble();
	            if (numeros[i] < 0) {
	                posicoesNegativos[contadorNegativos++] = i;
	            }
	        }

	        System.out.println("Números digitados:");
	        for (double numero : numeros) {
	            System.out.print(numero + " ");
	        }
	        System.out.println("\nPosições dos números negativos:");
	        for (int i = 0; i < contadorNegativos; i++) {
	            System.out.print(posicoesNegativos[i] + " ");
	        }
	}

}
