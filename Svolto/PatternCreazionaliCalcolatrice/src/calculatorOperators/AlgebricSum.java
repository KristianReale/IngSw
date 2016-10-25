package calculatorOperators;

public class AlgebricSum extends Operation<String>{

	@Override
	public String executeOperation() {
		return getFirstOperand() + " + " + getSecondOperand();
	}
}
