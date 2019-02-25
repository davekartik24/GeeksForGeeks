
import java.util.*;

public class SubstringWithKDistinctChar{


	public int substringWithKDistinctChar(String inputString, int k) {

		int i = 0;
		int j = 0;

		int n = inputString.length();

		int result = 0;

		HashSet<Character> lookup = new HashSet<>();

		while(i <= (n - k)) {
			
			if(lookup.size() < k) {
				lookup.add(inputString.charAt(j++));
			} else if(j < n && lookup.size() == k) {
				result++;
				lookup.add(inputString.charAt(j++));
			} else {
				if(lookup.size() == k) {
					result++;
				}
				lookup.clear();

				j = ++i;
			}
		}

		return result;

	}

	public static void main(String[] args) {

		SubstringWithKDistinctChar testObject = new SubstringWithKDistinctChar();

		System.out.println(testObject.substringWithKDistinctChar("aa", 1));

	}
}