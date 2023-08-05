import java.util.Arrays;

public class ejercicio31 {

    //31.Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
    //el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
    //de manera ascendente.

    public static void main(String[] args) {

    int[] numeros = { 3, 5, 1, 2, 1, 7, 0, -1 };
        Arrays.sort(numeros);
        for (int n : numeros) {
            System.out.println(n);
        }
    }            
}
