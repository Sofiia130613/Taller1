import javax.swing.JOptionPane;

public class ejercicio25 {
    
    public static void main(String[] args) {

        //25.Pide al usuario una frase y muestra cada palabra por separado

        String frase = JOptionPane.showInputDialog("Digite una frase: ");
        String [] separar = frase.split(" ");

        for (int i = 0; i == 0 || i < separar.length; i++) {
            JOptionPane.showMessageDialog(null, separar);
            break;                  
        }

        }
}
