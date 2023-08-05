import javax.swing.JOptionPane;

public class ejercicio13 {
    
    public static void main(String[] args) throws Exception {
        //13.Pide al usuario un número decimal y muestra su valor redondeado a un
        //número específico de decimales
        double decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un digito decimal: "));
            
            double roundOff = Math.round(decimal * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null,"Decimal aproximado: "+roundOff);
    }
}
