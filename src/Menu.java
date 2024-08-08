/**
 * Menu --- A class that displays a menu in cli and grabs user input
 * @author Luis Pena
 */

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    private String companyName;
    private String dateApplied;
    private String hiringManager;
    private String siteApplied;
    private String positionAppliedFor;

    public void displayMenu() {
        System.out.println("Enter the Company name: ");
        this.companyName = input.nextLine();
        System.out.println("Enter date applied: ");
        this.dateApplied = input.nextLine();
        System.out.println("Enter the hiring managers name: ");
        this.hiringManager = input.nextLine();
        System.out.println("Enter site applied from: ");
        this.siteApplied = input.nextLine();
        System.out.println("What position did you apply too: ");
        this.positionAppliedFor = input.nextLine();
    }

    public String getCompanyName(){
        return this.companyName;
    }
    public String getDateApplied(){
        return this.dateApplied;
    }
    public String getHiringManager(){
        return this.hiringManager;
    }
    public String getSiteApplied(){
        return this.siteApplied;
    }
    public String getPositionAppliedFor(){
        return this.positionAppliedFor;
    }

}
