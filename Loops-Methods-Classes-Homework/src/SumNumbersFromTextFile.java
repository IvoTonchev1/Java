import java.io.BufferedReader;
import java.io.FileReader;

public class SumNumbersFromTextFile {

	public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Input.txt"));
            String line;
            long sum = 0;
            while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
             sum+=number;
            }
            System.out.println(sum);
            reader.close();
        }catch(Exception exception){
            System.out.println("Error");          
        }    
    }
}