package Gerard_Fernandez_fe_gc_c5_ta30_calculadora;

import java.util.*;

//Calculadora Estandard
public class Calculadora {
	//Faltan 3 operaciones
	//
	public String calcular(String expresion) {
			//Lista para procesar, guarda todo lo de la expresion String separado
	        List<String> conjuntos = separarValores(expresion);
	        //Lista numeros
	        List<Double> numList = new ArrayList<>();
	        //Lista operadores
	        List<String> operadorList = new ArrayList<>();

	        for (String valor : conjuntos) {
	        	//Registra los numeros
	        	if (esNumero(valor)) {
	                numList.add(Double.parseDouble(valor));
	            //Registra los operadores normales
	            } else if (valor.equals("+") || valor.equals("-")) {
	                procesarOperadorNormal(numList, operadorList, valor);
	                operadorList.add(valor);
	            //Registra los operadores de mas prioridad
	            } else if (valor.equals("*") || valor.equals("/")) {
	                procesarOperadorPrioridad(numList, operadorList);
	                operadorList.add(valor);
	            }
	        }

	        procesarOperadorNormal(numList, operadorList, "");

	        return String.valueOf(numList.get(0)) ;
	    }

	    private List<String> separarValores(String expresion) {
	    	//Devuelde un array que lo convierte en lista (asList)
	    	//Coge la expresion la separa por espacios y los espacios los elimina con trim()
	        return Arrays.asList(expresion.trim().split("\\s+"));
	    }

	    private boolean esNumero(String cadenaReq) {
	    	/**
	    	 * 	REQUISITOS PARA QUE SEA CONSIDERADO UN NUMERO
	    	 * 	-?: puede ser negativo.
	    	 *	\\d+: Uno o más dígitos (0-9).
	    	 *	(\\.\\d+)?: puede llevar punto seguido de uno o más dígitos.
	    	 * */
	        return cadenaReq.matches("-?\\d+(\\.\\d+)?");
	    }

	  //Metodo para procesar calculos de prioridad normal (en orden)
	    private void procesarOperadorNormal(List<Double> numList, List<String> operadorList, String paradaOperador) {
	    	//Si la lista de operadores esta vacia y si la lista de operadores en la ultima posicion es igual a "" (nada)
	        while (!operadorList.isEmpty() && !operadorList.get(operadorList.size() - 1).equals(paradaOperador)) {
	        	//Borra el ultimo operador y lo coloca en la variable
	            String operador = operadorList.remove(operadorList.size() - 1);
	            //Borra el ultimo numero y lo coloca en la variable
	            double num2 = numList.remove(numList.size() - 1);
	            //Con el anterior numero borrado al coger el ultimo de nuevo estaria cogiendo el siguiente numero
	            double num1 = numList.remove(numList.size() - 1);
	            //aplica la operacion
	            double result = aplicarOperacion(num1, num2, operador);
	            
	            numList.add(result);
	        }
	    }

	    //Metodo para procesar calculos de prioridad como multiplicaciones y divisiones
	    private void procesarOperadorPrioridad(List<Double> numList, List<String> operadorList) {
	    	//Si la lista de operadores esta vacia y si el ultimo operador es multiplicacion o division (calculos con prioridad)
	        while (!operadorList.isEmpty() && (operadorList.get(operadorList.size() - 1).equals("*") || operadorList.get(operadorList.size() - 1).equals("/"))) {
	        	//Borra el ultimo operador y lo coloca en la variable
	            String operador = operadorList.remove(operadorList.size() - 1);
	            //Borra el ultimo numero y lo coloca en la variable
	            double num2 = numList.remove(numList.size() - 1);
	            //Con el anterior numero borrado al coger el ultimo de nuevo estaria cogiendo el siguiente numero
	            double num1 = numList.remove(numList.size() - 1);
	            //aplica la operacion y lo guarda en variable
	            double result = aplicarOperacion(num1, num2, operador);
	            //Añade el resultado en la ultima operacion
	            numList.add(result);
	        }
	    }

	    //Metodo para realizar operaciones
	    public double aplicarOperacion(double num1, double num2, String operador) {
	        switch (operador) {
	            case "+":
	                return num1 + num2;
	            case "-":
	                return num1 - num2;
	            case "*":
	                return num1 * num2;
	            case "/":
	                if (num2 != 0) {
	                    return num1 / num2;
	                } else {
	                    throw new ArithmeticException("Division by zero");
	                }
	            default:
	                throw new IllegalArgumentException("Invalid operator: " + operador);
	        }
	    }
	    
	    //Realiza la potencia al cubo (X^2)
	    public String potenciaCubo(String expresion) {
	    	try {
	    		return String.valueOf(Math.pow(Double.valueOf(expresion),2));
			} catch (Exception e) {
				return "Error";
			}
	    	
	    }
	}
