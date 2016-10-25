package calculatorOperators;

public class IntegerSquare extends IntegerPower{
	private static IntegerSquare instance = null;
	
	public static IntegerSquare getInstance(){
		if (instance == null){
			instance = new IntegerSquare();
		}
		return instance;
	}
	
	private IntegerSquare() {
		setSecondOperand(2);
	}
	
	@Override
	public IntegerSquare clone() {
		return (IntegerSquare)super.clone();
	}
}
