import javax.swing.JOptionPane;

public class ejercicio16 {
    public static void main(String[] args) throws Exception {
        //16.Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
        //número dado ingresado por el usuario

        int numero =Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos números desea generar? "));

        int x = 0;
        int num1 = 1;
        int num2;

        for(int i=1;i<=numero;i++){
            num2=x;
            x=num1 + x;
            num1 = num2;

            JOptionPane.showMessageDialog(null,num1);
        }

        
    }
}
