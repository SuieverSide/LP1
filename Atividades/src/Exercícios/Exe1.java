package Exercícios;

public class Exe1 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        
        trocavalor(a, b);
        System.out.println("Valor de A: " + a + " Valor de B: " + b);
    }
    
    public static void trocavalor(Integer a, Integer b) {
        Integer aux = a;
        a = b;
        b = aux;
    }
}