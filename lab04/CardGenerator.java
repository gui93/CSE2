//Student: Guilherme Junqueira Perticarari
//Lehigh ID: 824858244
//Course: CSE-002
//Date: 9/18/2015
//Lab 4: Card Generator 
//Description: In this program, we are going to generate a random number between 
//              1 and 52 and, using if-else statement, this number will be classified
//              in the following way:
//                1- Numbers from 1~13 represent diamonds.
//                2- Numbers from 14~26 represent clubs.
//                3- Numbers from 27~39 represent hearts.
//                4- Numbers from 40~52 represent spades.

public class CardGenerator{ //Creating the Timer class
	public static void main(String[] args){ //Creating the main method
	    //'num' will store the randomly generated number from 1 to 52;
    	int num=(int)(Math.random()*52)+1;
    	
    	//'suit' will store the suit of the card 
    	//'identity' will store the identity of the card
    	String suit, identity;
	
	    //The outter if-else statements are going to check the range of the random number.
	    //1- Numbers from 1~13 represent diamonds.
        //2- Numbers from 14~26 represent clubs.
        //3- Numbers from 27~39 represent hearts.
        //4- Numbers from 40~52 represent spades.
        //The inner if-else statements will check wheter the cards' identities are numbers or not.
        //If they're not, for example, if num=1 (the identity is Aces), the if-statements should
        //assign the corresponding String to the variable identity.
    	if(num<=13){
             suit="diamonds";
             if(num==1){
                 identity="Ace";
                 System.out.println("The card is a " + identity + " of " + suit);

             } 
             else if(num==11){
                 identity="Jack";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==12){
                 identity="Queen";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==13){
                 identity="King";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else{
                  System.out.println("The card is a " + num + " of " + suit);
             }
          
    	}
    	//num is subtracted by 13 so the same pattern can be used.
             else if(num<=26){
    	     suit="clubs";
    	     num=num-13;
    	     if(num==1){
                 identity="Ace";
                 System.out.println("The card is a " + identity + " of " + suit);
             } 
             else if(num==11){
                 identity="Jack";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==12){
                 identity="Queen";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==13){
                 identity="King";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else{
                  System.out.println("The card is a " + num + " of " + suit);
             }
    	}
    	//num is subtracted by 26 so the same pattern can be used.
    	else if(num<=39){
    	     suit="hearts";
    	     num=num-26;
    	    if(num==1){
                 identity="Ace";
                 System.out.println("The card is a " + identity + " of " + suit);
             } 
             else if(num==11){
                 identity="Jack";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==12){
                 identity="Queen";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==13){
                 identity="King";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else{
                  System.out.println("The card is a " + num + " of " + suit);
             }
    	}
    	//num is subtracted by 39 so the same pattern can be used.
    	else {
    	     suit="spades";
    	     num=num-39;
    	  if(num==1){
                 identity="Ace";
                 System.out.println("The card is a " + identity + " of " + suit);
             } 
             else if(num==11){
                 identity="Jack";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==12){
                 identity="Queen";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else if(num==13){
                 identity="King";
                 System.out.println("The card is a " + identity + " of " + suit);
             }
             else{
                  System.out.println("The card is a " + num + " of " + suit);
             }
    	}
    	

	}//End of the main method.
}//End of the class