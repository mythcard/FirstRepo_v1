import java.util.Arrays;

public class anagram1 {
	public String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		s = sort(s);
		t = sort(t);
		return s.equalsIgnoreCase(t);
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		String s = "God";
		String t = "dog";
		boolean result;
		anagram1 a = new anagram1();
		result = a.permutation(s, t);
		if (result == true) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}

}
