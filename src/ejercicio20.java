import javax.swing.JOptionPane;

public class ejercicio20 {
    public static void main(String[] args) {
        //19.Escribe un programa que solicite al usuario su nombre y luego lo imprima en
        //mayúsculas y minúsculas

        String c = JOptionPane.showInputDialog("Escriba una frase: ");
        // Crear un StringBuilder a partir de la cadena
        StringBuilder stringBuilder = new StringBuilder(c);
        // Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
        String invertida = stringBuilder.reverse().toString();
        JOptionPane.showMessageDialog(null,"Cadena original: " + c+"\n"+"Cadena invertida: " + invertida);
            }
}
