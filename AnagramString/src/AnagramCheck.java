import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		} else {
			System.out.println("Not Anagram");
		}

	}

}
