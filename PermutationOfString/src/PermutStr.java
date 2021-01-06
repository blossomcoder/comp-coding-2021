import java.util.ArrayList;
import java.util.List;

public class PermutStr {

	static List<String> results = new ArrayList<String>();
	
	public static void permute(char[] ch, int l, int r) {
		if (l == r) {
			results.add(String.valueOf(ch));
		} else {
			for (int i=l; i<=r; i++) {
				char temp = ch[i];
				ch[i] = ch[l];
				ch[l] = temp;
				permute(ch, l+1, r);
				temp = ch[i];
				ch[i] = ch[l];
				ch[l] = temp;
			}
		}
	}
	public static void main(String[] args) {
		String s = "ABCD";
		char[] ch = s.toCharArray();
		permute(ch, 0, s.length()-1);
		System.out.println(results);
		
		

	}

}
