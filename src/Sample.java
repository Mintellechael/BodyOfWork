public class Sample {
    String title;
    String artist;
    String producer;
    int year;
    double runTime;
    String album;


    public Sample(String title, String artist, String producer, int year, double runTime, String album) {
        this.title = title;
        this.artist = artist;
        this.producer = producer;
        this.year = year;
        this.runTime = runTime;
        this.album = album;


    }


    void getTitle() {

        System.out.println("Title : " + title);
    }

    void getArtist() {

        System.out.println("Artist : " + artist);
    }

    void getAlbum() {

        System.out.println("Album : " + album);
    }

    void getProducer() {

        System.out.println("Producer : " + producer);
    }


    void getYear() {
        System.out.println("Year : " + year);
    }

    double getRunTime() {

        return runTime;
    }

    public String toString() {
        return "Title: " + title + " | Artist: " + artist + " | Album : " + album + "| Producer : " + producer + " | Year: " + year + " | Runtime: " + runTime + "\n";
    }



}
