public class ejercicio28 {
    public static void main(String[] args) {

        //28.Suma de elementos: Escribe un programa que calcule la suma de todos los
        //elementos en un arreglo de enteros.

        int arr[] = new int[] {13,06,12,20,03,7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Array Sum = "+sum);



        }
}
