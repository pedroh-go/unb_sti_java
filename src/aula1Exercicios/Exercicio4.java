package aula1Exercicios;
import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu e-mail: ");
        String email = scanner.next();

        String dominio = email.substring(email.indexOf("@")+1);

        System.out.println("O domínio do e-mail digitado é: "+dominio+"\n");

        scanner.close();
    }

}