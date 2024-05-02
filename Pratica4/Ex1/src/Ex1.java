import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int faltas, alunos = 0, reprovados = 0, totalAlunos = 0;
		double nota, media, soma = 0, maior = 0, menor = Double.MAX_VALUE;

				
		while (true){
			System.out.println("Digite a nota do aluno (ao se colocar uma negativa, o programa para parar:");
			nota = entrada.nextDouble();
			
			if (nota < 0) {
				break;
			}
			System.out.println("Digite as faltas do aluno:");
			faltas = entrada.nextInt();
			
			totalAlunos++;
			soma += nota;
			
			if (nota >= 90) {
				alunos++;}
			if (nota < 70 || faltas >= 20) {
                reprovados++;}
			
            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
			
		}
		
        media = soma / totalAlunos;

		
        System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + alunos);
        System.out.println("Quantidade de alunos reprovados por nota ou falta: " + reprovados);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média de notas da turma: " + media);

	}

}
