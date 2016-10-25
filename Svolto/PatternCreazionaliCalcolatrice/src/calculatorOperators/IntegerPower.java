package calculatorOperators;

public class IntegerPower extends Operation<Integer> implements Cloneable{
	@Override
	public Integer executeOperation() {
		Double result = Math.pow(getFirstOperand(), getSecondOperand());
		return result.intValue();
	}
	
	@Override
	public IntegerPower clone(){
		try {
			return (IntegerPower) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
