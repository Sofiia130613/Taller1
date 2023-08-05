import javax.swing.JOptionPane;

public class ejercicio2 {

    //Escribe un programa que pida al usuario un número entero y determine si es
    //par o impar.
    public static void main(String[] args) throws Exception {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));

        int num2 = numero%2;

        if(num2 == 0){
            JOptionPane.showMessageDialog(null,"El número " + numero + " es par.");
        }else{
            JOptionPane.showMessageDialog(null,"El número " + numero + " es impar.");
        }
        
}
}
