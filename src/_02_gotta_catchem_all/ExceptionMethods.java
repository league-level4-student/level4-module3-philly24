package _02_gotta_catchem_all;

public class ExceptionMethods {
	// 2. In the ExceptionMethods class, write a method called divide that takes
	// two doubles as parameters and returns their quotient as a double. This method
	// should throw an IllegalArgumentException if the denominator is 0.0.

	double divide(double d1, double d2) {
		double quotient;
		
		if (d2 == 0.0) {
			throw new IllegalArgumentException();
		}
		else {
			quotient = d1 / d2;
			System.out.println(quotient);

		}
		return quotient;
	}

	//4. In the ExceptionMethods class, write a method called reverseString that takes a
		//   String and returns the reverse of that String. It should throw an IllegalStateException
		//   if the String passed in is empty
		
		//5. Complete the JUnit test method to test the reverseStringMethod.
	String reverseString(String string) {
		String s = "";
		
		for (int i = string.length() - 1; i >= 0 ; i--) {
			s += string.charAt(i);
		}
		if (s.equals("")) {
			throw new IllegalStateException();
		}
		return s;
	}

}
