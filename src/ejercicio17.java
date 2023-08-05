import javax.swing.JOptionPane;

public class ejercicio17 {
    
    public static void main(String[] args) throws Exception {

        //17.Pide al usuario dos números enteros y muestra todos los números primos
        //que se encuentran en ese rango.

        int inicio;
        int fin;
        int contador =0;

        inicio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el inicio"));

        fin =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el fin"));

        System.out.printf("Total: ", contador);
        for(int i=inicio; i<=fin;i++){
            if(esPrimo (i) ){
                contador++;
                System.out.print(String.valueOf(i) + ",");
            }
        }
        

        

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
