import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ejercicio21 {
    

    //21.Pide al usuario una cadena y muestra cuántas veces aparece una letra
    //específica en ella
    
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog(null, "Escriba una frase: ");
        Map<Character, Integer> numChars = new HashMap<Character, Integer>();
        for (int i = 0; i < palabra.length(); ++i) {
            char charAt = palabra.charAt(i);
            if (!numChars.containsKey(charAt)) {
                numChars.put(charAt, 1);
            } else {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }
        JOptionPane.showMessageDialog(null,numChars);

        }
}
