import java.util.*;
public class Album {
    String title;
    String artist;
    int year;
    double runTime;
    int albumSales;
    public ArrayList<Song> songs;

    public Album(String title, String artist, int year, double runTime,int albumSales,ArrayList <Song> songs) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.runTime = runTime;
        this.albumSales = albumSales;
        this.songs = songs;

    }

    void getTitle() {
        System.out.println("Title : " + title);
    }

    void getArtist() {
        System.out.println("Artist : " + artist);
    }

    void getYear() {
        System.out.println("Year : " + year);
    }

    void getRunTime() {
        System.out.println("Run Time :" + runTime);

    }

    void getAlbumSales() {
        System.out.println("Album Sales : " + albumSales);
    }



    public String toString() {
        return "Title: " + title + " |" + " Artist: " + artist + " |" + " Year: " + year + " |" + " Runtime: " + runTime + " min \n";
    }

    public ArrayList<Song> printSongs() {

        return songs;
    }

    void songlist() {
        for (int v = 1; v <= songs.size();v++) {
            System.out.println(v + " " + songs.get(v-1).title);
        }
    }

    public String percentageOfAlbumSampled (ArrayList<Song> songs) {
        double totalSongs = this.songs.size();
        double sampledSongs = 0;

        for (int m = 0; m < songs.size(); m++ ) {
            if (songs.get(m).sample.equals("")) {

            }
            else {
                sampledSongs++;
            }
        }
        double decimalToConvert = sampledSongs/totalSongs;
        return  decimalToConvert * 100 + "%" + " of " + this.title + " songs use samples!";
    }

}














