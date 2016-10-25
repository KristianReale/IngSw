package calculatorOperators;

public class IntegerSum extends Operation<Integer>{
	
	public IntegerSum() {
		super();
	}

	@Override
	public Integer executeOperation() {
		return getFirstOperand() + getSecondOperand();
	}
}
