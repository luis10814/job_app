/**
 * This program will grab input about a job application I applied for
 * and create an object with the data. All the data will then be stored
 * on a postgresql database, so I can go back and review every company I
 * applied for and success rates.
 * @author Luis Pena
 * @exception
 * @return
 */

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        Menu menu = new Menu();

        //Call the menu and get inputs
        menu.displayMenu();

        //store input in object
        app.setCompanyName(menu.getCompanyName());
        app.setAppDate(menu.getDateApplied());
        app.setHiringManagerName(menu.getHiringManager());
        app.setSiteApplied(menu.getSiteApplied());
        app.setPositionAppliedFor(menu.getPositionAppliedFor());

        // connect to the db and insert all the data
        ConnectDb newConnection = new ConnectDb(app.getCompanyName(), app.getAppDate(), app.getHiringManagerName(), app.getSiteApplied(), app.getPositionAppliedFor());
        newConnection.connectToDb();
    }
}