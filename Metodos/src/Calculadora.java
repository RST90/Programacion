import java.sql.SQLOutput;

public class Calculadora {
    public void restar(int op1, int op2){
        int resultado= op1-op2;
        System.out.println("El resultado de la resta es = " +resultado);
    }

    public void sumar (int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es = " +resultado);

        int operandoUno = 50;
        int operandoDos = 10;
        int resultados = operandoUno/operandoDos;
        double division = operandoUno/operandoDos;
        System.out.println("El resultado de la division es = " +resultados);

    }
    public void multi (int op1, int op2) {
        int resultado = op1 * op2;
        System.out.println("El resultado de la multiplicacion es = " + resultado);

    }
    public void multip (){
        int valorUno = 4;
        int valorDos = 5;
        int resultado = valorUno*valorDos;
        System.out.println("El resultado de la nueva multiplicacion es = " +resultado);
    }
    public void operadoresLogicos (){
        int sueldo = 20000;
        int edad = 45;
        boolean conducir = false;
        boolean candidatoValido = sueldo<30000 && edad<40 && conducir;
        System.out.println("El candidato es valido = " +candidatoValido);
    }
    public void operadorLogico (){
        int sueldo = 25000;
        int edad = 20;
        boolean estudiosUniversitarios = true;
        boolean candidatoAceptado = sueldo >26000 || edad <30 || estudiosUniversitarios;
        System.out.println("El candidato es aceptable para el puesto = " +candidatoAceptado);
    }

    public void evaluarCandidato (double salario, int edad, boolean cochePropio){
        boolean resultado = salario<20000 && edad<35 && cochePropio;
        System.out.println("La evaluacion del candidato es = " +resultado);

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

También se puede hacer desde esta clase por ejemplo con la division. he creado unas variables nuevas tanto a valores de operandoUno y operandoDos
como a la funcion dividir y luego he puesto resultados en plural porque en singular ya lo tengo definido dentro de la misma clase.

con la multiplicacion he querido comprobar si se podía hacer de las dos formas, declarando las variables en el metodo main y a su vez haciendolo en esta clase
Para ello hay que generar dos variables distintas, no puede tener el mismo nombre, a una la llamo multi y la otra multip.
En multi lo que hago es asignarle los valores en Main poniendo operacionesMatematicas.multi (valor1 y valor2), pero en multip se los asigno desde esta clase y
por lo que al crear la nueva clase void no pongo nada entre parentesis como sí lo hago cuando le doy el valor en Main que sería:
public void multi(op1*op2); aquí sería public void multip(){ y debajo es cuando pongo los valores de las variables y la operación y lo que quiero que me saque por consola
Luego me voy a Main y añadiria operacionesMatematicas.multip();

En operadoresLogicos estamos haciendo comparaciones a traves de si algo nos es valido o no, por ejemplo en este caso estamos usando el comparador && que sería un "and"
y en este caso en cuanto una de las variables es false, el resultado va a ser false, para que el resultado fuese true tendrían que ser todas true.
En el siguiente caso que uso otra funcion que es operadorLogico estoy usando el or que sería con || y en este caso con que haya un true siempre va a ser true,
solo podría ser false en el caso de que todas las variables sean falsas.

Otra manera sería con el Scanner, lo dejo detallado también en Main porque es donde se escriben las funciones. aquí voy a crear otra función que haré referencia en Main
creo la funcion public void evaluarCandidato y le digo el tipo de variables que voy a usar (double para salario, int para edad y boolean para un true o false para el tema carnet)
Como el resultado que obtendré será un true or false para evaluar si el candidato es valido o no voy a usar un boolean:
boolean resultado = salario<20000 && edad<35 && cochePropio. Y luego pido el resultado por consola.
Al usar && en cuanto uno de los valores sea false me va a dar false.


*/


