import javax.swing.JOptionPane;

public class ejercicio6 {
    
    public static void main(String[] args) throws Exception {

    //6. Escribe un programa que pida al usuario un número y verifique si es positivo,
    //negativo o cero.

    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));

    if(num<0){
        JOptionPane.showMessageDialog(null, + num + " Es número un negativo");
    }else if(num>0){
        JOptionPane.showMessageDialog(null, + num + " Es número un positivo");
    }else{
        JOptionPane.showMessageDialog(null, + num + " Es cero");
    }
    }

}
