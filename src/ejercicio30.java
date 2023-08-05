import java.util.Arrays;

public class ejercicio30 {
    
    //30.Eliminar duplicados: Diseña un programa que elimine los elementos
    //duplicados de un arreglo.

        public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 1, 2, 4, 5, 9, 9, 10, 200};
        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
        
}
