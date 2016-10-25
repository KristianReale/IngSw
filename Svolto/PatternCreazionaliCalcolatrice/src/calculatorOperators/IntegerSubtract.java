package calculatorOperators;

public class IntegerSubtract extends Operation<Integer>{
	public IntegerSubtract() {
		super();
	}

	@Override
	public Integer executeOperation() {
		return getFirstOperand() - getSecondOperand();
	}
}
