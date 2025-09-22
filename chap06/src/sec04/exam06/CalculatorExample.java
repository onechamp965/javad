package sec04.exam06;

import sec04.exam01.Calculator;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		double result1 = myCalcu.areaRectangle(10, 0);
		double result2 = myCalcu.areaRectangle(10, 10);
		
		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이: " + result2);
	}

}
