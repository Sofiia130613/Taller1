import javax.swing.JOptionPane;

public class ejercicio22 {
    
    //22.Escribe un programa que solicite al usuario una frase y verifique si es un
    //palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Escriba una palabra o frase:");
        JOptionPane.showMessageDialog(null, "La palabra ingresada " + palabra +" es polindroma? \n"+ esPolindromo(palabra));
    }

    public static boolean esPolindromo(String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 0, p = palabra.length() - 1; i <= p; i++, p--) {
            if (palabra.charAt(i) != palabra.charAt(p)) {
                return false;
            }
        }
        return true;
    }
}
