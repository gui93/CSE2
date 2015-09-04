//Student Name: Guilherme Junqueira Perticarari
//Course: Fundamentals of Programming CSE2
//Date: 9/4/2015
//Lab 2 Program: Cyclometer

//This program must take the time elapsed in seconds and the number of rotations
//of the front wheel for two trips and do the following:
//      print the number of minutes for each trip
//      print the number of counts for each trip
//      print the distance of each trip in miles
//      print the distance for the two trips combined


//Defining the Cyclometer class
public class Cyclometer{
    
    //Defining the main method
    public static void main(String[] args){
        
        // 1. Inputs of the program
        int secsTrip1=480;//Time elapsed for the first trip
        int secsTrip2=3220;//Time elapsed for the second trip
        int countsTrip1=1561;//Number of rotations for the first trip
        int countsTrip2=9037;//Number of rotations for the second trip
        
        // 2. Intermediate constants that will be useful for the calculations
        double wheelDiameter=27.0,//Diameter of the wheel
        PI=3.14159,//Constant PI
        feetPerMile=5280,//Conversion factor between feet and mile
        inchesPerFoot=12,//Conversion factor between inches and foot
        secondsPerMinute=60;//Conversion factor between seconds and minutes
        
        // 3. Outputs of the program
        double distanceTrip1, distanceTrip2,totalDistance;//Output variables
        distanceTrip1=countsTrip1*wheelDiameter*PI;//Distance for Trip 1 in inches
        distanceTrip1/=inchesPerFoot*feetPerMile;//Distance for Trip1 in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;//Distance for Trip2 in miles
        totalDistance=distanceTrip1+distanceTrip2;//Total distance in miles

        // 4. Printing out the results
        System.out.println("The first trip took "+ (secsTrip1/secondsPerMinute)+
                " minutes and had "+ countsTrip1+" counts.");
        System.out.println("The second trip took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
        System.out.println("The first trip was "+distanceTrip1+" miles");
        System.out.println("The second trip was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

        


        
    //End of the main method   
    }
//End of the Cyclometer class
}