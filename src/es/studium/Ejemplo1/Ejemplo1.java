package es.studium.Ejemplo1;

public class Ejemplo1
{

	public static void main(String[] args)
	{
		int a, b;
		a = 7;
		b = 0;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Error:" + ae.getMessage());
		}
	}

}
