package varshini;

import java.util.Arrays;

public class PassinginFunction {

	public static void main(String[] args) {
		int[]num= {6,8,18,5,9};
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.println(Arrays.toString(num));
	


	}
	static void change(int[] arr) {
		arr[0]=99;
	}

}
