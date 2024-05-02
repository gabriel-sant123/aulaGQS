import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        double nota;
	        do {
	            System.out.println("Digite a nota (entre 0 e 10):");
	            nota = scanner.nextDouble();
	        } while (nota < 0 || nota > 10);
	        System.out.println("Nota válida: " + nota);

	        double salario;
	        do {
	            System.out.println("Digite o salário (maior que zero):");
	            salario = scanner.nextDouble();
	        } while (salario <= 0);
	        System.out.println("Salário válido: " + salario);

	        char sexo;
	        do {
	            System.out.println("Digite o sexo (m ou f):");
	            sexo = scanner.next().charAt(0);
	        } while (sexo != 'm' && sexo != 'f');
	        System.out.println("Sexo válido: " + sexo);

	        int idade;
	        do {
	            System.out.println("Digite a idade (entre 0 e 150):");
	            idade = scanner.nextInt();
	        } while (idade < 0 || idade > 150);
	        System.out.println("Idade válida: " + idade);
	}

}
