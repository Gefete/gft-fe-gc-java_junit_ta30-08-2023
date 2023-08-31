package Gerard_Fernandez_fe_gc_c5_ta30_calculadora;

import java.util.*;

//Calculadora Estandard
public class Calculadora {
	 public String calcular(String expr) {
	        List<String> conjuntos = tokenize(expr);
	        List<Double> num = new ArrayList<>();
	        List<String> operador = new ArrayList<>();

	        for (String token : conjuntos) {
	            if (isNumeric(token)) {
	                num.add(Double.parseDouble(token));
	            } else if (token.equals("+") || token.equals("-")) {
	                processOperators(num, operador, token);
	                operador.add(token);
	            } else if (token.equals("*") || token.equals("/")) {
	                processHighPriorityOperators(num, operador, token);
	                operador.add(token);
	            }
	        }

	        processOperators(num, operador, "");

	        return String.valueOf(num.get(0)) ;
	    }

	    private List<String> tokenize(String expr) {
	        return Arrays.asList(expr.trim().split("\\s+"));
	    }

	    private boolean isNumeric(String str) {
	        return str.matches("-?\\d+(\\.\\d+)?");
	    }

	    private void processOperators(List<Double> operands, List<String> operators, String stopOperator) {
	        while (!operators.isEmpty() && !operators.get(operators.size() - 1).equals(stopOperator)) {
	            String operator = operators.remove(operators.size() - 1);
	            double operand2 = operands.remove(operands.size() - 1);
	            double operand1 = operands.remove(operands.size() - 1);
	            double result = applyOperator(operand1, operand2, operator);
	            operands.add(result);
	        }
	    }

	    private void processHighPriorityOperators(List<Double> operands, List<String> operators, String currentOperator) {
	        while (!operators.isEmpty() && (operators.get(operators.size() - 1).equals("*") || operators.get(operators.size() - 1).equals("/"))) {
	            String operator = operators.remove(operators.size() - 1);
	            double operand2 = operands.remove(operands.size() - 1);
	            double operand1 = operands.remove(operands.size() - 1);
	            double result = applyOperator(operand1, operand2, operator);
	            operands.add(result);
	        }
	    }

	    private double applyOperator(double operand1, double operand2, String operator) {
	        switch (operator) {
	            case "+":
	                return operand1 + operand2;
	            case "-":
	                return operand1 - operand2;
	            case "*":
	                return operand1 * operand2;
	            case "/":
	                if (operand2 != 0) {
	                    return operand1 / operand2;
	                } else {
	                    throw new ArithmeticException("Division by zero");
	                }
	            default:
	                throw new IllegalArgumentException("Invalid operator: " + operator);
	        }
	    }
	    
	    public String potenciaCubo(String expresion) {
	    	try {
	    		return String.valueOf(Math.pow(Double.valueOf(expresion),2));
			} catch (Exception e) {
				return "Error";
			}
	    	
	    }
	}
