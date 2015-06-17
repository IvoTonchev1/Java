package InstructionSet;

import java.util.Scanner;

public class InstructionSet {
    
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        while (!opCode.equals("END")) {
        	String[] codeArgs = opCode.split(" ");
            long result = 0;
            switch (codeArgs[0]) {
                case "INC": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    result = ++operandOne;                   
                    break;
                    // changed type to long so it doesn't break when adding to the max integer value;
                    // changed operand++ to ++operand so it first adds 1 and doesn't wait until next iteration;
                }
                case "DEC": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    result = --operandOne;                    
                    break;
                    // changed type to long so it doesn't break when subtracting from min integer value;
                    // changed operand-- to --operand so it first subtracts 1 and doesn't wait until next iteration;
                }
                case "ADD": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = (long)operandOne + operandTwo;                    
                    break;
                    // casted one variable to type long so the result of the addition becomes long;
                }
                case "MLA": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = (long)operandOne * operandTwo; 
                    // casted one variable to type long (and not the the entire multiplication) so the result of the multiplication becomes long;
                    break;                   
                }
                default:         	
                    break;                         
            }            
            opCode = input.nextLine();
            // added the line above so we don't have an infinite loop and a new command can be input;
            System.out.println(result);
            
            
        }
    }
}

