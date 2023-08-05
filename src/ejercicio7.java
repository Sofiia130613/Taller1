import javax.swing.JOptionPane;

public class ejercicio7 {
    
    public static void main(String[] args) throws Exception {

        //7. Crea un programa que pida al usuario un número entero positivo y muestre
        //su tabla de multiplicar hasta el 10

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número"));

        for(int i = 0; i<11; i++){
            int resultado = num*i;
            JOptionPane.showMessageDialog(null, num + "*" + i + "=" + resultado);
        }
        
    }
}
