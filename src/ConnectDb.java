/**
 * ConnectDb --- this class sets up a db connection to my postgres database and inserts my applications
 * @author Luis Pena
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class ConnectDb {
    private String host;
    private String user;
    private String password;
    private String companyName;
    private String dateApplied;
    private String hiringManagerName;
    private String siteAppliedFrom;
    private String positionAppliedFor;
    //Constructor
    public ConnectDb(String companyName, String dateApplied, String hiringManagerName, String siteAppliedFrom, String positionAppliedFor){
        this.companyName = companyName;
        this.dateApplied = dateApplied;
        this.hiringManagerName = hiringManagerName;
        this.siteAppliedFrom = siteAppliedFrom;
        this.positionAppliedFor = positionAppliedFor;
    }

    private void getDbCreds() throws IOException {
        ArrayList<String> creds = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lp117\\IdeaProjects\\jobApp\\src\\config_file\\config.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                creds.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.host = creds.get(0);
        this.user = creds.get(1);
        this.password = creds.get(2);
    }

    public void connectToDb()
    {
        try {
            getDbCreds();
        }
        catch (Exception e){
            System.out.print("Error: " + e);
        }

        try {
            Connection conn = DriverManager.getConnection(host, user, password);
            System.out.println("Successful DB connection!");
            String query = "insert into public.jobApplications (companyname, dateapplied, hiringmanagername, siteappliedfrom," +
                    "gotreply, numofinterviews, hired, positionappliedfor) VALUES ('" + this.companyName + "','" + this.dateApplied + "','" +
                    this.hiringManagerName + "','" + this.siteAppliedFrom + "',null,null,null,'" + this.positionAppliedFor + "');";
            Statement stmt = conn.createStatement();
            System.out .println();

            int result = stmt.executeUpdate(query);

            if (result > 0) {
                System.out.println("Insert Successful");
            }
            else {
                System.out.println("Insert Failed");
            }
            conn.close();
        }
        catch (SQLException e) {
            System.out.println("DB connection error: " + e.getMessage());
        }
    }
}
