package calculator;

import calculatorOperators.IntegerSubtract;
import calculatorOperators.IntegerSum;
import calculatorOperators.Operation;
import calculatorOperators.IntegerPower;
import calculatorOperators.IntegerSquare;

public class SimpleCalculatorObject implements CalculatorObject{
	@Override
	public Operation getSumOperation() {
		return new IntegerSum();
	}

	@Override
	public Operation getSubtractOperation() {
		return new IntegerSubtract();
	}

	@Override
	public Operation getMultiplicationOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getDivisionOperation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Operation getPowerOperation() {
		return new IntegerPower();
	}
	
	@Override
	public Operation getSquareOperation() {
		IntegerSquare newInstanceSquare = IntegerSquare.getInstance().clone();
		return newInstanceSquare;
	}
}
