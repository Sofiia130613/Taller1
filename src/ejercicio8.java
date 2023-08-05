import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String[] args) throws Exception {

        //8. Realiza un programa que simule un juego de adivinar un número. El
        //programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
        //adivinarlo. El programa debe indicar si el número ingresado es mayor o
        //menor que el número a adivinar

        int numIntentos = 0;

        int numIngresado = (int)(Math.random()*100+1);

        do{
            int numAleatorio = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite un número del 1 al 100, tienes 15 intentos..."));

            if(numAleatorio == numIngresado){
                JOptionPane.showMessageDialog(null, "¡Felicidades!, adivinaste el número");
            }else if(numIngresado < numAleatorio){
                JOptionPane.showMessageDialog(null, "Casi, el número ingresado es menor al correspondiente");
            }else if(numIngresado > numAleatorio){
                JOptionPane.showMessageDialog(null, "Casi, el número ingresado es mayor al correspondiente");
            }
            numIntentos++;
        }while(numIntentos <15);
        JOptionPane.showMessageDialog(null, "Se terminaron los 15 intentos");
    
    }   
}
