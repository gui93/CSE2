//Student: Guilherme Junqueira Perticarari
//CSE002 - Homework 10

//Scanner will be used to get the barcode input from the user.
import  java.util.Scanner;

//Declaring the class Shuffling
public class Shuffling{
	
	//Method: printArray:
	public static void printArray(String[] s){
	
		//It takes a String array as an input and prints out every string
		// contained in it;
		for(int i=0;i<s.length;i++){
			System.out.print(s[i] + " ");
		}
	}
	
	//Method: shuffle:
	public static void shuffle(String[] s){
	
		// 'rand' will be used to store the randomly generated number.
		int rand;
		
		// 'temp' will be used to swap the deck.
		String temp;
		
		//The iteration is going to happen 52 times.
		for(int i=0;i<52;i++){
		
			//'rand' receives a random number between 1 and 52;
			rand=(int)(Math.random()*51)+1;
			
			//'temp' receives the String in the first position of the array.
			temp=s[0];
			
			//The String in the rand-th position will be stored in the
			// first position of the array.
			s[0]=s[rand];
			
			//The rand-th position will store the String that used to be in the
			// first position.
			s[rand]=temp;
		}
	}
	
	//Method: randomizeHand:
	public static String[] randomizeHand(String[] s){
	
		//'rand' will store the randomly generated number.
		int rand;
		
		//'hand' is a String array that can store up to 5 arrays.
		//It's the array that will be returned at the end of the program.
		String[] hand=new String[5];
		
		//iteration variable.
		int j;
		
		//
		for(int i=0;i<5;i++){
		
			//'rand' receives a random number between 0 and 51;
			rand=(int)(Math.random()*52);
			
			//the i-th position of hand receives the string s[rand]
			hand[i]=s[rand];
			j=0;
			
			//Checking if any the previous positions of hand has the same 
			// string as the one on the i-th position.
			while(j<i){
				while(hand[i]==hand[j]){
					rand=(int)(Math.random()*52);
				}	hand[i]=s[rand];
			j++;
			}
		
		}
		return hand;
	}
	
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		//suits club, heart, spade or diamond
		String[] suitNames={"C","H","S","D"};   
		String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
		String[] cards = new String[52];
		String[] hand = new String[5];
		for (int i=0; i<52; i++){
  			cards[i]=rankNames[i%13]+suitNames[i/13];
  			System.out.print(cards[i]+" ");
		}
		
		System.out.println();
		System.out.print("Original Deck: ");
		printArray(cards);
		System.out.println();
		
		shuffle(cards);
		System.out.print("Shuffled Deck: ");
		printArray(cards);
		System.out.println();
		
		hand = randomizeHand(cards);
		System.out.print("Random Hand: ");
		printArray(hand);
		System.out.println();
  }
}