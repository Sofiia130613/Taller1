import java.util.Arrays;

public class ejercicio33 {
    

    //33.Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
    //cada elemento en un arreglo.

    public static void main(String[] args) {
     int [] orden ={7, 13, 7,  7, 1, 8, 8, 9, 10, 0, 11};
        Arrays.sort(orden);
        int contador = 0;
        int aux = orden[0];
        for (int i = 0; i < orden.length; i++) {
            if (aux == orden[i]) {
                contador++;
            }else{
                System.out.println("El numero "+aux+" se repite:"+contador+" veces." );
                contador = 1;
                aux = orden[i];
            }
        }   
    }
}
