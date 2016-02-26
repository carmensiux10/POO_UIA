public class operaciones 
{
	public static void main (String[] args)
	{

		int a=10, b=3, c=1,d,e;
		float x,y;
		x =  a/b;
		//c = a<b &&  c; // no existe conversion, c ml es no es una expresion booleanan, los operadores && evaluan la expresion del lado derecho
		//c = boolean (a<b);	
	
		d = a + b++;
		e = ++a - b;
		y = a/b;  //ya esta declarado como float, ya no es necesaria la palabra float

	System.out.println("El valor de x es: " + x);
    System.out.println("El valor de d es: " + d);
    System.out.println("EL VALOR DE E ES: " + e);
    System.out.println("EL VALOR DE Y ES: " + y);
  


	}
}