/**
 * 
 */

/**
 * Class        : CityName (Enum)
 * Project 12   : Travel Mileage Reimbursement
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-11
 * Last Mod.    : 2017-04-19
 * Due Date     : 2017-04-20
 */

public enum CityName {
    BOSTON("Boston"),
    CHICAGO("Chicago"),
    DALLAS("DALLAS"),
    RENO("Reno"),
    LOS_ANGELES("Los Angeles"),
    MIAMI("Miami"),
    NEW_ORLEANS("New Orleans"),
    TORONTO("Toronto"),
    VANCOUVER("Vancouver"),
    WASHDC("Washington DC");

    private final String city;
    
    private CityName(String newCity){
        this.city = newCity;
    }   // Ending bracket of CityName
    
    public String getCity(){
        return this.city;
    }   // Ending bracket of getCity method
        
}   // Ending bracket CityName class

    

