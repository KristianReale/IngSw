package builder;

import calculatorOperators.Operation;

public class MarkedBuilder implements OutputBuilder{
	@Override
	public String buildFirstOperand(Object value) {
		return "<FirstOperand>" + value.toString() + "</FirstOperand>";
	}

	@Override
	public String buildSecondOperand(Object value) {
		return "<SecondOperand>" + value.toString() + "</SecondOperand>";
	}

	@Override
	public String buildOperation(Object operation) {
		return "<Operation>" + operation.toString() + "</Operation>";
	}
	
	@Override
	public String buildEquals() {
		return "<isEqualsTo/>";
	}
	
	@Override
	public String buildResult(Object value) {
		return "<Result>" + value.toString() + "</Result>";
	}

}
