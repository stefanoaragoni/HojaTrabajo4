/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

import java.util.*;

public interface List_1<E> {

	public boolean insert(E element);
	
	public boolean insertAt(E element, int index);
	
	public boolean insertAtStart(E element);
	
	public boolean insertAtEnd(E element);
	
	public E removeAt(int index);

  public E get();
	
	public E removeAtStart();
	
	public E removeAtEnd();
	
	public int count();
	
	public boolean empty();


}