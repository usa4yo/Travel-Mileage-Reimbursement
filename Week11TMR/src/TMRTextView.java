import java.util.Scanner;

/**
 * Class        : TMRTextView
 * Project 12   : Travel Mileage Reimbursement
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-11
 * Last Mod.    : 2017-04-11
 * Due Date     : 2017-04-12
 */


public class TMRTextView {

    public static int[] city;
    public static String[] cityName;
    
    private static final String NUMBER_OF_CITY_VISITED = "Please enter the number of city your have visited for your work trip: ";
    private static final String REQUEST_STARTING_CITY = "Please enter the starting city: ";
    private static final String REQUEST_NEXT_CITY = "Next city: ";    
        
    // Define keyboard as a scanner
    static Scanner kb;
    
    public static void inputCities(){
        kb = new Scanner(System.in);

        System.out.println(NUMBER_OF_CITY_VISITED);
        city = new int[kb.nextInt()];
        
        System.out.println(REQUEST_STARTING_CITY);
        for(int i = 0; i < city.length; ++i){
            System.out.println(REQUEST_NEXT_CITY + (i+1) + ": " );
            cityName[i] = kb.nextLine();
        }
    
        kb.close();

    }   // End of bracket inputCity method

}   // End bracket of TMRTextView class
    

