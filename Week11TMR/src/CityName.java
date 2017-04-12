/**
 * 
 */

/**
 * @author ar25
 *
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
    WASH_DC("Washington DC");

    private final String city;
    
    private CityName(String newCity){
        this.city = newCity;
    }   // Ending bracket of CityName
    
    public String getCity(){
        return this.city;
    }   // Ending bracket of getCity method
        
}   // Ending bracket CityName class

    

