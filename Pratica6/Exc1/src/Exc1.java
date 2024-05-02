import javax.swing.JOptionPane;
public class Exc1 {

	public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        int soma = 0;
        for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + n1 + " e " + n2 + " é: " + soma);
	}

}
