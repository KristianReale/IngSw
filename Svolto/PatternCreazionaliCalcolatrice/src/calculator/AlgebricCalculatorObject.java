package calculator;

import calculatorOperators.AlgebricSum;
import calculatorOperators.Operation;

public class AlgebricCalculatorObject implements CalculatorObject{

	@Override
	public Operation getSumOperation() {
		return new AlgebricSum();
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
