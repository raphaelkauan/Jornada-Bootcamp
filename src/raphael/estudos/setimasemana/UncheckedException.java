package raphael.estudos.setimasemana;

import javax.swing.JOptionPane;
import java.lang.ArithmeticException;

// Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] agrs) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!" + erro.getMessage());
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0");
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);

    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
