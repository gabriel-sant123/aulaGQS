import javax.swing.JOptionPane;
public class Exc4 {

	public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números a serem informados:"));
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= quantidade; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + i + ":"));
            maior = Math.max(maior, numero);
            menor = Math.min(menor, numero);
        }

        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
	}

}
