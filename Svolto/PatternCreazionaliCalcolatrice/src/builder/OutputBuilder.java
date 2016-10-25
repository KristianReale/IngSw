package builder;

import calculatorOperators.Operation;

public interface OutputBuilder {
	public String buildFirstOperand(Object value);
	public String buildSecondOperand(Object value);
	public String buildOperation(Object operation);
	public String buildEquals();
	public String buildResult(Object value);
	
}
