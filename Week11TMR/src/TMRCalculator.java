
/**
 * Class        : TMRCalculator
 * Project 12   : Travel Mileage Reimbursement
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-11
 * Last Mod.    : 2017-04-19
 * Due Date     : 2017-04-20
 */
public class TMRCalculator {
    
    // Declare variables
    private static int mileage;
    private static double reimbursement;
    
    // Define constructor
    TMRCalculator(int newMileage){
        this.mileage = this.mileage + newMileage;
    }   // Ending bracket of TMRCalculator constructor
    
    // Define constructor
    TMRCalculator(double newRate, int newMiles){
        this.reimbursement = (newRate * newMiles)/100;
    }   // Ending bracket of TMRCalculator constructor

    /**
     * @return the mileage
     */
    public static int getMileage() {
        return mileage;
    }   // Ending bracket of getMileage

    /**
     * @param mileage the mileage to set
     */
    public static void setMileage(int mileage) {
        TMRCalculator.mileage = mileage;
    }   // Ending bracket of setMileage

    /**
     * @return the reimbursement
     */
    public static double getReimbursement() {
        return reimbursement;
    }   // Ending bracket of getReimbursement

    /**
     * @param reimbursement the reimbursement to set
     */
    public void setReimbursement(double reimbursement) {
        this.reimbursement = reimbursement;
    }   // Ending bracket of setReimbursement

}	// End bracket of TMRCalculator class
