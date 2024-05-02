import java.util.Scanner;
public class SegundaAtividade {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double celsius, far;
        
        System.out.println("Informe graus celsius:");
        celsius = entrada.nextDouble();
        
        far = (celsius * 1.8) + 32;
        
        System.out.println("Essa temperatura em Fahrenheit é:" + far);

	}

}
