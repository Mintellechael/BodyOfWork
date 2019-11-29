import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class databaseConnection {
    public Connection connection = null;

    public databaseConnection() {


        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bow", "root", "noworryGLORY7");
            System.out.println("Connection Successful");
        } catch (
                Exception ex) {
            ex.printStackTrace();
        }
    }


    public void InsertAllAlbums(String title, String artist, Integer year, Double runTime, Integer albumSales) {
        PreparedStatement pst = null;


        try {
            pst = connection.prepareStatement("INSERT INTO albums (title,artist,year,runTime,albumSales) VALUES (?,?,?,?,?)");
            pst.setString(1, title);
            pst.setString(2, artist);
            pst.setInt(3, year);
            pst.setDouble(4, runTime);
            pst.setInt(5, albumSales);
            pst.executeUpdate();

            System.out.println("Inserted successfully");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}