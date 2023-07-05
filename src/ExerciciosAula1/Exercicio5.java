package ExerciciosAula1;
import java.util.Scanner;

public class Exercicio5{
    	  
     public static void main(String[] args){
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra ou frase para verificar se é um Palíndromo: ");
        String texto = scanner.nextLine().toLowerCase().replaceAll("\\s", ""); 
        scanner.close();

        String textoInvertido =  new StringBuilder(texto).reverse().toString();

        String resultado = "NÃƒO é um Palindromo!";
        if(texto.equals(textoInvertido))
            resultado = "é um Palindromo!";
    
        System.out.println("\nTexto digitado: "+ texto + "\nTexto Invertido: "+textoInvertido+"\nResultado: Texto digitado "+resultado+"\n");
    }
}  
