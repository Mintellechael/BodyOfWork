public class Song {
    String title;
    String artist;
    String producer;
    int year;
    double runTime;
    String album;
    String sample;
    public Sample sampled;

    public Song(String title, String artist, String producer, int year, double runTime, String album, String sample, Sample sampled) {
        this.title = title;
        this.artist = artist;
        this.producer = producer;
        this.year = year;
        this.runTime = runTime;
        this.album = album;
        this.sample = sample;
        this.sampled = sampled;


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

    public String getProducer() {

        return ("Producer : " + producer);
    }

    void getSample() {

        System.out.println("Sample : " + sample);
    }

    void getYear() {
        System.out.println("Year : " + year);
    }

    double getRunTime() {

        return runTime;
    }

    public String toString() {
        return "Title: " + title + " | Artist: " + artist + " | Album : " + album + "| Producer : " + producer + " | Sample :" + sample + " | Year: " + year + " | Runtime: " + runTime + "\n";
    }

    void printSample(){
        System.out.println(sampled);
    }

    public void frequentProducer(){

    }


}
