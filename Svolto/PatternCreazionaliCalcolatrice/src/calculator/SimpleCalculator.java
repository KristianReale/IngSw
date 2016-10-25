package calculator;

public class SimpleCalculator extends Calculator {

	@Override
	public CalculatorObject getCalculatorObject() {
		return new SimpleCalculatorObject();
	}

}
