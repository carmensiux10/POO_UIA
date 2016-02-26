
import java.util.Scanner;
public class multiplos{
public static void main(String []args){

	Scanner sc = new Scanner(System.in);

int a, b, c, suma = 0;
String multip=" ";




do{

System.out.println("introduce el valor de a:");
a=sc.nextInt();

}while(a<0);

do{
System.out.println("introduce el valor de b");
b=sc.nextInt();

}while(b<0);

if(b<a){
c=a;
a=b;
b=c;

}
for (int i=a; i<=b; i++){
if(i%5==0){
multip = multip +i+":";
System.out.println("multiplos de 5:"+multip);
}
}

for (int i=a; i<=b; i++){
if(i%5==0){
suma = suma +i;
}
System.out.println("suma" + suma);

}
}
}