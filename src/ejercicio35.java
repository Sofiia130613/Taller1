public class ejercicio35 {
    

    //35.Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
    //del 1 al 10. Usa para esto una matriz
    static int[][] generaMatriz(int filas, int columnas){
        int i,j;
        int[][] matriz = new int[filas][columnas];
        
        //Relleno la primera fila y la primera columna de la matriz
        for (i=0 ; i < matriz.length ; i++){
            matriz[i][0]=i;
            matriz[0][i]=i;
        }
        //Ahora relleno el resto de la matriz
        for (i=1 ; i < matriz.length ; i++){
            for (j=1 ; j < matriz[i].length ; j++){
               matriz[i][j]=i*j; 
            }
        }
        return matriz;
    }
    //formato "%4d" para que todos los valores salgan
    //tabulados con un ancho de 4 carácteres.
    static void muestraMatriz(int[][] matriz){
        int i,j;
        
        for (i=0; i < matriz.length ; i++){
            for (j=0 ; j < matriz[i].length ; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz=new int[11][11];
        
        matriz=generaMatriz(11,11);
        muestraMatriz(matriz);        
    }    
}
