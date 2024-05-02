import java.util.Scanner;
public class QuartaAtividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double c1, c2, h;
		
		System.out.println("Digite os valores dos catetos:");
		
		c1 = entrada.nextDouble();
		c2 = entrada.nextDouble();
		
		h = Math.sqrt(c1 * c1 + c2 * c2);
		
		System.out.println("A hipotenusa desse triângulo é: " + h);

		
		
		
	}

}
