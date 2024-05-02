import java.util.Scanner;
public class TerceiraAtividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int min;
		min = 1412;
		double salario, quantidade;
		
		System.out.println("Informe o valor do salário do funcionário:");
		salario = entrada.nextDouble();
		
		quantidade = salario/min;
		
		System.out.println("A quantidade de salários mínimos que esse funcionário recebe é: " + quantidade + " salários mínimos");
		
		
	}

}
