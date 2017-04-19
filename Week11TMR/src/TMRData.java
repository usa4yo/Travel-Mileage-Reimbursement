

/**
 * Class        : TMRData
 * Project 12   : Travel Mileage Reimbursement
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-11
 * Last Mod.    : 2017-04-19
 * Due Date     : 2017-04-20
 */

public class TMRData{
    // Initialized mileage to a 10X10 array
    // Horizontal and Vertical value are represented in the enum CityName 
    private static int[] [] mileage =   { {0, 1004, 1753, 2752, 3017, 1520, 1507, 609, 3155, 448},
            {1004, 0, 921, 1780, 2048, 1397, 919, 515, 2176, 709},
            {1753, 921, 0, 1230, 1399, 1343, 517, 1435, 2234, 1307},
            {2752, 1780, 1230, 0, 272, 2570, 1732, 2251, 1322, 2420},
            {3017, 2048, 1399, 272, 0, 2716, 1858, 2523, 1278, 2646},
            {1520, 1397, 1343, 2570, 2716, 0, 860, 1494, 3447, 1057},
            {1507, 919, 517, 1732, 1858, 860, 0, 1307, 2734, 1099},
            {609, 515, 1435, 2251, 2523, 1494, 1307, 0, 2820, 571},
            {3155, 2176, 2234, 1322, 1278, 3447, 2734, 2820, 0, 2887},
            {448, 709, 1307, 2420, 2646, 1057, 1099, 571, 2887, 0}

        };
    
    // Declare private int 
    private static int numberOfCity;
    
    // Declare default constructor
    public TMRData() {
        super();
        TMRData.numberOfCity = 0;
    }   // Ending bracket of TRMData constructor
    
    // Declare constructor
    public TMRData(int newNumberOfCity){
        TMRData.numberOfCity = newNumberOfCity;
    }   // Ending bracket of TRMData constructor
    

    /**
     * @return the mileage
     */
    public static int[][] getMileage() {
        return mileage;
    }   // Ending bracket of getMileage 

    /**
     * @param mileage the mileage to set
     */
    public static void setMileage(int[][] mileage) {
        TMRData.mileage = mileage;
    }   // Ending bracket of setMileage

    /**
     * @return the numberOfCity
     */
    public static int getNumberOfCity() {
        return numberOfCity;
    }   // Ending bracket of getNumberOfCity

    /**
     * @param numberOfCity the numberOfCity to set
     */
    public void setNumberOfCity(int numberOfCity) {
        TMRData.numberOfCity = numberOfCity;
    }   // Ending bracket of setNumberOfCity

}   // Ending bracket of TMRData