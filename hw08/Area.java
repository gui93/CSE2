//Student: Guilherme Junqueira Perticarari
//CSE002 - Homework 8
//Program 1 - Area: Evaluate the area of the shape entered by the user.

//Scanner will be used to get the barcode input from the user.
import  java.util.Scanner;

//Declaring the class Area
public  class Area{
	
	//Method for calculating the area of a rectangle. 
	//It receives the height and base lengt, a and b, and returns a*b;
	public static double Area_Rectangle(double a, double b){
		return a*b;
	}
	
	//Method for calculating the area of a circle. 
	//It receives the radius, r, and returns pi*r^2;
	public static double Area_Circle(double r){
		return Math.PI*r*r;
	}
	
	//Method for calculating the area of a triangle. 
	//It receives the height and base lengt, h and b, and returns a*b/2;
	public static double Area_Triangle(double b, double h){
		return 0.5*b*h;
	}
	
	//Method for checking whether the user's input is a double or not.
	//It receives the Scanner object and keep checking the value entered until it's a double.
	//Then. it returns the double input.
	public static double Check(Scanner myScanner){
		while(true){
			if(myScanner.hasNextDouble()){
				return myScanner.nextDouble();
			}
			else{
				System.out.print("Please, enter a valid number!: ");
				myScanner.nextLine();
			}
		}
	}
	
	//Main method.
	public static void main(String[] args){
		
		//Scanner object to get inputs from the user.
		Scanner myScanner=new Scanner(System.in);
		
		//The variable 'area' will store the are for the shape.
		double area=0;
		
		//The variable 'enable' will assist in keeping the software in a loop until
		// a proper shape is entered by the user.
		boolean enable=true;
		
		//Prompting the user to enter the name of a shape.
		System.out.print("Write the name of the shape: ");
		
		//The software will be in a loop until a proper shape is entered by the user.
		while(enable){
		
			//Getting the user's input.
			String input=myScanner.nextLine();
			
			//This if-statement will run if the user's entered 'rectangle'.
			if(input.equals("rectangle")){
				//'enable' receives 'false' so that the next while-loop won't run.
				enable=false;
				
				//Prompting the user for the dimensions of the rectangle.
				System.out.println("Enter the dimensions of the rectangle. ");
				System.out.print("Height: ");
				
				//The Check method will keep on a infinite-loop until the user enters a 
				// double as the height.
				double height=Check(myScanner);
			
				System.out.print("Base: ");
				
				//The Check method will keep on a infinite-loop until the user enters a 
				// double as the base length.
				double base=Check(myScanner);
				
				//The 'area' variable receives the result of the Area_Rectangle method with
				// the height and base variables as entered by the user.
				area=Area_Rectangle(height,base);
			}
			
			//This else-if statement will run if the user's entered 'circle'.
			else if(input.equals("circle")){
			
				//'enable' receives 'false' so that the next while-loop won't run.
				enable=false;
				
				//Prompting the user for the dimensions of the circle.
				System.out.println("Enter the radius of the circle: ");
				
				//The Check method will keep on a infinite-loop until the user enters a 
				// double value for the radius.
				double radius=Check(myScanner);
				
				//The 'area' variable receives the result of the Area_Rectangle method with
				// the radius variable as entered by the user.
				area=Area_Circle(radius);
			}
			
			//This else-if statement will run if the user's entered 'triangle'.
			else if(input.equals("triangle")) {
				
				//'enable' receives 'false' so that the next while-loop won't run.
				enable=false;
				
				//Prompting the user for the dimensions of the triangle.
				System.out.println("Enter the dimensions of the triangle. ");
				System.out.print("Height: ");
				//The Check method will keep on a infinite-loop until the user enters a 
				// double as the height.
				double height_t=Check(myScanner);
				System.out.print("Base: ");
				
				//The Check method will keep on a infinite-loop until the user enters a 
				// double as the base length.
				double base_t=Check(myScanner);
				area=Area_Triangle(height_t,base_t);
			}
			
			//This else statement will run if the user enters anything other than the
			// 3 shapes above. He will be prompted to enter another string in the next loop.
			else{	
				System.out.println("ERROR: You entered an invalid shape.");
				System.out.print("Please, choose between rectangle, circle and triangle: ");
			}
		
		}
		
		//The result is printed out.
		System.out.println("The area of the shape is equal to " + area);
		
	
	} 
}