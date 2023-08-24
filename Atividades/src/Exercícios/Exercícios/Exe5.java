package Exercícios;
import java.util.Scanner;
public class Exe5 {
    public static int antecessor(int valor){
        return(valor-1);
    }
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        System.out.println("O valor anterior é: "+antecessor(+sc1.nextInt())); //O digitado é atribuido vai para o antecessor 
    }
}
