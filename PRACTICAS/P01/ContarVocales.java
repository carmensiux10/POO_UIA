import java.util.Scanner;

public class ContarVocales 
{
    public static void main (String[] args) 
    {
        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Cadena: ");
        String Cadena = Leer.nextLine(); // Leer cadena
        Cadena = Cadena.toLowerCase(); // Pasar a minuscula la cadena
        
        int ContadorVocales = 0;
        
        for(int i=0; i<Cadena.length(); i++)
        {
            if(Cadena.charAt(i) == 'a' || Cadena.charAt(i) == 'e' || Cadena.charAt(i) == 'i' || Cadena.charAt(i) == 'o' || Cadena.charAt(i) == 'u')
                ContadorVocales++;
        }
        
        System.out.print("Numero de vocales: " + ContadorVocales);
    }
}