package Exercício;
import exercícios.Livro;
public class Main{  
    public static void main(String[]args){
        Livro obj1 = new Livro(); // Estou instanciando o objeto
        obj1.setId(45); // Buscando o atributo e atribuindo um valor a ele
        System.out.println(obj1.getId()); //Buscando o valor 
    }
}