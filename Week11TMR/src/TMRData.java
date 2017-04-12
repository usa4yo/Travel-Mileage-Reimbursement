

/**
 * Class        : TMRData
 * Project 12   : Travel Mileage Reimbursement
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-11
 * Last Mod.    : 2017-04-11
 * Due Date     : 2017-04-12
 */

public class TMRData {
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

    private int numberOfCity;
    private String city;
 
    public TMRData(int numberOfCity, String city) {
        super();
        this.numberOfCity = numberOfCity;
        this.city = city;
    }

    /**
     * @return the mileage
     */
    public static int[][] getMileage() {
        return mileage;
    }   // End bracket of getMileage method

    /**
     * @param mileage the mileage to set
     */
    public static void setMileage(int[][] mileage) {
        TMRData.mileage = mileage;
    }   // End bracket of setMileage method

    /**
     * @return the numberOfCity
     */
    public int getNumberOfCity() {
        return numberOfCity;
    }   // End bracket of getNumberOfCity method

    /**
     * @param numberOfCity the numberOfCity to set
     */
    public void setNumberOfCity(int numberOfCity) {
        this.numberOfCity = numberOfCity;
    }   // End bracket of setNumberOfCity method

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }   // End bracket of getCity method

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }   // End bracket of setCity method
   
}	// End bracket of TMRData class
