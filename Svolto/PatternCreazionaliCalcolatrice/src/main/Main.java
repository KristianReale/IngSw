package main;

import builder.MarkedBuilder;
import builder.NormalBuilder;
import builder.OutputDirector;
import calculator.AlgebricCalculator;
import calculator.BinaryCalculator;
import calculator.Calculator;
import calculator.SimpleCalculator;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new SimpleCalculator();
		System.out.println("SUM: " + calc.doSum(5, 7));
		System.out.println("SUB: " + calc.doSubtract(10, 7));
		System.out.println("POWER: " + calc.doPower(3, 3));
		System.out.println("SQUARE: " + calc.doSquare(5));
		
		System.out.println("---- USING BUILDER ---");
		OutputDirector output = new OutputDirector(new NormalBuilder(), 5, 7, "+", calc.doSum(5, 7));
		System.out.println(output.constructOutput());
		
		output = new OutputDirector(new MarkedBuilder(), 3, 2, "EVAL", calc.doPower(3, 2));
		System.out.println(output.constructOutput());
		
		calc = new AlgebricCalculator();
		System.out.println("ALGEBRIC SUM: " + calc.doSum("(a - b)", "(b + c)"));
		
		calc = new BinaryCalculator();
		System.out.println("BINARY SUM: " + calc.doSum("01", "11"));
		
		
		
	}
}
