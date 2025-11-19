package exam1117;

public class ParamExanple {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		printInfo(array);
		System.out.println("in main " + array);
	}
	
	public static void printInfo(int[] value) {
		System.out.println(value[2]);
		value[2] += 10;
		System.out.println(value[2]);
	}

}
