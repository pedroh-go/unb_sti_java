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
            System.out.print("Um número OCULTO foi gerado. Adivinhe que número foi este: ");
            numero = scanner.nextInt(); 
            
            if(numeroGerado != numero)
                 ajuda(numeroGerado, numero );
                
            totalTentativas++;
            System.out.println();            

        }while(numeroGerado != numero);

        scanner.close();

        System.out.println("::::::::::::: Parabéns você acertou o número :::::::::::::");
        System.out.println("........Número gerado: "+numeroGerado+"\n........Total de tentativas: "+totalTentativas+"\n");
    }

   /**
    * Função para ajudar
    * @param numeroGerado
    * @param numeroDigitado
    */
    private static void ajuda(int numeroGerado, int numeroDigitado ){

        if(numeroGerado % 2 == 0 &&  numeroDigitado % 2 != 0){
            System.out.println("DICA: o número gerado é PAR.");
        }
        else if(numeroGerado % 2 != 0 &&  numeroDigitado % 2 == 0){
            System.out.println("Dica: o número gerado é IMPAR.");
        }
        else{

            if(numeroGerado < numeroDigitado)
                System.out.println("Dica: o número gerado é MENOR do que este.");
            else if(numeroGerado > numeroDigitado)
                System.out.println("Dica: o número gerado é MAIOR do que este.");      
            
            //Após mais de 5 tentativas e distante do numero oculto em até 20 unidades, essa ajuda é ativada.
            int diferenca = numeroGerado - numeroDigitado;
            if(totalTentativas > 5 && (diferenca >= 20 || diferenca <= -20))
                System.out.println("Dica bônus: Ainda bastante distante do número oculto: "+diferenca);              
        }
    }
}