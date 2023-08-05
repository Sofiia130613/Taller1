import java.util.Arrays;


import javax.swing.JOptionPane;

public class ejercicio27 {
    public static void main(String[] args) {


        //27.Crea un programa que solicite al usuario una frase y luego muestre las
        //palabras ordenadas alfabéticamente

    
        String oracion = JOptionPane.showInputDialog("Escriba una frase: ");
        String [] arreglo= oracion.split(" ");
        Arrays.sort(arreglo);
        JOptionPane.showMessageDialog(null, arreglo); 
    }

     
}
