package datastructure.string.palindromecheck;

public class PalindromeCheckForAString {

	public static void main(String[] args) {

		System.out.println("the given string is palindrome" + " " + efficientSolution("abcdcba"));

	}

	private static boolean naiveSolution(String string) {
		String reversed = reverse(string);
		System.out.println("the reverse is" + " " + reversed);
		return string.equals(reversed);

	}

	private static String reverse(String s1) {

		String reversedString = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			reversedString = reversedString + s1.charAt(i);
		}
		return reversedString;
	}

	private static boolean efficientSolution(String string) {

		int start = 0;
		int end = string.length() - 1;
		while (start <= end) {
			if (string.charAt(start) != string.charAt(end)) {
				return false;
			}
		}
		return true;
	}
}
