import java.util.Scanner;
public class QuintaAtividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raio, c, a, v;
		
		System.out.println("Digite o valor do raio para que seja retornado o comprimento, área e volume da esfera:");
		raio = entrada.nextDouble();
		
		
		c = 2 * Math.PI * raio;
        a = Math.PI * raio * raio;
        v = (3.0/4.0) * Math.PI * raio * raio * raio;

        System.out.println("A - O comprimento da esfera é: " + c);
        System.out.println("B -A área da esfera é: " + a);
        System.out.println("C -O volume da esfera é: " + v);
		
		

	}

}
