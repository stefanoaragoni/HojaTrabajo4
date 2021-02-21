/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public abstract class Stack_Abs<E> implements Stack_1<E>
{
   /**
    * Metodo para ver si hay algo en el stack
    * @return boolean si esta vacio o no
    */
    public boolean empty(){
      // post: returns true if empty
      return size() == 0;
   }
}
