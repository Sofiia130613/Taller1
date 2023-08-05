

public class ejercicio10 {
    public static void main(String[] args) throws Exception {

        //Crea un programa que muestre los primeros 20 números de la
        //serie Fibonacci. La serie Fibonacci se forma sumando los dos números
        //anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
        
        int numero =21;

        int x = 0;
        int num1 = 1;
        int num2;

        for(int i=1;i<=numero;i++){
            num2=x;
            x=num1 + x;
            num1 = num2;

        System.out.println(num1);
        }
        
    }
}
