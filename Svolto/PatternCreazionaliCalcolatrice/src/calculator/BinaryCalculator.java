package calculator;

public class BinaryCalculator extends Calculator{

	@Override
	public CalculatorObject getCalculatorObject() {
		return new BinaryCalculatorObject();
	}
}
