
public class FullHouse {

	public static void main(String[] args) {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"\u2660", "\u2666", "\u2663", "\u2764"};
		int count = 0;
		for(int card = 0; card < ranks.length; card++)
	    {
	        String firstCard = ranks[card]; 
	        for(int suit1 = 0; suit1 < suits.length; suit1++)
	        {
	            for(int suit2 = suit1+1; suit2 < suits.length; suit2++)
	            {
	                for(int suit3 = suit2+1; suit3 < suits.length; suit3++)
	                {
	                    for(int card2 = 0; card2 < ranks.length; card2++)
	                    {
	                        String secondCard = ranks[card2]; 
	                        if(firstCard.compareTo(secondCard) != 0){
	                            for(int othersuit1 = 0; othersuit1 < suits.length; othersuit1++)
	                            {
	                                for(int othersuit2 = othersuit1+1; othersuit2 < suits.length; othersuit2++)
	                                {	                                 
	                                    count++;
	                                    System.out.println("(" + firstCard + suits[suit1]+" "+firstCard + suits[suit2]+" "+firstCard + suits[suit3]+ " "
	                                                       +secondCard + suits[othersuit1]+" "+secondCard + suits[othersuit2] + ")");
	                                }
	                            }
	                        }
	                    }               
	                }
	            }
	        }
	    }
		System.out.println(count);
	}
}
