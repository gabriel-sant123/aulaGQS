import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		double mensalidade;
		char sexo;
		
		System.out.println("Digite a idade e o sexo: ");
		
		idade = entrada.nextInt();
		sexo = entrada.next().charAt(0);

		if (sexo == 'M' || sexo == 'm') {
            if (idade <= 15) {
                mensalidade = 60;
            } else if (idade <= 18) {
                mensalidade = 75;
            } else if (idade <= 25) {
                mensalidade = 90;
            } else if (idade <= 40) {
                mensalidade = 85;
            } else {
                mensalidade = 80;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade <= 18) {
                mensalidade = 60;
            } else if (idade <= 25) {
                mensalidade = 90;
            } else if (idade <= 30) {
                mensalidade = 90;
            } else if (idade <= 40) {
                mensalidade = 85;
            } else {
                mensalidade = 80;
            }
        } else {
            System.out.println("Sexo inválido. Informe M para masculino ou F para feminino.");
            return;
        }

        System.out.println("A mensalidade a ser paga é: " + mensalidade);
    }
	}

