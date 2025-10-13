import java.util.Scanner;
public class MainJava {
    public static void main(String[] args){
Scanner entrada= new Scanner(System.in);
System.out.print("¿Cómo te llamas? ");
String nombre = entrada.nextLine();

System.out.print("¿Cuántos años tienes? ");
int edad = entrada.nextInt();

System.out.println("Hola, " + nombre + ". Tienes " + edad + " años");
if (edad>18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("eres menor de edad.");
}
    }

}
