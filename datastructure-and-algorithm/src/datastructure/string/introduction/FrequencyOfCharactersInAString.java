package datastructure.string.introduction;

public class FrequencyOfCharactersInAString {

	public static void main(String args[]) {
		printFrequencies("geeksforgeeks");
	}

	private static void printFrequencies(String s) {

		final int MAX_CHAR = 26;
		int count[] = new int[MAX_CHAR];

		for (int i = 0; i < s.length(); i++) {

			count[s.charAt(i) - 'a']++;

		}

		for (int i = 0; i < MAX_CHAR; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + "  " + count[i]);

			}
		}
	}

}
