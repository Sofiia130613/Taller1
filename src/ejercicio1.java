import javax.swing.JOptionPane;

public class ejercicio1 {
    
    public static void main(String[] args) throws Exception {
    //1. Realiza un programa que solicite al usuario dos números enteros y muestre
    //su suma, resta, multiplicación y división.

    

    int numero1 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el primer número"));

    int numero2 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el segundo número"));


    JOptionPane.showMessageDialog(null,"la suma es " + (numero1+numero2));
    
    JOptionPane.showMessageDialog(null,"la resta es " + (numero1-numero2));

    JOptionPane.showMessageDialog(null,"la multiplicación es " + (numero1*numero2));
    
    JOptionPane.showMessageDialog(null,"la división es " + (numero1/numero2));

    }

}
