package InstructionSet;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);	
		
		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong(); 
		}
		
		String command = scn.next();

		while (!command.equals("stop")) {  // changed over to stop;
			String line = scn.nextLine().trim();
			int[] params = new int[2];
			if (command.equals("add") || command.equals("subtract") || command.equals("multiply")) {
				String[] stringParams = line.split(" ");
				params[0] = Integer.parseInt(stringParams[0]);
				params[1] = Integer.parseInt(stringParams[1]);
				array = performAction(array, command, params);  // made the array to be equal to the result returned by the method;
			}
			else if (command.equals("lshift")) {   // made a new condition and made the array to be equal to the result returned by the method;
				array = arrayShiftLeft(array);
			}
			else if (command.equals("rshift")) {   // made a new condition and made the array to be equal to the result returned by the method;
				array = arrayShiftRight(array);
			}

			printArray(array);
			System.out.print('\n');
			
			command = scn.next();			
		}		
	}
	
	static long[] performAction(long[] arr, String action, int[] params){  // changed the method to return value;
		long[] array = arr.clone();
		int pos = params[0] - 1;   // subtracting 1 so we can count the elements correctly;
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos] *= value;
			break;
		case "add":
			array[pos] += value;
			break;
		case "subtract":
			array[pos] -= value;
			break;
		}
		return array;
	}

	private static long[] arrayShiftRight(long[] array) {    // changed the method to return value;
		long temp = Array.getLong(array, array.length-1);    // we need to save the last element before it gets replaced;
		for (int i = array.length-1; i >= 1 ; i--) {
			array[i] = array[i - 1];
		}
		array[0] = temp;    								 // copy the last element to the first position in the array;
		return array;
	}

	private static long[] arrayShiftLeft(long[] array) {     // changed the method to return value;
		long temp = array[0];                                // we need to save the first element before it gets replaced;
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		Array.setLong(array, array.length-1, temp);			 // set the last element of the array to be equal to the previous first element;
		return array;
	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}