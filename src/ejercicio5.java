import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {

        //5. Realiza un programa que solicite al usuario dos números enteros y determine
        //cuál es el mayor de ellos.

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));

        if(num1>num2){
            JOptionPane.showMessageDialog(null, num1 + " Es mayor que " + num2);
        }else{
            JOptionPane.showMessageDialog(null, num1 + " Es mayor que " + num2);
        }

        }
}
