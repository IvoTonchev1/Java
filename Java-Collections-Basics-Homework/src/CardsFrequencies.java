import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class CardsFrequencies {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] faces = scan.nextLine().split("[\\W ]+");
		
		Map<String, Integer> facesFreqencies = new LinkedHashMap<>();
			
		for (String face : faces) {
			if (facesFreqencies.containsKey(face)) {
				facesFreqencies.put(face, facesFreqencies.get(face) + 1);
			}
			else
				facesFreqencies.put(face, 1);
		}
		DecimalFormat formatter = new DecimalFormat("#0.00");
		for (Map.Entry<String, Integer> face : facesFreqencies.entrySet()) {
			System.out.println(face.getKey() + " -> " + formatter.format((double) face.getValue() / faces.length * 100) + "%");
		}
	}
}
