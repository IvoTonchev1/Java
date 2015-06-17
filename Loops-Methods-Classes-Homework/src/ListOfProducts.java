import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfProducts{
	
	public static void main(String args[]){
		ArrayList<Product> products  = new ArrayList<Product>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader("src/Input1.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));
			String input;
			while ((input = reader.readLine()) != null) {
				String[] splited = input.split(" ");
				products.add(new Product(splited[0], Double.parseDouble(splited[1])));
			}
			
			Collections.sort(products);
			for (Product product : products) {
				writer.write(product.getPrice() + " " + product.getName() +"\r\n");
			}
			reader.close();
			writer.close();
		} catch (IOException exeption) {
			System.out.println("Error");
            exeption.printStackTrace(); 
		}	
	}
}