import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException{
  Calculadora_1 calcu = new Calculadora_1();
  Scanner scan = new Scanner();

  System.out.println("--Calculadora Infix--\nCon que tipo de estructura de datos quiere llevar a cabo la siguiente operacion?\n[1] ArrayList\n[2] Vector\n[3] List");

  int option1 = scanner.nextInt(); 
  Stack_1<String> stackTemp = DesignFactory(option1);


  System.out.println(calcu.decode("datos.txt"));



  }
}