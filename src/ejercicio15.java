import javax.swing.JOptionPane;

public class ejercicio15 {
    public static void main(String[] args) throws Exception {

        //15.Crea un programa que pida al usuario un número entero y determine si es un
    //número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
    //derecha que de derecha a izquierda.
    
    int normal;
    int inverso=0;
    int cifra;
    int numero;
    do{
     numero =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero entero mas de una cifra mayor a 10: "));
    }while(numero < 10);

    normal = numero;

    while(normal!= 0){
        cifra = normal % 10;
        inverso = inverso * 10 + cifra;
        normal = normal/10;
    }

    if(numero==inverso){
        JOptionPane.showMessageDialog(null,"El número ingresado es capicúa");
    }else{
        JOptionPane.showMessageDialog(null,"El número ingresado no es capicúa");
    }
    

    
    
    }
}
