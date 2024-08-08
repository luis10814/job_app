/**
 * Application --- A class that stores info about an online job application I
 * Completed
 * @author Luis Pena
 */
public class Application {
    private String companyName;
    private String appDate;
    private String hiringManagerName;
    private String siteApplied;
    private String positionAppliedFor;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public void setHiringManagerName(String hiringManagerName) {
        this.hiringManagerName = hiringManagerName;
    }

    public void setSiteApplied(String siteApplied) {
        this.siteApplied = siteApplied;
    }

    public void setPositionAppliedFor(String positionAppliedFor){
        this.positionAppliedFor = positionAppliedFor;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public String getAppDate(){
        return this.appDate;
    }

    public String getHiringManagerName(){
        return this.hiringManagerName;
    }

    public String getSiteApplied(){
        return this.siteApplied;
    }

    public String getPositionAppliedFor(){
        return this.positionAppliedFor;
    }

    public String toString(){
        return "Company: " + companyName + "   Date Applied: " + appDate + "   Hiring Manager: " + hiringManagerName
                + "   Site Applied From: " + siteApplied;
    }
}
