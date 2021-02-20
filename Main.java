/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException{
  Calculadora_1 calcu = new Calculadora_1();
  Scanner scan = new Scanner(System.in);

  System.out.println("--Calculadora Infix--\n");
  
  System.out.println("Que tipo de estrucutura de datos quiere utilizar para almacenar el archivo inicial?\n[1] ArrayList\n[2] Vector\n[3] List");
  DesignFactory Factory = new DesignFactory();

  int option1 = scan.nextInt(); 

  Stack_1<String> stackTemp = Factory.typeStack(option1);

  System.out.println("\nQue tipo de estrucutura de datos quiere utilizar para almacenar los numeros y resultados de las operaciones?\n[1] ArrayList\n[2] Vector\n[3] List");
  DesignFactory Factory2 = new DesignFactory();
  
  int option2 = scan.nextInt(); 

  Stack_1<String> stackTemp2 = Factory2.typeStack(option2);


  System.out.println(calcu.decode("datos.txt", stackTemp, stackTemp2));



  }
}