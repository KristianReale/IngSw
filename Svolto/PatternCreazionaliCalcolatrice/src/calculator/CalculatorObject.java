package calculator;

import calculatorOperators.Operation;

public interface CalculatorObject {
	public Operation getSumOperation();
	public Operation getSubtractOperation();
	public Operation getMultiplicationOperation();
	public Operation getDivisionOperation();
	public Operation getPowerOperation();
	public Operation getSquareOperation();
	
}
