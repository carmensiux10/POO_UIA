import java.io.*;
public class rotationchar{
  public static void main(String[]args)throws IOException{

        int i;
        String entrada;
        String salida;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" frase a rotar :");
        entrada=br.readLine();

        for(i=0;i<=entrada.length()-1;i++){

            entrada=entrada.charAt(entrada.length()-1)+ entrada.substring(0,entrada.length()-1);
            System.out.println(entrada);
        }
       
    }
}