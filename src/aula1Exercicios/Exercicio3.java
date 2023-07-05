package aula1Exercicios;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3{

    private static int totalTentativas = 0 ;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        Random random = new Random();
        int numeroGerado = random.nextInt(100);
        
        do{
            System.out.print("Um n�mero OCULTO foi gerado. Adivinhe que n�mero foi este: ");
            numero = scanner.nextInt(); 
            
            if(numeroGerado != numero)
                 ajuda(numeroGerado, numero );
                
            totalTentativas++;
            System.out.println();            

        }while(numeroGerado != numero);

        scanner.close();

        System.out.println("::::::::::::: Parab�ns voc� acertou o n�mero :::::::::::::");
        System.out.println("........N�mero gerado: "+numeroGerado+"\n........Total de tentativas: "+totalTentativas+"\n");
    }

   /**
    * Fun��o para ajudar
    * @param numeroGerado
    * @param numeroDigitado
    */
    private static void ajuda(int numeroGerado, int numeroDigitado ){

        if(numeroGerado % 2 == 0 &&  numeroDigitado % 2 != 0){
            System.out.println("DICA: o n�mero gerado � PAR.");
        }
        else if(numeroGerado % 2 != 0 &&  numeroDigitado % 2 == 0){
            System.out.println("Dica: o n�mero gerado � IMPAR.");
        }
        else{

            if(numeroGerado < numeroDigitado)
                System.out.println("Dica: o n�mero gerado � MENOR do que este.");
            else if(numeroGerado > numeroDigitado)
                System.out.println("Dica: o n�mero gerado � MAIOR do que este.");      
            
            //Ap�s mais de 5 tentativas e distante do numero oculto em at� 20 unidades, essa ajuda � ativada.
            int diferenca = numeroGerado - numeroDigitado;
            if(totalTentativas > 5 && (diferenca >= 20 || diferenca <= -20))
                System.out.println("Dica b�nus: Ainda bastante distante do n�mero oculto: "+diferenca);              
        }
    }
}