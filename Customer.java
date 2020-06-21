
/**
 * Each instance of this class represents one of Uncle Phil's customers.  
 * 
 * @author Andrew Nuxoll and Jonathan Liao
 * @version 3.2.2015
 */
public class Customer
{
    /* ---=== Instance Variables ===--- */
    private String nickname;
    private String description;
    private int visitTime;  //hour of the day on 24 hour clock
    private boolean daily; //does this customer visit every day?
    private boolean poverty; //does this person live in poverty?

    /* ---=== Methods ===--- */

    public Customer(String initNickname, int initVisitTime, boolean initDaily, boolean initPoverty)
    {
        nickname = initNickname;
        visitTime = initVisitTime;
        daily = initDaily;
        description = "";
        //%%%YOU WILL COMPLETE THIS METHOD
    }//ctor
    
    public void printSummary() {
        System.out.println("Nickname: " + this.nickname);
        System.out.println("Description: " + this.description);
        System.out.println("Visit Time: " + this.visitTime);
        System.out.println("Daily Visit?: " + this.daily);
        System.out.println("Live in poverty?: " + this.poverty);
    }
    
    /** accessor for daily */
    public boolean isDaily()
    {
        return daily;
    }
    
    public void fillDescription(String initDescription) {
        description = initDescription;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setVisitTime(int newTime) {
        visitTime = newTime;
    }
    
}//class Customer
