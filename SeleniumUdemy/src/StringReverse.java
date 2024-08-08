
public class StringReverse {

	public static void main(String[] args) {
		double[] numbers = { 2.5, 9.0, 17.2, 5.0, 3.14 };
		System.out.println("Elements in reverse order: ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);

			String str = "Dream big";
			// Stores the reverse of given string
			String reversedStr = "";

			// Iterate through the string from last and add each character to variable
			// reversedStr
			for (int i1 = str.length() - 1; i1 >= 0; i1--) {
				reversedStr = reversedStr + str.charAt(i1);
			}

			// System.out.println("Original string: " + string);
			// //Displays the reverse of given string
			System.out.println("Reverse of given string: " + reversedStr);

		}
	}
}
