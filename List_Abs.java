/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public abstract class List_Abs<E> implements List_1<E>{

  public List_Abs(){

  }

  public boolean empty(){
    return count() == 0;
  }

}