import javax.swing.JOptionPane;

public class ejercicio11 {
    
    public static void main(String[] args) throws Exception {

        //11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula
        //de Herón. El usuario debe ingresar las longitudes de los tres lados.

        float l1 =Float.parseFloat(JOptionPane.showInputDialog("Digite el primer valor"));

        float l2 =Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo valor"));

        float l3 =Float.parseFloat(JOptionPane.showInputDialog("Digite el tercer valor"));

        float p = l1 + l2 + l3;

        float semiperimetro = p/2;

        double area = Math.sqrt(semiperimetro*(semiperimetro - l1)*(semiperimetro - l2)*(semiperimetro - l3));

        JOptionPane.showMessageDialog(null, "El área del triangulo es: " + area);
    }

}
