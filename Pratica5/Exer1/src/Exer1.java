import java.util.Scanner;
public class Exer1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int numeroConta;

	        do {
	            System.out.println("Digite o número da conta corrente (3 dígitos) ou um número negativo para sair:");
	            numeroConta = scanner.nextInt();

	            if (numeroConta >= 100 && numeroConta <= 999) {
	                int digitoVerificador = calcularDigitoVerificador(numeroConta);
	                System.out.println("O dígito verificador da conta " + numeroConta + " é: " + digitoVerificador);
	            } else if (numeroConta >= 0) {
	                System.out.println("Número de conta inválido. Digite um número de 3 dígitos.");
	            }
	        } while (numeroConta >= 0);
	    }

	    public static int calcularDigitoVerificador(int numeroConta) {
	        int inverso = Integer.parseInt(new StringBuilder(String.valueOf(numeroConta)).reverse().toString());
	        int soma = numeroConta + inverso;

	        int digitoVerificador = soma % 10;
	        soma /= 10;
	        digitoVerificador += (soma % 10) * 10;
	        soma /= 10;
	        digitoVerificador += (soma % 10) * 100;

	        return digitoVerificador % 10;
	    }
	

}
