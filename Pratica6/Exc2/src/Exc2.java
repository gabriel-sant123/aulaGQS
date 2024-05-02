import javax.swing.JOptionPane;
public class Exc2 {

	public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
        }
	}

}
