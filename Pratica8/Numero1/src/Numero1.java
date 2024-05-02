import java.util.Scanner;
public class Numero1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizOriginal = new int[5][5];

        // Ler a matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matrizOriginal[linha][coluna] = scanner.nextInt();
            }
        }

        // A- Imprimir a matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matrizOriginal);

        //B - Imprimir os elementos nas posições de linha par e coluna ímpar
        System.out.println("Elementos nas posições de linha par e coluna ímpar:");
        for (int linha = 0; linha < 5; linha += 2) {
            for (int coluna = 1; coluna < 5; coluna += 2) {
                System.out.print(matrizOriginal[linha][coluna] + " ");
            }
        }
        System.out.println();

        // C- Imprimir a matriz transposta
        System.out.println("Matriz transposta:");
        int[][] matrizTransposta = obterMatrizTransposta(matrizOriginal);
        imprimirMatriz(matrizTransposta);

        // D -Trocar os elementos da diagonal principal com os da diagonal secundária
        for (int i = 0; i < 5; i++) {
            int temp = matrizOriginal[i][i];
            matrizOriginal[i][i] = matrizOriginal[i][4 - i];
            matrizOriginal[i][4 - i] = temp;
        }

        // Imprimir a matriz após a troca das diagonais
        System.out.println("Matriz após a troca das diagonais:");
        imprimirMatriz(matrizOriginal);
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }

    // Método para obter a matriz transposta
    public static int[][] obterMatrizTransposta(int[][] matriz) {
        int[][] transposta = new int[5][5];
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                transposta[coluna][linha] = matriz[linha][coluna];
            }
        }
        return transposta;
	}

}
