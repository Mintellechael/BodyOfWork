import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;


public class User {
    String username;
    String password;
    String dateCreated;
    public ArrayList<Album> favAlbums;
    public ArrayList<Artist> favArtists;
    public ArrayList<Song> favSongs;
    public ArrayList<Sample> favSamples;

    public User (String username, ArrayList<Album> favAlbums, ArrayList<Artist> favArtists, ArrayList<Song> favSongs, ArrayList<Sample> favSamples) {
        this.username = username;
        this.password = password;
        this.dateCreated = dateCreated;
        this.favAlbums = favAlbums;
        this.favArtists = favArtists;
        this.favSongs = favSongs;
        this.favSamples = favSamples;
    }

    Scanner reader = new Scanner(System.in);

    void getUsername() {
        System.out.println("username : " + username);
    }

    void setPassword() {
        System.out.println("set your password");
        String pass = reader.next();
        System.out.println("confirm password");
        String pass2 = reader.next();

        if (pass.equals(pass2)) {
            this.password = pass;
            System.out.println("your password has been set successfully!");
        }
        else {
            System.out.println("passwords do not match!");
        }
    }

    void getDateCreated() {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Date created : " + date.format(now));
        this.dateCreated = date.format(now);
    }

    void verfiyUser() {
        if (!this.password.equals("")) {
            System.out.println("enter password please : ");
            String passVerfiy = reader.next();

            if (passVerfiy.equals(password)) {
                System.out.println("good to go!");
            }
        }

        else {
            System.out.println("password is incorrect!");
        }
    }

    public ArrayList<Album> getfavAlbumList() {
        return favAlbums;
    }

    public String albumToString() {
        String title = "";
        ArrayList<String> titles = new ArrayList<>();

        for (Album albumTitle : favAlbums) {
            title = albumTitle.title;
            titles.add(title);
        }
        return titles.toString();
    }

    public String artistsToString() {
        String name = "";
        ArrayList<String> names = new ArrayList<>();
        for (Artist artistName : favArtists) {
            name = artistName.name;
            names.add(name);
        }
        return names.toString();
    }

    public String songsToString() {
        String title;
        ArrayList<String> titles = new ArrayList<>();
        for (Song songName : favSongs) {
            title = songName.title;
            titles.add(title);
        }
        return titles.toString();
    }
}
