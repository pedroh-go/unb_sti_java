package ExerciciosAula1;
import java.util.Scanner;

public class Exercicio1{


    public static void main(String[] args){
    	 Scanner scanner = new Scanner(System.in);
         String n = "";

         do{           
             System.out.print("Informe um n�mero v�lido maior que zero: ");
             n = scanner.next();            
         }while(!valida(n));        
         
         scanner.close();

         int somaNumerosPares = 0;
         for (int i = 1; i <= Integer.parseInt(n); i++) {                
             if(i % 2 == 0)
                 somaNumerosPares += i;
         }
         System.out.println("A soma dos n�meros pares entre 1 e "+n +" � igual a "+somaNumerosPares+"\n");     
    }
    
    /**
     * Valida entrada de dados
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