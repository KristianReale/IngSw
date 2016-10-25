package calculator;

public class AlgebricCalculator extends Calculator{

	@Override
	public CalculatorObject getCalculatorObject() {
		return new AlgebricCalculatorObject();
	}
}
