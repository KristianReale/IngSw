package calculatorOperators;

public abstract class Operation<T> {
	private T firstOperand;
	private T secondOperand;
	
	public T getFirstOperand() {
		return firstOperand;
	}
	public void setFirstOperand(T firstOperand) {
		this.firstOperand = firstOperand;
	}
	
	public T getSecondOperand() {
		return secondOperand;
	}
	public void setSecondOperand(T secondOperand) {
		this.secondOperand = secondOperand;
	}
	
	public abstract T executeOperation();
}
