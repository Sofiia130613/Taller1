import javax.swing.JOptionPane;

public class ejercicio9 {
    public static void main(String[] args) throws Exception {


        //9. Escribe un programa que solicite al usuario un número entero positivo y
        //calcule su factorial.

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número"));

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            JOptionPane.showMessageDialog(null,num + "  Factorial ! " + " = " + (factorial = factorial * i));
        }
    } 
}
