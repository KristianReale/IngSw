package calculatorOperators;

public class BinarySum extends Operation<String> {

	@Override
	public String executeOperation() {
        int left = Integer.parseInt(getFirstOperand(), 2);
        int right = Integer.parseInt(getSecondOperand(), 2);
        int sum = left + right;
        return Integer.toBinaryString(sum);
	}

}
