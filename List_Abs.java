/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public abstract class List_Abs<E> implements List_1<E>{

  /**
    * Metodo constructor de List_Abs
    */
  public List_Abs(){

  }

  /**
    * Metodo para ver si hay algo en el stack
    * @return boolean si esta vacio o no
    */
  public boolean empty(){
    return count() == 0;
  }

}