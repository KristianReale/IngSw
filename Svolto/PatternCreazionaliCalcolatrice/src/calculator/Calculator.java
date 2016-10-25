package calculator;

import calculatorOperators.Operation;

public abstract class Calculator {
	/**
	 * FACTORY METHOD
	 */
	protected abstract CalculatorObject getCalculatorObject();
	
	public Object doSum(Object firstOperand, Object secondOperand){
		Operation sum = getCalculatorObject().getSumOperation();
		sum.setFirstOperand(firstOperand);
		sum.setSecondOperand(secondOperand);
		return sum.executeOperation();
	}
	
	public Object doSubtract(Object firstOperand, Object secondOperand){
		Operation sub = getCalculatorObject().getSubtractOperation();
		sub.setFirstOperand(firstOperand);
		sub.setSecondOperand(secondOperand);
		return sub.executeOperation();
	}
	
	public Object doMultiplication(Object firstOperand, Object secondOperand){
		Operation mult = getCalculatorObject().getMultiplicationOperation();
		mult.setFirstOperand(firstOperand);
		mult.setSecondOperand(secondOperand);
		return mult.executeOperation();
	}
	
	public Object doDivision(Object firstOperand, Object secondOperand){
		Operation div = getCalculatorObject().getDivisionOperation();
		div.setFirstOperand(firstOperand);
		div.setSecondOperand(secondOperand);
		return div.executeOperation();
	}
	
	public Integer doPower(Integer firstOperand, Integer secondOperand){
		Operation div = getCalculatorObject().getPowerOperation();
		div.setFirstOperand(firstOperand);
		div.setSecondOperand(secondOperand);
		return (Integer) div.executeOperation();
	}
	
	public Integer doSquare(Integer value){
		Operation div = getCalculatorObject().getSquareOperation();
		div.setFirstOperand(value);
		return (Integer) div.executeOperation();
	}
}
