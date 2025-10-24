public class Main{

public static void main(String[] args) {
    Calculadora operacionesMatematicas = new Calculadora ();
    operacionesMatematicas.sumar(2, 8);
    operacionesMatematicas.restar(8, 89);


    System.out.println("Hola, vamos a practicar");
    System.out.println("Pues vamos a empezar por saludar");
    saludar("Rafa");
    saludar("Kyra");
    saludar("Sacha");
}

public static void saludar(String nombre) {
    System.out.println(" Hola " +nombre);
    System.out.println("Dale duro a la programación");
    System.out.println("No te desanime");
    System.out.println("Lo estas haciendo genial");
}

}
/* Hasta ahora lo que se ha hecho es refactorizar y también ahorrar lineas de codigo, podría haberlo escrito a mano uno por uno con distintos nombres
pero no interesa, es más efica y si hay que modificar algo es más facil modificarlo ya que al agrupar el codigo, si hay que cambiar algo
es más facil el poder solucionarlo si el problema afecta a todo. Es decir, en vez de escribirlo con Systemoutprintln lo que se hace
es crear un metodo, en este caso el metodo se llama saludar, no es como las variables que primero hay que definirlas para luego poder usarlas.
Si desde donde "llamo" al metodo saludar tiene el codigo con public static void, el nuevo metodo que yo creo debe tener lo mismo. Como yo quiero que me ponga lo mismo menos el nombre
debe tener entonces la palabra String y luego nombre.
*/