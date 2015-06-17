package InstructionSet;

import java.util.ArrayList;
import java.util.Scanner;

public class BePositive {


        public static void main(String[] args) {
            @SuppressWarnings("resource")
            Scanner scn = new Scanner(System.in);           
            int countSequences = scn.nextInt();               
            scn.nextLine();
            for (int i = 0; i < countSequences; i++) {                        
            	String[] input = scn.nextLine().trim().split("[ ]+");
                	ArrayList<Integer> numbers = new ArrayList<>();
                    for (int j = 0; j < input.length; j++) {
                    	if (!input[j].equals("") ) {
                    		int num = Integer.parseInt(input[j]);
                            numbers.add(num);       
                        }                                                       
                    }
                    boolean found = false;                       
                    for (int j = 0; j < numbers.size(); j++) {                              
                    	int currentNum = numbers.get(j);                               
                        if (currentNum >= 0) {                                        
                        	System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ?  "\n" :" ");
                            found = true;                                       
                        } 
                        else if (currentNum < 0 &&  j < numbers.size() - 1){
                        	currentNum += numbers.get(j + 1);                                       
                            numbers.remove(j + 1);
                            if (currentNum >= 0) {                                                
                            	System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n": " " );
                                found = true;
                            }                                        
                            else if (currentNum < 0 && j == numbers.size() - 1 && found ) {
                            	System.out.println();
                            }
                        }
                    }                      
                    if (!found) {
                    	System.out.println("(empty)");
                    }                       
            }       
        }
}

