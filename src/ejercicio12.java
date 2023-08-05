import javax.swing.JOptionPane;

public class ejercicio12 {
    
    public static void main(String[] args) throws Exception {
        //12.Realiza un programa que pida al usuario un número entero y determine si es
        // un número primo o no
        int numero =Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));

        JOptionPane.showMessageDialog(null,esPrimo(numero));
        
    }
    public static boolean esPrimo(int numero) {
        if (numero==0 || numero==1 || numero==4){
            return false;
        }
        for(int i = 2; i<numero/2; i++){
            if(numero % i ==0)
            return false;
        }
        return true;
    }
}
