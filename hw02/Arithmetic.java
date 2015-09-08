
//Building the Arithmetic class
public class Arithmetic{
	
	//Building the main method 
	public static void main(String[] args){
	
	// 1. Input variables
	int numberSocks=3;//This variable will store the number of socks
	double sockCost$=2.58;//This variable will store the price for each sock
	int numberGlasses=6;//This variable will store the number of glasses
	double glassCost$=2.29;//This variable will store the price for each glass
	int numberEnvelopes=1;//This variable will store the number of boxes of envelopes
	double envelopeCost$=3.25;//This variable will store the price per box of envelope
	double taxPercent=0.06;//This variable will store the tax value
	
	// 2. Output variable
	double totalSocksCost$ = numberSocks*sockCost$;//Total cost of socks
	double totalGlassesCost$ = numberGlasses*glassCost$;//Total cost of glasses
	double totalEnvelopesCost$ = numberEnvelopes*envelopeCost$;//Total cost of envelopes
	double Total=totalSocksCost$+totalGlassesCost$+totalEnvelopesCost$;//Total cost of everything
	double Total_Taxes=Total+Total*taxPercent;//Total cost after taxes
	
	
	// 3. Printing out the results
	System.out.println("The total cost of socks is: "
	                    + totalSocksCost$); //Total cost of socks
	System.out.println("The total cost of envelopes is: "
	                    + totalEnvelopesCost$);//Total cost of envelopes
	System.out.println("The total cost of glasses is: "
	                    + totalGlassesCost$);//Total cost of glasses
	System.out.println("The total cost of everything is: "
	                    + Total);//Total cost of everything
	System.out.println("The total cost of everything with taxes is: "
	                    + Total_Taxes);//Total cost of every plus taxes
	
	}
}