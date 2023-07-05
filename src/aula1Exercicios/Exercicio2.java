package aula1Exercicios;
import java.util.Scanner;

public class Exercicio2{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] numeros = new String[2];

        for(int i = 0; i <= 1; i++){
            System.out.print("Informe o "+(i+1)+"� n�mero v�lido: ");
            numeros[i] = scanner.next();

            //Sen�o validado remove a incrementa��o
            if(!valida(numeros[i]))
                i--;
        }

        scanner.close();

        int somaPares = 0;
        for(int i =  Integer.parseInt(numeros[0]); i <= Integer.parseInt(numeros[1]); i++){
            if(i % 2 == 0)
                somaPares += i;
        }

        System.out.println("A soma dos n�meros pares entre "+numeros[0] + " e "+ numeros[1]+" � igual a "+somaPares+"\n");
    }

    /**
     * Valida a entrada de dado
     * @param entrada
     * @return
     */
    private static boolean valida(String entrada){
        try{
            Integer.parseInt(entrada);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}