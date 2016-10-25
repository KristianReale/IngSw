package builder;

import calculatorOperators.Operation;

public class NormalBuilder implements OutputBuilder{
	@Override
	public String buildFirstOperand(Object value) {
		return value.toString();
	}

	@Override
	public String buildSecondOperand(Object value) {
		return value.toString();
	}

	@Override
	public String buildOperation(Object operation) {
		return operation.toString();
	}
	
	@Override
	public String buildEquals() {
		return "=";
	}
	
	@Override
	public String buildResult(Object value) {
		return value.toString();
	}

}
