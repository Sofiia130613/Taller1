import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ejercicio23 {
    
    //23.Crea un programa que pida al usuario una oración y muestre cuántas
    //palabras contiene
    public static void main(String[] args) {
        
        String palabra = JOptionPane.showInputDialog(null, "Escriba una frase: ");

        StringTokenizer st = new StringTokenizer(palabra);

        JOptionPane.showMessageDialog(null,st.countTokens());
    }
}
