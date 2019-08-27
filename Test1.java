package sts;

public class Test1 {

	public static boolean isValid(final String text) {
		return (text + ".").matches("((([1]\\d\\d)|(2[0-4]\\d)|(25[0-5])|(\\d{1,2}))\\.){4}");
	}

	public static void main(final String[] args) {

		/*
		 * Examine the function 'isValid'. What does it validate?
		 * Validates that the input passed to the function matches a regular expression (similar to an ip)
		 * For which cases the validation fails?
		 * If the text provided do not repeat 4 times a combination of : 
		 * 1. A string starting with 1 and followd by 2 digits followed ending with a dot
		 * OR
		 * 2. A string starting with 2 followed by a digit between 0 to 4 followed by a digit ending with a dot
		 * OR
		 * 3. A string starting with 25 followed by a digit between 0 to 5 ending with a dot 
		 * OR
		 * 4. A string with 1 or 2 digits followed by a dot
		 * last repetition should not include a dot since it passed inside the method
		 * Valid examples: "172.245.255.22","199.245.25.22","25.25.25.25"
		 * Not valid examples: "172.245.255.22.","172.245.255.22.172.","972.245.255.22"
		 */
		
		String input = args[0];
		String result = Test1.isValid(input) ? "valid" : "not valid";
		System.out.println("Input " + input + " is " + result);
	}

}
