package teste_mesa;

public class Soma {
	
	public double somar_Real(double a, double b) {
		return (a+b);
	}
	
	public void somar_complexo (int a, int b, int c, int d)
	{
		int r= a+c;
		int i= b+d;
		System.out.println("A soma ="+r+i+"i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a=5;
		b=10;
		int soma=a+b;
		System.out.println("soma= "+soma);
		Soma resulti=new Soma();
		System.out.println(resulti.somar_Real(2.6, 3.5));
		Soma result2=new Soma();
		result2.somar_complexo(5, 2, 7, -3 );
		
		
		
		
	}

}
