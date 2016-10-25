package builder;

import calculatorOperators.Operation;

public class OutputDirector {
	OutputBuilder builder;
	Object firstOperand;
	Object secondOperand;
	Object operation;
	Object result;
	
	public OutputDirector(OutputBuilder builder, Object firstOperand, Object secondOperand, Object operation, Object result) {
		this.builder = builder;
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		this.operation = operation;
		this.result = result;
	}
	
	public String constructOutput(){
		return builder.buildFirstOperand(firstOperand) + " " 
						+ builder.buildOperation(operation) + " " 
						+ builder.buildSecondOperand(secondOperand) + " "
						+ builder.buildEquals() + " "
						+ builder.buildResult(result) + " ";
	}
}
