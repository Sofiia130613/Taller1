import java.util.Scanner;

public class ejercicio26 {
    
    public static void main(String[] args) {

        //26.Escribe un programa que pida al usuario una cadena y muestre cuántos
        //caracteres tiene sin contar los espacios en blanco

        Scanner  sc = new Scanner(System.in);
        

        System.out.println("Escriba una cadena ");
        String entrada =sc.nextLine();


        String letras="";

 
        int num_letras=0;

        for(int i=0; i<entrada.length();i++){
            if(Character.isLetter(entrada.charAt(i))){
                num_letras++;
                letras+=entrada.charAt(i);
            }

        }
        System.out.println("El números de letras que tiene la frase sin espacio son: " +num_letras);
        sc.close();
    }
}
