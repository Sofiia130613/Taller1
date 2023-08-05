import javax.swing.JOptionPane;

public class ejercicio19 {

    //19.Escribe un programa que solicite al usuario su nombre y luego lo imprima en
    //mayúsculas y minúsculas
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        JOptionPane.showMessageDialog(null,nombre.toLowerCase()+"\n"+nombre.toUpperCase());
    }
}
