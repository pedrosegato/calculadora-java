import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        double operation; // inicializa a variável que irá fazer as operações 
        String firstNumber = JOptionPane.showInputDialog("Primeiro número");
        String secondNumber = JOptionPane.showInputDialog("Segundo número");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        String operationSymbol = JOptionPane.showInputDialog("Qual operação deseja fazer? (+, -, *, /)");

        if (operationSymbol.equals("+")) { // compara a respostas com if. if. if.
            operation = number1 + number2;
        } else if (operationSymbol.equals("-")) {
            operation = number1 - number2;
        } else if (operationSymbol.equals("*")) {
            operation = number1 * number2;
        } else if (operationSymbol.equals("/")) {
            operation = number1 / number2;
        } else {
            JOptionPane.showConfirmDialog(null, "Operação inválida.", "Calculadora", JOptionPane.PLAIN_MESSAGE); // erro
            return; 
        }

        JOptionPane.showConfirmDialog(null, "O resultado da operação é: " + operation, "Calculadora", JOptionPane.PLAIN_MESSAGE);
    }
}