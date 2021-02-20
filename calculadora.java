/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public interface calculadora 
{

    /**
    * Metodo para sumar dos numeros
    *
    * @return suma de los paramentos
    * @param x numero para sumar
    * @param y numero para sumar
    */
    public int suma(int x, int y);
    /**
    * Metodo para restar dos numeros
    *
    * @return resta de los paramentos
    * @param x numero que esta siendo restado
    * @param y numero que esta haciendo la resta
    */
    public int resta(int x, int y);
    /**
    * Metodo para multiplicacion dos numeros
    *
    * @return producto de los paramentos
    * @param x numero para multiplicar
    * @param y numero para multiplicar
    */
    public int multiplicacion(int x, int y);
    /**
    * Metodo para division dos numeros
    *
    * @return cociente de los paramentos
    * @param x numero para dividendo
    * @param y numero para divisor
    */
    public int division(int x, int y);

    /**
    * Metodo para analizar la numeros
    *
    * @return resultado de la operacion
    * @param el stack para realizar el trabajo
    */
    public int operar(String x, Stack_1<String> stackInt);//operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    
    /**
    * Metodo para restar dos numeros
    *
    * @return String donde muestra los numeros de entrada y la clase de operaciones
    * @param a nombre de archivo
    */
    public String decode(String a, Stack_1<String> b, Stack_1<String> c);//función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}