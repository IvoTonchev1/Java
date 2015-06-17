package InstructionSet;

import java.util.Scanner;

public class BitCarousel {

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();

            if (direction.equals("right")) {					// changed == to .equals() because it is better when comparing strings;
                byte rightMostBit = (byte)(number & 1);			// changed type to byte and applied casting;
                number >>= 1;
                number |= rightMostBit << 5;					// changed <<6 to <<5 because we are actually moving five positions to the left;
            } else if (direction.equals("left")) {				// changed == to .equals() because it is better when comparing strings;
                byte leftMostBit = (byte)((number >> 5) & 1);	// changed type to byte and applied casting; changed >>6 to >>5 because we are actually 
                												// moving five positions to the right;
                number <<= 1;									
                if (((number >> 6) & 1) == 1) {					// added condition to eliminate the chance of getting a number bigger than expected because
                												// we have moved a "1" one position further to the left;               	
					number ^= 64;								
				}
                number |= leftMostBit;
                
            }
        }

        System.out.println(number);
    }
}
