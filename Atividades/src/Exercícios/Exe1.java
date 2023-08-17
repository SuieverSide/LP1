package exercícios;

public class Exe1 {        
    public static void troca(){
        int a = 10;
        int b = 20;
        int aux = a;
        a = b;
        b = aux;
        System.out.println("O valor de A: "+a+"\nO valor de B: "+b);
    }
    public static void main(String[]args){
        Exe1 obj1 = new Exe1(); // Instanciando o objeto
        obj1.troca(); //Chamando o método através do objeto instanciado 
    }

}