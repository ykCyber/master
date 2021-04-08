package day14_Methods_Part2;

public class Lab1_Q6 {

	public static void main(String[] args) {
//		When chipmonks get together for a party, they like to have cigars. 
//		A chipmonk party is successful when the number of cigars is between 40 and 60. 
//		Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
//		Write a method that accepts number of cigars and a boolean for weekend, and prints 
//		true if the party with the given values is successful, or false otherwise.
//
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(90, true);
		
		
	} public static void cigarParty(int cigars, boolean weekend) {

		
		if (weekend==true && cigars>=40) {
			System.out.println(true);
		
		}else if (weekend==false && cigars>=40 && cigars<=60){
			System.out.println(true);
		
		}else 
			System.out.println(false);
			
		}
		
	
		}
	
	



