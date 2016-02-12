import java.util.Scanner;

public class juego
{
public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    int count = 0;
    int a = 1 + (int) (Math.random() * 99);
    int adivina = 0;

    System.out.println("Estoy pensando un numero desde 1 a 100"
        + " ... adivina que numero es ?");

    while (adivina != a) {
        adivina = keyboard.nextInt();
        count++;
        if (adivina > a) {
            System.out.println("menor!");
        } else if (adivina < a) {
            System.out.println("mayor!");
        }
    }
    System.out.println("Felicidades. Adivinaste el numero con "
        + count + " intentos!");

}
}
