public class ejercicio29 {
    
    public static void main(String[] args) {

        //29.Encontrar el número más grande: Crea un programa que encuentre el número
        //más grande en un arreglo de enteros.


    int[] numeros = new int[] { 22, 70, 435, 500, 0, 14, 160, 53 };
        // Asumir que el mayor es el primero
        int mayor = numeros[0];
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > mayor) {
                mayor = numeros[x];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
