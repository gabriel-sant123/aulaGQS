import java.util.Scanner;

public class Avaliacao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de apartamento (S para simples, D para duplo):");
        char tipoApartamento = scanner.next().charAt(0);

        System.out.println("Informe a quantidade de dias hospedado:");
        int quantidadeDias = scanner.nextInt();

        double totalPago = 0;

        if (tipoApartamento == 'S' || tipoApartamento == 's') {
            if (quantidadeDias < 10) {
                totalPago = quantidadeDias * 100.00;
            } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
                totalPago = quantidadeDias * 90.00;
            } else {
                totalPago = quantidadeDias * 80.00;
            }
        } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
            if (quantidadeDias < 10) {
                totalPago = quantidadeDias * 140.00;
            } else if (quantidadeDias >= 10 && quantidadeDias <= 15) {
                totalPago = quantidadeDias * 120.00;
            } else {
                totalPago = quantidadeDias * 100.00;
            }
        } else {
            System.out.println("Tipo de apartamento inválido. Informe S para simples ou D para duplo.");
            return;
        }

        System.out.println("O total a ser pago é: " + totalPago);
    }
}