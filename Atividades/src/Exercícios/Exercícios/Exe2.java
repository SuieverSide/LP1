package Exercícios;

public class Exe2 {
    public static void ExeA(){
        int a = 10;
        int b = 20;
        System.out.println(b);
        b = 5;
        System.out.println(a+ " " +b); 
    }
    public static void ExeB(){
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        b = 10;
        System.out.println(b+ " " +c);
        c = a + b;
        System.out.println(a+ " " +b+ " "+c);
    }
    public static void ExeC(){
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println(a+ " " +b+ " "+c);
    }
    public static void ExeD(){
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println(a+ " " +b);
    }
    public static void ExeE(){
       int a = 10;
       int b = 5;
       int c = a + b;
       b = 20;
       a = 10;
       System.out.println(a+ " " +b+ " "+c);
    }
    public static void ExeF(){
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println(z);
        x = 5;
        y = x + z;
        System.out.println(x+ " " +y+ " "+z);
    }
    public static void main(String[] args) {
        System.out.println("a)");
        ExeA();

        System.out.println("\nb)");
        ExeB();

        System.out.println("\nc)");
        ExeC();

        System.out.println("\nd)");
        ExeD();

        System.out.println("\ne)");
        ExeE();;

        System.out.println("\nf)");
        ExeF();

    }


}
