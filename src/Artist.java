import java.util.*;
public class Artist {
    String name;
    String homeTown;
    int yearDebut;
    private ArrayList<Album> albums;

    public Artist(String name, String homeTown, int yearDebut, ArrayList<Album> albums) {
        this.name = name;
        this.homeTown = homeTown;
        this.yearDebut = yearDebut;
        this.albums = albums;

    }

    void getName() {
        System.out.println("Name : " + name);
    }
    void getHomeTown() {
        System.out.println("Home Town : " + homeTown);
    }


    void getYearDebut() {
        System.out.println("Year Debuted :" + yearDebut);

    }

    public String toString() {
        return "Name: " + name + " Hometown: " + homeTown + " Year Debut: " + yearDebut + "\n";
    }

    public ArrayList<Album> printDiscography() {
        return albums;
    }


}
