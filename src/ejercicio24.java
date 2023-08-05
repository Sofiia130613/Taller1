

import javax.swing.JOptionPane;

public class ejercicio24 {
    
    public static void main(String[] args) {

        //24.Realiza un programa que solicite al usuario una cadena y reemplace todas
        //las apariciones de una letra específica por otra

       String frases = JOptionPane.showInputDialog("Escriba una frase: ");
        String letracambio =JOptionPane.showInputDialog("Cual letra desea cambiar: ");
        String letranueva = JOptionPane.showInputDialog("escriba la letra porque desea cambiarla: ");
        String nuevafrase = frases.replace(letracambio, letranueva);
        JOptionPane.showMessageDialog(null, "la frase con cambios es: "+nuevafrase);
        
    }
        
}

