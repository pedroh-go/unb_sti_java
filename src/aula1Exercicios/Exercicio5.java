package aula1Exercicios;
import java.util.Scanner;

public class Exercicio5{
    	  
     public static void main(String[] args){
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra ou frase para verificar se � um Pal�ndromo: ");
        String texto = scanner.nextLine().toLowerCase().replaceAll("\\s", ""); 
        scanner.close();

        String textoInvertido =  new StringBuilder(texto).reverse().toString();

        String resultado = "NÃO � um Palindromo!";
        if(texto.equals(textoInvertido))
            resultado = "� um Palindromo!";
    
        System.out.println("\nTexto digitado: "+ texto + "\nTexto Invertido: "+textoInvertido+"\nResultado: Texto digitado "+resultado+"\n");
    }
}  
