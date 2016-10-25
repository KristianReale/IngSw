package calculator;

import calculatorOperators.BinarySum;
import calculatorOperators.Operation;

public class BinaryCalculatorObject implements CalculatorObject{

	@Override
	public Operation getSumOperation() {
		return new BinarySum();
	}

	@Override
	public Operation getSubtractOperation() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Operation getSquareOperation() {
		// TODO Auto-generated method stub
		return null;
	}

}
