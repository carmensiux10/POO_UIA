import java.util.Scanner;
import javax.swing.JOptionPane;

public class javaCalculadora 
{

    public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operacion;


        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca primer numero, por favor");
        num1 = input.nextInt();

        System.out.println("Introduzca segundo numero, por favor");
        num2 = input.nextInt();

        System.out.println("Introduzca la opcion deseada: 1  Suma, 2 Resta, 3  Multiplicacion y 4 para division:");
        int choose;
      
        choose = inp.nextInt();
        
        switch (choose){
        
        case 1:

            System.out.println("El resultado de La suma de los numeros es:" + (num1 + num2));
            break;

        case 2:

            System.out.println("El resultado de la resta de los numeros es:" + (num1 - num2));
            break;

        case 3:

          System.out.println("El resultado de la multiplicacion de los numeros es:" + (num1 * num2));
          break;

        case 4:

            System.out.println("El resultado de la division de los numeros es:" + (num1 / num2));
        break;

        default:
        System.out.println ("Operacion erronea");
    }
}