import javax.swing.JOptionPane;

/**
 * @author Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = new String("DEF");
		String s3 = "AB" + "C";

//		 a. s1.compareTo(s2);
		JOptionPane.showMessageDialog(null, "a. s1.compareTo(s2); => " + s1.compareTo(s2)); // Lexicographically, s1
																							// comes before s2, which
																							// results in a negative
																							// integer.

//		 b. s2.equals(s3);
		JOptionPane.showMessageDialog(null, "b. s2.equals(s3); => " + s2.equals(s3)); // Strings s2 and s3 are different
																						// so the result is false

//		 c. s3 == s1;
		if (s3 == s1) {
			JOptionPane.showMessageDialog(null, "c. s3 == s1; => " + true); // The strings s1 and s3 are equal so the
																			// result is true
		} else {
			JOptionPane.showMessageDialog(null, "c. s3 == s1; => " + false); // The strings s1 and s3 are equal so the
																				// result is true
		}

//		 d. s2.compareTo(s3);
		JOptionPane.showMessageDialog(null, "d. s2.compareTo(s3); => " + s2.compareTo(s3)); // Lexicographically, s3
																							// comes before s2, which
																							// results in a positive
																							// integer.

//		 e. s3.equals(s1);
		JOptionPane.showMessageDialog(null, "e. s3.equals(s1); => " + s3.equals(s1)); // Strings s3 and s1 are equal so
																						// the result is true
	}
}
