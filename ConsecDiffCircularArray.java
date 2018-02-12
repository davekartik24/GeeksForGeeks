import java.util.*;

public class ConsecDiffCircularArray {

	public static void main(String[] args) {

		int[] array = { 10, 12, 15};

		int sum = 0;
		int length = array.length;

		Arrays.sort(array);

		for(int i = 0; i < length/2; i++) {

			sum += (array[length - 1 - i] - array[i]);
		}

		System.out.println(sum * 2);
	}
}