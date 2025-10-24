
public class Calculadora {
    public void restar(int op1, int op2){
        int resultado= op1-op2;
        System.out.println("El resultado de la resta es = " +resultado);
    }

    public void sumar (int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es = " +resultado);

    }


    }
/* Dejo hasta aquí hecho por ahora. Lo que he ido haciendo es como funcionaria una calculadora, en este caso con
sumas, restas,etc. Faltarian multiplicaciones, divisiones y usar doubles y float.
Para ello lo que se hace es creo una clase desde mi carpeta src en donde tenga mi Main o mi clase principal.
Desde Main vamos a crear una nueva funcion, que la llamamos como la nueva clase creada, que en este caso es Calculadora.
a esa funcion la ponemos un nombre que es nuesta variable, la he llamado operacionesMatematicas.
Al ser una variable de tipo compleja ya que es un String (Calculadora) se escribe la primera en mayuscula,
el nombre de la variable seria la primera en minuscula y la segunda en mayuscula.
Luego se pone un = y la palabra new; la palabra new se trata de una palabra reservada de Java para crear objetos que en este caso
seria Calculadora()

Luego simplemente ejecuto la variable creada operacionesMatematicas poniendolo un punto y la funcion que quiero que haga:
operacionesMatematicas.sumar() y dentro del parentesis meto las variables que quiero dependiendo de si es int, double o float
*/

