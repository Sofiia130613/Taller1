public class ejercicio32 {

    //32.Buscar un elemento: Escribe un programa que busque un número específico
    //en un arreglo y muestre su índice (o un mensaje si no se encuentra).

    public static int existeEnArreglo(int[] arreglo, int busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
          if (arreglo[x] == busqueda) {
            return x;
          }
        }
        return -1;
      }
    public static void main(String[] args) {

        
            // Demostración con enteros
            int[] numeros = { 57, 21, 7, 13, 18 };
            int numeroBuscado = 277;
            int posicionDeElementoBuscado = existeEnArreglo(numeros, numeroBuscado);
            if (posicionDeElementoBuscado == -1) {
              System.out.println("El elemento NO existe en el arreglo");
            } else {
              System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
            }
          }

}
