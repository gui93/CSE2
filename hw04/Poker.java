// Guilherme Junqueira Perticarari
// CSE2 - Fundamentals of Programming
// Homework 4
// Description: Five random numbers between 1 and 52 will be generated and, to each one,
//              it will be assigned a card suit and identity by the same pattern that
//              was used in lab04.
//              This program will check if there's a pair, three of a kind or two pairs
//              in the 5 card hand.

public class Poker{ //Creating the Poker class
	public static void main(String[] args){ //Creating the main method
	
    	//These variables will hold the identity and suit for every one of the 5 cards.
		String identity="a", suit="a";
		String identity2="b", suit2="b";
		String identity3="b", suit3="b";
		String identity4="d", suit4="d";
		String identity5="e", suit5="e";
		
		
	    //These variables will hold each of the 5 randomly generated numbers from 1 to 52.
		int num=(int)(Math.random()*52)+1;
    	int num2=(int)(Math.random()*52)+1;
    	int num3=(int)(Math.random()*52)+1;
    	int num4=(int)(Math.random()*52)+1;
    	int num5=(int)(Math.random()*52)+1;
		
		//These variables will be used to test which suit each card belongs to.
		int test,test2,test3,test4,test5;
		
		//This variable will be used to identify wether we have a pair, two pairs
		//or three of a kind in the hand.
		// if n is equal to:      0, then, it's a high hand card.  
		//                        2, then, it's a pair.
		//                        3, then, it's a three of a kind
		//                        4, then, it's two pairs.
		int n=0;

        //Through these calculations, we'll be able to define the suit of each card.
        // if num/13 is equal to:  0, then it's diamonds.
        //                         1, then, it's clubs.
        //                         2, then, it's hearts.
        //                         3, then, it's spades.
    	test=num/13;
    	test2=num2/13;
    	test3=num3/13;
    	test4=num4/13;
    	test5=num5/13;
    	
    	//Through these calculations, we'll be able to define the non-numerical
    	//  identity of each card.
        // if num%13 is equal to:  1, then it's Ace.
        //                         11, then, it's Jack.
        //                         12, then, it's Queen.
        //                         13, then, it's King.
    	num=num%13;
    	num2=num2%13;
    	num3=num3%13;
    	num4=num4%13;
    	num5=num5%13;
    	
    	//These switch statements will do exactly as stated before. It will store a suit
    	// value for each one of the cards depending on the value of the variables 'test'.
    	switch(test){
    		case 0: suit="diamonds";
    				break;
    		case 1: suit="clubs";
    				break;
    		case 2: suit="hearts";
    				break;
    		default: suit="spades";	
    	}
    	switch(test2){
    		case 0: suit2="diamonds";
    				break;
    		case 1: suit2="clubs";
    				break;
    		case 2: suit2="hearts";
    				break;
    		default: suit2="spades";	
    	}
    	switch(test3){
    		case 0: suit3="diamonds";
    				break;
    		case 1: suit3="clubs";
    				break;
    		case 2: suit3="hearts";
    				break;
    		default: suit3="spades";	
    	}
    	switch(test4){
    		case 0: suit4="diamonds";
    				break;
    		case 1: suit4="clubs";
    				break;
    		case 2: suit4="hearts";
    				break;
    		default: suit4="spades";	
    	}
    	switch(test5){
    		case 0: suit5="diamonds";
    				break;
    		case 1: suit5="clubs";
    				break;
    		case 2: suit5="hearts";
    				break;
    		default: suit5="spades";	
    	}
    	
    	//These switch statements will do exactly as stated before. They will print out
    	// the identity and suit of each card, and depending on the variable 'num',
    	// the identity may not be numerical.
    	switch(num){
    	    case 0: identity="King";
    		    	System.out.println("You got a " + identity + " of " + suit);
    				break;
    		case 1: identity="Ace";
    		    	System.out.println("You got a " + identity + " of " + suit);
    				break;
    		case 11: identity="Jack";
    		    	System.out.println("You got a " + identity + " of " + suit);
    				break;
    		case 12: identity="Queen";
    		    	System.out.println("You got a " + identity + " of " + suit);
    				break;
    		default:
    		    	System.out.println("You got a " + num + " of " + suit);
    	}
    	switch(num2){
    	    case 0: identity2="King";
    		    	System.out.println("You got a " + identity2 + " of " + suit2);
    				break;
    		case 1: identity2="Ace";
    		    	System.out.println("You got a " + identity2 + " of " + suit2);
    				break;
    		case 11: identity2="Jack";
    		    	System.out.println("You got a " + identity2 + " of " + suit2);
    				break;
    		case 12: identity2="Queen";
    		    	System.out.println("You got a " + identity2 + " of " + suit2);
    				break;
    		default: 
    		    	System.out.println("You got a " + num2 + " of " + suit2);

    	}
    	switch(num3){
    	    case 0: identity3="King";
    		    	System.out.println("You got a " + identity3 + " of " + suit3);
    				break;
    		case 1: identity3="Ace";
    		    	System.out.println("You got a " + identity3 + " of " + suit3);
    				break;
    		case 11: identity3="Jack";
    		    	System.out.println("You got a " + identity3 + " of " + suit3);
    				break;
    		case 12: identity3="Queen";
    	    		System.out.println("You got a " + identity3 + " of " + suit3);
    				break;
    		default:
    		    	System.out.println("You got a " + num3 + " of " + suit3);

    	}
    	switch(num4){
    	    case 0: identity4="King";
    		    	System.out.println("You got a " + identity4 + " of " + suit4);
    				break;
    		case 1: identity4="Ace";
    		    	System.out.println("You got a " + identity4 + " of " + suit4);
    				break;
    		case 11: identity4="Jack";
    		    	System.out.println("You got a " + identity4 + " of " + suit4);
    				break;
    		case 12: identity4="Queen";
    	    		System.out.println("You got a " + identity4 + " of " + suit4);
    				break;
    		default:
    		    	System.out.println("You got a " + num4 + " of " + suit4);

    	}
    	 switch(num5){
    	    case 0: identity5="King";
    		    	System.out.println("You got a " + identity5 + " of " + suit5);
    				break;
    		case 1: identity5="Ace";
    		    	System.out.println("You got a " + identity5 + " of " + suit5);
    				break;
    		case 11: identity5="Jack";
    		    	System.out.println("You got a " + identity5 + " of " + suit5);
    				break;
    		case 12: identity5="Queen";
    	    		System.out.println("You got a " + identity5 + " of " + suit5);
    				break;
    		default:
    		    	System.out.println("You got a " + num5 + " of " + suit5);

    	
		}
		
		//These series of if-else statements will be useful to assign different values
		// to the variable 'n' depending on wether we have a pair, a three of a kind, two
		// pair or a high hand card. It was implemented by trying to use up all possible 
		// combinations that could arise from a 5 card hand.
		
		// For a 5 card hand A B C D E, we'll have a three of a kind if:
		//A=B=C
		if(num==num2 && num2==num3 && num!=num4 && num!=num5){
		   	n=3;
		} 
		//A=B=D
		else if(num==num2 && num2==num4 && num!=num3 && num!=num5){
		   	n=3;
		}
		//A=B=E
		else if(num==num2 && num2==num5 && num!=num3 && num!=num4){
		   	n=3;
		}
		//A=C=D
		else if(num==num3 && num3==num4 && num!=num2 && num!=num5){
		   	n=3;
		}
		//A=C=E
		else if(num==num3 && num3==num5 && num!=num2 && num!=num4){
			n=3;
		}
		//A=D=E
		else if(num==num4 && num4==num5 && num!=num2 && num!=num3){
		   	n=3;
		}
		//B=C=D
		else if(num2==num3 && num3==num4 && num2!=num && num2!=num5){
		   	n=3;
		}
		//B=C=E
		else if(num2==num3 && num3==num5 && num2!=num && num2!=num4){
		   	n=3;
		}
		//B=D=E
		else if(num2==num4 && num4==num5 && num2!=num && num2!= num3){
		   	n=3;
		}
		//C=D=E
		else if(num3==num4 && num4==num5 && num3!=num && num3!=num2){
			n=3;
		}
		
		// We'll have a two pair if:
		//A=B AND C=D
		else if(num==num2 && num3==num4){
			n=4;
		}
		//A=B AND C=E
		else if(num==num2 && num3==num5){
			n=4;
	    }
	    //A=B AND D=E
		else if(num==num2 && num4==num5){
			n=4;
		}
		//A=C AND D=E
		else if(num==num3 && num4==num5){
			n=4;
		}
		//A=C AND B=D
		else if(num==num3 && num2==num4){
			n=4;
		}
		//A=C AND B=E
		else if(num==num3 && num2==num5){
			n=4;
		}
		//A=D AND B=C
		else if(num==num4 && num2==num3){
			n=4;
		}
		//A=D AND B=E
		else if(num==num4 && num2==num5){
			n=4;
		}
		//A=D AND C=E
		else if(num==num4 && num3==num5){
			n=4;
		}
		//A=E AND B=C
		else if(num==num5 && num2==num3){
			n=4;
		}
		//A=E AND B=D
		else if(num==num5 && num2==num4){
			n=4;
		}
		//A=E AND C=D
		else if(num==num5 && num3==num4){
			n=4;
		}
		//B=C AND A=D
		else if(num2==num3 && num==num4){
			n=4;
		}
		//B=C AND D=E
		else if(num2==num3 && num4==num5){
			n=4;
		}
		//B=C AND A=E
		else if(num2==num3 && num==num5){
			n=4;
		}
	    //B=D AND A=C
		else if(num2==num4 && num==num3){
			n=4;
		}
		//B=D AND A=E
		else if(num2==num4 && num==num5){
			n=4;
		}
		//B=D AND C=E
		else if(num2==num4 && num5==num3){
			n=4;
		}
		//B=E AND A=C
		else if(num2==num5 && num==num3){
			n=4;
		}
		//B=E AND A=D
		else if(num2==num5 && num==num4){
			n=4;
		}
		//B=E AND C=D
		else if(num2==num5 && num3==num4){
			n=4;
		}
		//C=D AND A=B
		else if(num3==num4 && num==num2){
			n=4;
		}
		//C=D AND A=E
		else if(num3==num4 && num==num5){
			n=4;
		}
		//C=D AND B=E
		else if(num3==num4 && num5==num2){
			n=4;
		}
		//C=E AND A=B
		else if(num3==num5 && num==num2){
			n=4;
		}
		//C=E AND A=D
		else if(num3==num5 && num==num4){
			n=4;
		}
		//C=E AND B=D
		else if(num3==num5 && num2==num4){
			n=4;
		}
		//D=E AND A=B
		else if(num4==num5 && num==num2){
			n=4;
		}
		//D=E AND A=C
		else if(num4==num5 && num==num3){
			n=4;
		}
		//D=E AND B=C
		else if(num4==num5 && num2==num3){
			n=4;
		}
	    // We'll have a pair if:
	    //A=B
		else if(num==num2 && num!=num3 && num!=num4 && num!=num5){
			n=2;
		}
		//A=C
		else if(num==num3 && num!=num2 && num!=num4 && num!=num5){
			n=2;
		}
		//A=D
		else if(num==num4 && num!=num2 && num!=num3 && num!=num5){
			n=2;
		}
		//A=E
		else if(num==num5 && num!=num2 && num!=num3 && num!=num4){
			n=2;
		}
		//B=C
		else if(num2==num3 && num2!=num && num2!=num4 && num2!=num5){
			n=2;
		}
		//B=D
		else if(num2==num4 && num2!=num && num2!=num3 && num2!=num5){
			n=2;
		}
		//B=E
		else if(num2==num5 && num2!=num && num2!=num3 && num2!=num4){
			n=2;
		} 
		//C=D
		else if(num3==num4 && num3!=num && num3!=num2 && num3!=num5){
			n=2;
		}
		//C=E
		else if(num3==num5 && num3!=num && num3!=num2 && num3!=num4){
			n=2;
		}
		//D=E
		else if(num4==num5 && num4!=num && num4!=num2 && num4!=num3){
			n=2;
		}
		
		//For everything else, it's a high hand card!
		else{
			n=0;
		}
		
		//These series of if-else statements will print out the type of hand that was
		// randomly generated.
		if(n==2){
	        System.out.println("You've got a pair!");
		 }
		 else if(n==3){
		   	System.out.println("You got a three of a kind!");
		 } 
		 else if(n==4) {
		   	System.out.println("You've got two pairs!");
		 } 
		 else {
		   	System.out.println("You've got a high hand card!");
		 }
    }//End of main method
}//End of Poker class