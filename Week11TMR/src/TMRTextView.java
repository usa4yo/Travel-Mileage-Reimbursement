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

    public static  int city = 0;
    public static String[] cityName;
    
    private static final String NUMBER_OF_CITY_VISITED = "Please enter the number of city your have visited for your work trip: ";
    private static final String REQUEST_STARTING_CITY = "Please enter the starting city ";
    private static final String REQUEST_NEXT_CITY = "Next city:";    
    
    public static TMRData cityTotal;
    public static TMRData name;
    
    public static void inputCities(){
        
        Scanner kb = new Scanner(System.in);

        
        System.out.println(NUMBER_OF_CITY_VISITED);
        city = kb.nextInt();
        
        cityTotal = new TMRData(city);
        System.out.println("The number of city has been stored as : " + TMRData.getNumberOfCity());
        
        
        cityName = new String[(city + 1)];
        
        System.out.println(REQUEST_STARTING_CITY);
        cityName[0] = kb.next();
        name = new TMRData(cityName[0]);
        System.out.println("Starting city is " + TMRData.getCity());

        for(int i = 1; i < city; ++i){
            System.out.println(REQUEST_NEXT_CITY);
            cityName[i] = kb.next();
            name = new TMRData(cityName[i]);
            System.out.println("Next city is " + TMRData.getCity());
        }
        
        cityName[city] = cityName[0];
        name = new TMRData(cityName[city]);
        System.out.println("Return city is "  + TMRData.getCity());
        
        kb.close();

    }   // End of bracket inputCity method

}   // End bracket of TMRTextView class
    

