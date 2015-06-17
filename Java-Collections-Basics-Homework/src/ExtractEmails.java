import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Pattern p = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(input);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
