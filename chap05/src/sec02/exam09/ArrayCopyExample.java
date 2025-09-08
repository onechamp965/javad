package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrAraay = new String[5];
	
		System.arraycopy(oldStrArray, 0, newStrAraay, 0, oldStrArray.length);
		
		for ( int i  = 0; i < newStrAraay.length; i++ ) {
			System.out.println(newStrAraay[i] + ", ");
		}
	}
}
