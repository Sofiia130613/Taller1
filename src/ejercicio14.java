import javax.swing.JOptionPane;

public class ejercicio14 {
    
    public static void main(String[] args) throws Exception {

        //14.Escribe un programa que solicite al usuario un número entero positivo y
        //verifique si es un número perfecto. Un número perfecto es aquel cuya suma
        //de sus divisores propios (excluyendo al propio número) es igual al número.


// Definición:Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.

        int i;
        int suma = 0;
        

        int numero =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero entero positivo"));

        for (i = 1; i < numero; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (numero % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == numero) {           // si el numero es igual a la suma de sus divisores es perfecto   
            
            JOptionPane.showMessageDialog(null,"El número ingresado es perfecto");
            
        } else {
            
            JOptionPane.showMessageDialog(null,"El número ingresado no es perfecto");

        }
    }
}
