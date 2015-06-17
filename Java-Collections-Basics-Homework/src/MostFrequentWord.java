import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class MostFrequentWord {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] text = input.split("\\W+");
		List<String> intext = new ArrayList<String>();
		for (int i = 0; i < text.length; i++) {
			String vNew = text[i].toLowerCase();
			intext.add(vNew);
		}
		int count = 1;
		int temp = 0;
		Set<String> result = new TreeSet<String>();
		for (int i = 0; i < intext.size() - 1; i++) {
			count = 1;
			for (int j = i + 1; j < text.length; j++) {
				if (intext.get(i).equals(intext.get(j))) {
					intext.set(j, Integer.toString(j));
					count++;
					if (count > temp) {
						temp = count;
						result.clear();
						result.add(intext.get(i));
					}
					else if (count == temp) {
						result.add(intext.get(i));
					}
				}
				else {
					if (count > temp) {
					count = 1;
					result.add(intext.get(i));
					}
				}
			}
		}
		if (count > temp) {
			result.add(intext.get(intext.size()- 1));
			for (String string : result) {		
				System.out.println(string + " -> " + count + " times");
			}
		}
		else {
			for (String string2 : result) {
				System.out.println(string2 + " -> " + temp + " times");
			}												
		}		
	}
}
