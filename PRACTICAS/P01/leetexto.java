import java.io.*;
public class leetexto{
public static void main(String[] args) throws IOException
  int charsCount = 0;
  int wordsCount = 0;
  int linesCount = 0;
  char carac;

System.out.println("Introducir texto. " + "Pulse [Enter] despues de cada linea.");
System.out.println("Para finalizar pulsar Ctrl+z. \n ");

   while ((carac = (char)System.in.read()) != eof)
   {
    //[Enter] = CRLF = \r\n
    if (carac == '\r') continue; //Le sigue un \n
    charsCount++; //Contador de caracteres
    
    //Eliminar blancos, tabuladores y finales de linea entre palabras
    if (carac == ' ' || carac == '\n' || carac == '\t')
    palabra  = false;
    else if (!palabra)//comienza una palabra
    {

 System.out.println("# of chars: " + charsCount);
 System.out.println("# of words: " + wordsCount);
 System.out.println("# of lines: " + linesCount);

}
}

