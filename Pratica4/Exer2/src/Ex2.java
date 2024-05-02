import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pessoas, fil, totalFilhos;
		double mediaSal, mediaFil, salario, totalSalarios;
		
		while (true){
			System.out.println("Digite o salário (se deseja parar, digite um número negativo):");
			salario = entrada.nextDouble();
			
			if (salario < 0) {
				break;
			}
			System.out.println("Digite a quantidade de filhos que possui ");
			fil = entrada.nextInt();
			
			pessoas++;

            totalSalarios += salario;
            totalFilhos += fil;
            mediaSal = totalSalarios / pessoas;
            mediaFil = (double) totalFilhos / pessoas;
		}

            System.out.println("Média salarial da população: " + mediaSal);
            System.out.println("Média do número de filhos: " + mediaFil);
			
		}
		
	}

}
