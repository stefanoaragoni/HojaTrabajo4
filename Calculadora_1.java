/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Calculadora_1 implements calculadora
{

	//string que guarda el procedimiento realizado
	String register = "\nBienvenidx a la Calculadora Infix to Postfix\n";
	
	/**
    *Suma is responsible for adding two values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */

	//metodo que suma dos parametros y retorna el resultado
    public int suma(int x, int y){
    	int Result = x+y;
    	return Result;
    }

	/**
    *Resta is responsible for substracting two values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */

	//metodo que resta dos parametros y retorna el resultado
    public int resta(int x, int y){
    	int Result = x-y;
    	return Result;
	}
	
	/**
    *Multiplicacion is responsible for multiplying two values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */

	//metodo que multiplica dos parametros y retorna el resultado
    public int multiplicacion(int x, int y){
    	int Result = x*y;
    	return Result;
	}
	
	/**
    *Division is responsible for adding dividing values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */
	//metodo que divide dos parametros y retorna el resultado
    public int division(int x, int y){
        int Result = 0;

        try{
            Result = x/y;

        }catch(ArithmeticException e){
            register = register + ("\tError: no se puede dividir entre 0. Se asumirá que el resultado de la división será 0.\n");
            Result = 0;
        }

    	return Result;
    }

	/**
    *Operar is responsible for decoding a postfix string, splitting the string to analize each character, and later using another Stack in order to carry out the postfix operation.
    *@param Precondition The stack is not empty and it stores strings
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the postfix operation.
    *
    */
    //operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
   public int operar(String x, Stack_1<String> stackInt) {
		int operand1, operand2;

    int tempResult = 0;

		String[] operation = x.split(" ");

		for(int i = 0; i < operation.length; i++) {

			//de ser que sea un operador, se hace el calculo
      if( operation[i].equals("+") || operation[i].equals("-") || operation[i].equals("*") || operation[i].equals("/") ) {

        operand2 = Integer.parseInt(stackInt.pop());
        operand1 = Integer.parseInt(stackInt.pop());
  
        switch(operation[i]) {
          case "+": {
            int tempOperandResult = suma(operand1,operand2);
            stackInt.push(Integer.toString(tempOperandResult));
            register = register + (operation[i])+ "\tSumar: pop, pop y push del resultado\n";
            break;
          }

          case "-": {
            int tempOperandResult = resta(operand1,operand2);
            stackInt.push(Integer.toString(tempOperandResult));
            register = register + (operation[i])+ "\tRestar: pop, pop y push del resultado\n";
            break;
          }

          case "*": {
            int tempOperandResult = multiplicacion(operand1,operand2);
            stackInt.push(Integer.toString(tempOperandResult));
            register = register + (operation[i])+ "\tMultiplicar: pop, pop y push del resultado\n";
            break;
          }

          case "/": {
            int tempOperandResult = division(operand1,operand2);
            stackInt.push(Integer.toString(tempOperandResult));
            register = register + (operation[i])+ "\tDividir: pop, pop y push del resultado\n";
            break;
          }
        }
      } else {
          try{
            //de ser un numero, se guarda en un stack
            Integer tempNum = Integer.parseInt(operation[i]);

            stackInt.push(operation[i]);

            register = register + (operation[i])+ "\tpush operando\n";
          }catch(Exception e){
              register = register + (operation[i])+ "\tEste no es un simbolo valido\n";
          }
      }
    }

      int finalResult = 0;

      if(stackInt.size() == 1){
        finalResult = Integer.parseInt(stackInt.pop());
      }else{
          register = register + "\n\tTodavía hay números sin operar. Hacen falta operadores\n";
          register = register + "\tSe retornará el último numero en la cola como el resultado final\n";

          finalResult = Integer.parseInt(stackInt.pop());

          while(!stackInt.empty()){
              stackInt.pop();
          }
      }

    return finalResult;
    }

	/**
    *decode is responsible for opening and reading a .txt file. It goes on to store each line in the document into a unique String stack; each line is a push. 
    *@param Precondition The .txt has text; the text represents a postfix operation
    *@param Postcondition Returns a string with the procedure
    *@return String with the procedure of the operations done and the result.
    *
    */
    //función que se encarga de leer operation archivo y decodificar cada línea para realizar las operaciones de cada una
    public String decode(String a, Stack_1<String> b, Stack_1<String> c) {

      Stack_1<String> stackCodificado = b;
	
    	Stack_1<String> stackInt = c;

    	File file = new File(a);
    	Scanner scan = null;
    	
    	try {
			  scan = new Scanner(file);
		  } catch (FileNotFoundException e) {

		  }
    	
    	while(scan.hasNextLine()){
        String tempInfix = scan.nextLine();
        String tempPostfix = intopost(tempInfix, stackInt);
			  stackCodificado.push(tempPostfix);
		  }
		

    	//realiza todas las operaciones dentro del .txt. Almacena los resultados y el procedimiento en una variable

    	while(stackCodificado.empty() == false){
    		String temp = stackCodificado.pop();
    		register = register + "\nExpresión: "+temp+"\n\nEntrada\tOperacion\n";
        
        int tempResult = operar(temp, stackInt);

        String tempResult2 = String.valueOf(tempResult);

        register = register + "\nResultado Final: "+tempResult2+"\n--------------------\n";

    	}	
    	
    	//retorna el procedimiento completo
    	return register;
    }
    
   
   private int prec(String c){
        if(c.equals("+") || c.equals("-")){
          return 1;
        }else if(c.equals("/") || c.equals("*")){
          return 2;
        }
      return -1;
    }

    private String intopost(String expression, Stack_1<String> b){

        String result = "";
        Stack_1<String> StackItP = b;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            String s = String.valueOf(c);

            //check if char is operator
            if(prec(s)>0){
                while(StackItP.empty()==false && prec(StackItP.peek())>=prec(s)){
                    result += " ";
                    result += StackItP.pop();
                    result += " ";
                }
                StackItP.push(s);
            }else if(s.equals(")")){
                String x = StackItP.pop();
                while(!x.equals("(")){
                    result += x;
                    result += " ";
                    x = StackItP.pop();
                }
            }else if(s.equals("(")){
                StackItP.push(s);
            }else{
                //character is neither operator nor (
                result += s;
                result += " ";
            }
        }
        for (int i = 0; i < StackItP.size() ; i++) {
          result += StackItP.pop();
          result += " ";
        }
        return result;
    }

   
}