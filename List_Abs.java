public abstract class List_Abs<E> implements List_1<E>{

  public List_Abs(){

  }

  public boolean IsEmpty(){
    return size() = 0;
  }

  public boolean contains(E value){
    return -1 !=indexOf(value);
  }
}