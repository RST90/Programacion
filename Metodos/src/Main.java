import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    Calculadora operacionesMatematicas = new Calculadora ();
    operacionesMatematicas.sumar(2, 8);
    operacionesMatematicas.restar(8, 89);
    operacionesMatematicas.multi(3, 8);
    operacionesMatematicas.multip();
    operacionesMatematicas.operadoresLogicos();
    operacionesMatematicas.operadorLogico();
    Scanner evaluarCandidato = new Scanner(System.in);
    System.out.println("¿Qué salario quieres ganar?");
    double salario = evaluarCandidato.nextDouble();
    System.out.println("¿Qué edad tienes?");
    int edad = evaluarCandidato.nextInt();
    System.out.println("¿Tienes carnet y coche propio?");
    boolean cochePropio = evaluarCandidato.hasNextBoolean();
    operacionesMatematicas.evaluarCandidato(salario, edad,cochePropio);


   // System.out.println("Hola, vamos a practicar");
    //System.out.println("Pues vamos a empezar por saludar");
    //saludar("Rafa");
    //saludar("Kyra");
    //saludar("Sacha");
}

//public static void saludar(String nombre) {
    //System.out.println(" Hola " +nombre);
    //System.out.println("Dale duro a la programación");
    //System.out.println("No te desanime");
    //System.out.println("Lo estas haciendo genial");
}

//}
/* Hasta ahora lo que se ha hecho es refactorizar y también ahorrar lineas de codigo, podría haberlo escrito a mano uno por uno con distintos nombres
pero no interesa, es más efica y si hay que modificar algo es más facil modificarlo ya que al agrupar el codigo, si hay que cambiar algo
es más facil el poder solucionarlo si el problema afecta a todo. Es decir, en vez de escribirlo con Systemoutprintln lo que se hace
es crear un metodo, en este caso el metodo se llama saludar, no es como las variables que primero hay que definirlas para luego poder usarlas.
Si desde donde "llamo" al metodo saludar tiene el codigo con public static void, el nuevo metodo que yo creo debe tener lo mismo. Como yo quiero que me ponga lo mismo menos el nombre
debe tener entonces la palabra String y luego nombre.

03/11/2025: otra manera de usar las variables sería con el Scanner para ello lo que hago sería como hasta ahora que he creado nuevas funciones
Pongo la palabra Scanner y le doy a enter porque es una variable compleja que lo que hace es me permite entrar en las librerias que hay en Java
Y de esta manera la "llamo" luego pongo el nombre de la variable que haya creado en la otra clase, le pongo la palabra reservada new, luego otra vez Scanner
y entre parentesis tengo que poner System.in que lo que quiere decir es que necesita un tipo de entrada que en este caso es por teclado, es decir, por consola

Luego pongo las preguntas que yo quiero que el usario me respondiese, en este caso el salario, la edad y el carnet con coche, otra opción sería nombre, separar carnet y coche, estudios,etc..
Y ahora, con las variables que puse en la clase de Calculadora donde está la funcion que he creado evaluarCandidato tengo que ir poniendo lo siguiente:
como tengo puesto double tengo que poner double aquí también para el salario y pongo la variable salario = evaluarCandidato (mi funcion).nextDouble() y así con cada una de las preguntas.
Se pone debajo de la pregunta que he realizado.
Una vez hecho eso hay que poner operacionesMatematicas(funcion que yo he creado en Main).evaluarCandidato(funcion que he creado en Calculadora)(salario,edad, cochePropio).
*/