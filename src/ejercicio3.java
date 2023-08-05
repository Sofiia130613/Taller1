import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) throws Exception {
        //Crea un programa que calcule y muestre el área y el perímetro de un círculo.
        //El usuario debe proporcionar el radio del círculo.

        float radio = Float.parseFloat(JOptionPane.showInputDialog("Digíte el valor del radio del circulo"));

        JOptionPane.showMessageDialog(null,"El área del cirulo es: " + (3.1416*radio));

        JOptionPane.showMessageDialog(null,"El perimetro del cirulo es: " + (3.1416*(radio*2)));
    }
}
