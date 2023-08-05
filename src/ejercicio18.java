import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class ejercicio18 {

    //8.Crea un programa que genere una contraseña aleatoria de 8 caracteres que
//contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
//clase Math para generar números aleatorios y la clase String para manipular
//la contraseña.


     public static String generateRandomPassword(int len) {
        // Rango ASCII – alfanumérico (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // cada iteración del bucle elige aleatoriamente un carácter del dado
        // rango ASCII y lo agrega a la instancia `StringBuilder`

        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int len = 8;
        JOptionPane.showMessageDialog(null, "la contraseña es: "+generateRandomPassword(len));
    }

}
