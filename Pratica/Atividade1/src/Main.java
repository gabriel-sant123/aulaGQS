import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float dmaior, dmenor, area;

        System.out.println("Informe o número da diagonal maior");
        dmaior = entrada.nextFloat();

        System.out.println("Informe a diagonal menor:");
        dmenor = entrada.nextFloat();

        area = (dmaior * dmenor)/ 2;

        System.out.println("A área do losango é:" + area);

	}

}
