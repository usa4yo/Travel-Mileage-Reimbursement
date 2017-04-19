import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class        : TMRTextView
 * Project 12   : Travel Mileage Reimbursement
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-11
 * Last Mod.    : 2017-04-19
 * Due Date     : 2017-04-20
 */


public class TMRTextView {
    
    // Declare variables and objects
    public static  int numberOfCity = 0;
    public static String name;
    public static TMRCalculator totalMileage;
    public static TMRCalculator totalReimbursement;
    
    // Declare constants
    private static final String NUMBER_OF_CITY_VISITED = "Please enter the number of city you have visited for your work trip: ";
    private static final String REQUEST_STARTING_CITY = "Please enter the starting city ";
    private static final String REQUEST_NEXT_CITY = "Next city:";
    private static final String DISPLAY_MILEAGE_SO_FAR = "Total mileage so far is ";
    private static final String DISPLAY_TOTAL_MILEAGE = "Total mileage for your trip is ";    
    private static final String DISPLAY_MILEAGE_BETWEEN_CITY = "The mileage between ";
    private static final String DISPLAY_TOTAL_REIMBURSEMENT = "The total reimbursement allowed is ";
    private static final double RATE = 53.5;
    
    // Start inputCity method
    public static void inputCity(){
        int startingCity;
        int previousCity;        
        int nextCity = 0;
        int distance;
        
        // 
        Scanner kb = new Scanner(System.in);

        // Request the user to enter the number of city visited and retrieve it
        System.out.println(NUMBER_OF_CITY_VISITED);
        numberOfCity = kb.nextInt();

        // Declare cityName array with the number of city entered by the user.
        String cityName[] = new String[numberOfCity];
        
        // Request the user to entered the starting city. Note the Starting city is also the ending city.
        System.out.println(REQUEST_STARTING_CITY);
        cityName[0] = kb.next().toUpperCase();
        
        // retrieve the ordinal value of the starting city entered by the user
        startingCity = CityName.valueOf(cityName[0]).ordinal();
        
        // Save the starting city into the previous city
        previousCity = startingCity;

        // Declare totalMileage and totalReimbursement object
        totalMileage = new TMRCalculator(0);
        totalReimbursement = new TMRCalculator(0, 0);
        
        
        // loop as many time you need to capture all the city visited by the user
        for(int i = 1; i < numberOfCity; ++i){
            // Request the next city visited from the user and store it to the array
            System.out.println(REQUEST_NEXT_CITY);
            cityName[i] = kb.next().toUpperCase();

            // retrieve the ordinal value of the next city entered by the user 
            nextCity = CityName.valueOf(cityName[i]).ordinal();
            
            // retrieve the mileage from the 2-dimension array in TRMData and calculate the distance
            distance = TMRData.getMileage()[previousCity][nextCity];
            totalMileage = new TMRCalculator(distance);

            // Display Mileage between cities and total mileage so far for the trip
            System.out.println(DISPLAY_MILEAGE_BETWEEN_CITY + cityName[(i - 1)] + " and " + cityName[i] + " is " + distance);
            System.out.println(DISPLAY_MILEAGE_SO_FAR + TMRCalculator.getMileage());

            // previousCity become nextCity at this point
            previousCity = nextCity;
            
        }   // End of bracket for loop i
        
        // Start processing the return to the starting city...
        System.out.println();
        
        // Retrieve ordinal value of the starting city entered by the user
        nextCity = CityName.valueOf(cityName[0]).ordinal();
        
        // retrieve the mileage from the 2-dimension array in TRMData and calculate the distance        
        distance = TMRData.getMileage()[previousCity][nextCity];

        // Calculate distance between previous city and starting city
        totalMileage = new TMRCalculator(distance);
        
        // Calculate reimbursement total for the whole trip
        totalReimbursement = new TMRCalculator(RATE, TMRCalculator.getMileage());

        // Display final destination mileage, total mileage for the whole trip and the total reimbursement
        System.out.println(DISPLAY_MILEAGE_BETWEEN_CITY + cityName[(numberOfCity - 1)] + " and " + cityName[0] + " is " + distance);
        System.out.println(DISPLAY_TOTAL_MILEAGE + TMRCalculator.getMileage());
        System.out.println(DISPLAY_TOTAL_REIMBURSEMENT + " $" + String.format("%.2f",  new BigDecimal(TMRCalculator.getReimbursement())));
        
        // Close the scanner
        kb.close();

    }   // End of bracket inputCity method

}   // End bracket of TMRTextView class
    
