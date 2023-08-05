import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {

    //4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
    //o menor de edad
       
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));

    if(edad >= 18){
        JOptionPane.showMessageDialog(null, "Usted es mayor de edad!");
    } else{
        JOptionPane.showMessageDialog(null, "Usted es menor de edad :( ");
    }
    }
}
