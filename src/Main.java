import java.util.*;

public class Main {

    // method that allows you to find the most frequent producer of an album
    // starts with first element and compares to other elements. if there is a match
    // count will increase. element with greatest count will be printed at the end
    // if producers are only on there once, print no reoccuring producer
    // ** could this be faster using a hashmap or another approach?... what is the O notation?  ANSWER : O(n)


    public static void findFrequentProducer(ArrayList<Object> array) {

        String element = "";                                        // holds name of producer
        int count = 0;                                              // keeps count of producer on album

        for (int m = 0; m < array.size(); m++) {                // for loop that compares one element at a time in an array to the rest of elements in a separate, but identical array

            String currentElement = array.get(m).toString();        // holds the one element that will be compared to other elements
            int currentCount = 0;                                   // will hold the count of the one element being compared to the rest

            for (int p = 0; p < array.size(); p++) {                // for loop that scans same array and compares all to the current element

                if (array.get(p).toString().equals(currentElement)) {       // if the element being compared equals the current element

                    currentCount++;

                    if (currentCount > count) { // if count of element being compared is greater than initial count, it becomes the most frequent element until another greater count comes along

                        element = currentElement;
                        count = currentCount;
                    }

                }
            }
        }


        if (count == 1) {                                            // if count of the most frequent equals one that means that no producer occurs more than  once
            System.out.println("no reoccuring producers");
        } else {
            System.out.printf("Most frequent " + element + "\n");   // prints current element
        }

    }  // end of frequent producer method


    // ______________________________________________________________________________________________


    // method that prints a menu for the user to interact with

    public static void menu() {
        System.out.println("1. Add Album");
        System.out.println("2. View Artists");
        System.out.println("3. View Albums - View Song Samples");
        System.out.println("4. View Songs");
        System.out.println("5. View Samples ");
        System.out.println("6. Add albums to your fav albums list");
        System.out.println("7. Add artists to your fav artists list");
        System.out.println("8. Add songs to your fav songs list");
        System.out.println("9. Remove from fav albums list");
        System.out.println("10. Remove from fav artists list");
        System.out.println("11. Remove from fav songs list");
        System.out.println("12. Sort Albums by year of release");
        System.out.println("13. Sort Albums by album sales");
        System.out.println("14. Exit");




    }

    // _____________________________________________________________________________________________





    //__________________________________________________ ALL METHODS LIVE ABOVE _____________________________________________________________________________







    // ________________________________________ MAIN BEGINS _________________________________________________________________________________

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);


        ArrayList<Artist> allArtists = new ArrayList<>();   //creates array of all artists available on BOW

        ArrayList<Album> allAlbums = new ArrayList<>();     //creates array of all albums available on BOW

        ArrayList<Song> allSongs = new ArrayList<>();       //creates array of all songs available on BOW

        ArrayList<Sample> allSamples = new ArrayList<>();   // creates array of all samples  used


//        --------------------------------------------------------------------------------------------------------------------------------------

        // ________________________________________ SAMPLES LIVE HERE ___________________________________________________________________________

        // create samples for songs on Reasonable Doubt

        Sample none = new Sample("", "", "", 0, 0, "");

        Sample cantknockSamp = new Sample("Fool's Paradise", "Me'lissa Morgan", "Lesette Wilson & Me'lissa Morgan", 1986, 4.56, "Do Me Baby");
        Sample politicsSamp = new Sample("Hurry Up this Way Again", "The Stylistics", "Ian DewHirst", 1979, 5.53, "Hurry Up This Way Again");
        Sample brooklynSamp = new Sample("Ecstacy", "Ohio Players", "N/A", 1973, 2.29, "Ecstacy");
        Sample deadSamp = new Sample("A Garden of Peace", "Lonnie Liston Smith", "Lonnie & Marcus Miller", 1983, 3.09, "Dreams of Tomorrow");
        Sample feelinSamp = new Sample("Pastures", "Ahmad Jamal", "Ahmad Jama", 1974, 1.09, "Jamal Plays Jamal");
        Sample devilsSamp = new Sample("Go Home", "Allen Touissant", "Allen Toussaint", 1965, 3.00, "Sings With Billy Fayard and the Stokes");
        Sample twoSamp = new Sample("Blue Wind", "John Kaizan Neptune", "Yuji Hashimoto, Shoichiro Ono", 1981, 5.28, "Bamboo");
        Sample caniSamp = new Sample("The Look of Love", "Isaac Hayes", "Isaac Hayes", 1970, 11.15, "... To Be Continued");
        Sample aintnoSamp = new Sample("Seven Minutes of Funk", "The Whole Darn Family", " August Moon, Tyrone Thomas", 1976, 7.15, "Has Arrived");
        Sample friendSamp = new Sample("Hey, What's That You Say", "Brother to Brother", "Al Goodman", 1974, 2.49, "In the Bottle");
        Sample comingSamp = new Sample("Inside You", "Eddie Henderson", "Skip DrinkWater", 1976, 4.49, "Heritage");
        Sample cashmereSamp = new Sample("Save Their Souls", "Hamilton Bohannon", "Hamilton Bohannon", 1973, 4.54, "Stop & Go");
        Sample bringitSamp = new Sample("1,2 Pass It", "D&D All-Stars", "DJ Premier", 1995, 4.55, "The D&D Project");
        Sample regretSamp = new Sample("It's So Easy Loving You", "Hubert Laws and Earl Klugh", "Don Hahn, Patrick Williams", 1980, 3.56, "How to Beat the High Cost of Living OST");


        // adds all reasonable doubt samples to all samples array

        allSamples.add(cantknockSamp);
        allSamples.add(politicsSamp);
        allSamples.add(brooklynSamp);
        allSamples.add(deadSamp);
        allSamples.add(feelinSamp);
        allSamples.add(devilsSamp);
        allSamples.add(twoSamp);
        allSamples.add(caniSamp);
        allSamples.add(aintnoSamp);
        allSamples.add(friendSamp);
        allSamples.add(comingSamp);
        allSamples.add(cashmereSamp);
        allSamples.add(bringitSamp);
        allSamples.add(regretSamp);


        // create Kid Cudi Man on the Moon Samples


        Sample inMyDreamsSamp = new Sample("Biceps", "Garnegy & Maties", "Garnegy & Maties", 1983, 1.45, "Sport Music II");
        // no sample for Soundtrack 2 my life
        Sample simpleAsSamp = new Sample("Orchestral Manoeuvres In The Dark", "ABC Auto-Industry", "Orchestral Manoeuvres In The Dark, Rhett Davies", 1983, 2.06, "Dazzle Ships");
        Sample soloSamp = new Sample("The Traitor", "Menahan Street Band", "Thomas Brenneck", 2008, 2.43, "Make the Road by Walking");
        // no sample for heartofalion
        Sample myWorldSamp = new Sample("All What I Have", "Le Système Crapoutchik", "Le Système Crapoutchik", 1971, 3.07, "Flop");
        //no sample for dayandnite
        //no sample for sky might fall
        //no sample for entergalactic
        Sample aliveSamp = new Sample("Refugee", "Tom Petty and the Heartbreakers", "Jimmy Iovine, Tom Petty", 1979, 3.23, "Damn the Torpedoes");
        // no sample for cudiZone
        Sample makeHerSaySamp = new Sample("Poker Face", "Lady Gaga", "Martin Kierszenbaum", 2009, 3.32, "The Cherrytree Sessions EP");
        // no sample for purusit of happiness
        Sample hyerrSamp = new Sample("Early Morning Love", "Lou Rawls", "Gamble & Huff", 1977, 5.35, "Unmistakably Lou");
        // no sample for upUp and away


        // add all man on the moon samples to allSamples array


        allSamples.add(inMyDreamsSamp);
        allSamples.add(simpleAsSamp);
        allSamples.add(soloSamp);
        allSamples.add(myWorldSamp);
        allSamples.add(aliveSamp);
        allSamples.add(makeHerSaySamp);
        allSamples.add(hyerrSamp);



        // create Rapsody Lailas Wisdom Samples

        Sample lailaSamp = new Sample("Young,Gifted and Black", "Aretha Franklin", "Tom Dowd, Arif Mardin, Jerry Wexler", 1972, 3.34, "Young, Gifted and Black");
        Sample powerSamp = new Sample("May the Force be With You", "Booty's Rubber Band", "George Clinton, Bootsy Collins", 1978, 6.07, "Bootsy? Player of the Year");
        //no sample for chrome
        Sample payUpSamp = new Sample("Jamiroquai", "Canned Heat", "Al Stone", 1999, 5.31, "Synkronized");
        Sample ridinSamp = new Sample("Teasing You", "Andre Solomko", "Andre Solomko", 2014, 7.43, "Le Polaroid");
        //no sample for sassy
        Sample nobodySamp = new Sample("Nobody", "Moonchild", "Moonchild", 2015, 3.57, "Please Rewind");
        Sample blackSamp = new Sample("I Surrender", "Tweet", "Craig Brockman, Charlie Bereal, Jairus 'J-Mo' Mozee", 2016, 2.42, "Charlene");
        Sample youShouldSamp = new Sample("Cell Therapy", "Goodie Mob", "Organized Noize", 1995, 4.45, "Soul Food");
        Sample rollercoasterSamp = new Sample("Holy Smokes & Gee Whiz", "Tony Toni Tone", "Dwayne Wiggins", 1996, 5.05, "House of Music");
        // no sample for uUsed 2 love me
        Sample knockSamp = new Sample("June", "Gianni Marchetti", "Gianni Marchetti", 1978, 4.50, "Solstitium");
        // no sample for oooWeee
        Sample jesSamp = new Sample("Time to Go Home", "Otis G Johnson", "Otis G Johnson", 1978, 4.25, "Everything - God Is Love 78");


        // add lailas wisdom samples to allSamples array

        allSamples.add(lailaSamp);
        allSamples.add(powerSamp);
        allSamples.add(payUpSamp);
        allSamples.add(ridinSamp);
        allSamples.add(nobodySamp);
        allSamples.add(blackSamp);
        allSamples.add(youShouldSamp);
        allSamples.add(rollercoasterSamp);
        allSamples.add(knockSamp);
        allSamples.add(jesSamp);


        // ___________________________________________________ SAMPLES END _____________________________________________________


        // ___________________________________________________ SONGS LIVE HERE __________________________________________________


        // REASONABLE DOUBT ALBUM : all songs

        Song cantKnock = new Song("Can't Knock the Hustle", "Jay-Z", "Knobody,Sean Cane,Dahoud", 1996, 5.14, "Reasonable Doubt", "Melissa Morrgan", cantknockSamp);
        Song politics = new Song("Politics As Usual", "Jay-Z", "Ski", 1996, 3.41, "Reasonable Doubt", "Stylistics", politicsSamp);
        Song brooklyn = new Song("Brooklyn's Finest", "Jay-Z", "Clark Kent & Dame Dash", 1996, 4.36, "Reasonable Doubt", "Ohio Players", brooklynSamp);
        Song deadpres = new Song("Dead Presidents II", "Jay-Z", "Ski", 1996, 4.27, "Reasonable Doubt", "Lonnie Liston Smith", deadSamp);
        Song feelinIt = new Song("Feelin' It ", "Jay-Z", "Ski", 1996, 3.48, "Reasonable Doubt", "Ahmad Jamal", feelinSamp);
        Song devils = new Song("D'Evils", "Jay-Z", "DJ Premier", 1996, 3.31, "Reasonable Doubt", "Allen Toussaint", devilsSamp);
        Song twoTwo = new Song("22 Two's", "Jay-Z", "Ski", 1996, 3.29, "Reasonable Doubt", "John Kaizan Neptune", twoSamp);
        Song canI = new Song("Can I Live ", "Jay-Z", "DJ Irv", 1996, 4.10, "Reasonable Doubt", "Issac Hayes", caniSamp);
        Song aintno = new Song("Aint No Nigga", "Jay-Z", "Big Jaz", 1996, 4.03, "Reasonable Doubt", "The Whole Darn Family", aintnoSamp);
        Song friendOR = new Song("Friend or Foe", "Jay-Z", "Dj Premier", 1996, 1.49, "Reasonable Doubt", "Brother to Brother", friendSamp);
        Song comingOf = new Song("Coming of Age", "Jay-Z", "Clark Kent", 1996, 3.59, "Reasonable Doubt", "Eddie Henderson", comingSamp);
        Song cashmere = new Song("Cashmere Thoughts", "Jay-Z", "Clark Kent", 1996, 2.56, "Reasonable Doubt", "Hammilton Bohannon", cashmereSamp);
        Song bringIt = new Song("Bring It On", "Jay-Z", "DJ Premier", 1996, 5.01, "Reasonable Doubt", "D&D All Stars", bringitSamp);
        Song regret = new Song("Regrets", "Jay-Z", "Peter Panic", 1996, 4.34, "Reasonable Doubt", "Hurbert Laws and Earl Klugh", regretSamp);

        // create an array to hold reasonable doubt songs
        // and adds all reasonable songs to it


        ArrayList<Song> rdSongs = new ArrayList<>();
        rdSongs.add(cantKnock);
        rdSongs.add(politics);
        rdSongs.add(brooklyn);
        rdSongs.add(deadpres);
        rdSongs.add(feelinIt);
        rdSongs.add(devils);
        rdSongs.add(twoTwo);
        rdSongs.add(canI);
        rdSongs.add(aintno);
        rdSongs.add(friendOR);
        rdSongs.add(comingOf);
        rdSongs.add(cashmere);
        rdSongs.add(bringIt);
        rdSongs.add(regret);


        // MAN ON THE MOON : THE END OF DAY - ALL SONGS
        Song inMyDreams = new Song("In My Dreams", "Kid Cudi","Haynie", 2009, 3.19,"Man on the Moon : The End of Day", "",inMyDreamsSamp);
        Song soundTrack = new Song("Soundtrack 2 My Life", "Kid Cudi","Haynie", 2009, 3.56,"Man on the Moon : The End of Day", "",none);
        Song simpleAs = new Song("Simple As...", "Kid Cudi","Plain Pat", 2009, 2.31,"Man on the Moon : The End of Day", "",simpleAsSamp);
        Song soloDolo = new Song("Solo Dolo", "Kid Cudi","Haynie", 2009, 4.26,"Man on the Moon : The End of Day", "",soloSamp);
        Song heartLion = new Song("Heart of a Lion", "Kid Cudi","Free School", 2009, 4.21,"Man on the Moon : The End of Day", "",none);
        Song myWorld = new Song("My World", "Kid Cudi","Plain Pat & Bhasker", 2009, 4.03,"Man on the Moon : The End of Day", "",myWorldSamp);
        Song dayNite = new Song("Day n Nite", "Kid Cudi","Dot da Genius & Kid Cudi", 2009, 3.41,"Man on the Moon : The End of Day", "",none);
        Song skyFall = new Song("Sky Might Fall", "Kid Cudi","Kanye West & Kid Cudi", 2009, 3.41,"Man on the Moon : The End of Day", "",none);
        Song enterGalactic = new Song("Enter Galactic", "Kid Cudi","Friedman", 2009, 4.20,"Man on the Moon : The End of Day", "",none);
        Song alive = new Song("Alive", "Kid Cudi","Ratatat", 2009, 4.07,"Man on the Moon : The End of Day", "",aliveSamp);
        Song cudiZone = new Song("Cudi Zone", "Kid Cudi","Haynie", 2009, 4.19,"Man on the Moon : The End of Day", "",none);
        Song makeHer = new Song("Make Her Say", "Kid Cudi","Kanye West", 2009, 3.36,"Man on the Moon : The End of Day", "",makeHerSaySamp);
        Song pursuit = new Song("Pursuit of Happiness", "Kid Cudi","Ratatat", 2009, 4.55,"Man on the Moon : The End of Day", "",none);
        Song hyyer = new Song("Hyyer", "Kid Cudi","Crada", 2009, 3.32,"Man on the Moon : The End of Day", "",hyerrSamp);
        Song up = new Song("Up Up & Away", "Kid Cudi","Free School", 2009, 3.47,"Man on the Moon : The End of Day", "",none);

        // create an array that holds man on the moon songs
        // adds all man on the moon songs to array

        ArrayList<Song> manSongs = new ArrayList();
        manSongs.add(inMyDreams);
        manSongs.add(soundTrack);
        manSongs.add(simpleAs);
        manSongs.add(soloDolo);
        manSongs.add(heartLion);
        manSongs.add(myWorld);
        manSongs.add(dayNite);
        manSongs.add(skyFall);
        manSongs.add(enterGalactic);
        manSongs.add(alive);
        manSongs.add(cudiZone);
        manSongs.add(makeHer);
        manSongs.add(pursuit);
        manSongs.add(hyyer);
        manSongs.add(up);




        // LAILA's WISDOM - ALL SONGS
        Song lailaWisdom = new Song("Laila's Wisdom", "Rapsody","Nottz", 2017, 3.14,"Laila's Wisdom", "",lailaSamp);
        Song power = new Song("Power", "Rapsody","9th Wonder", 2017, 5.34,"Laila's Wisdom", "",powerSamp);
        Song chrome = new Song("Chrome", "Rapsody","Khrysis & Kash Dont Make Beats", 2017, 3.27,"Laila's Wisdom", "",none);
        Song payUp = new Song("Pay Up", "Rapsody","Khrysis & Kash Dont Make Beats", 2017, 3.16,"Laila's Wisdom", "",payUpSamp);
        Song ridin = new Song("Ridin", "Rapsody","9th Wonder & Eric G", 2017, 4.51,"Laila's Wisdom", "",ridinSamp);
        Song sassy = new Song("Sassy", "Rapsody","Eric G", 2017, 3.13,"Laila's Wisdom", "",none);
        Song nobody = new Song("Nobody", "Rapsody","Khrysis & 9th Wonder", 2017, 7.27,"Laila's Wisdom", "",nobodySamp);
        Song blackUgly = new Song("Black & Ugly", "Rapsody","9th Wonder", 2017, 4.09,"Laila's Wisdom", "",blackSamp);
        Song youShould = new Song("You Should Know", "Rapsody","9th Wonder", 2017, 6.17,"Laila's Wisdom", "",youShouldSamp);
        Song rollerCoaster = new Song("A Rollercoaster Jam Called Love", "Rapsody","9th Wonder", 2017, 5.18,"Laila's Wisdom", "",rollercoasterSamp);
        Song uUsed = new Song("U used 2 Love Me", "Rapsody","9th Wonder", 2017, 2.42,"Laila's Wisdom", "",none);
        Song knockOn = new Song("Knock on My Door", "Rapsody","9th Wonder", 2017, 4.41,"Laila's Wisdom", "",knockSamp);
        Song owee = new Song("OooWee", "Rapsody","Khrysis", 2017, 4.01,"Laila's Wisdom", "",none);
        Song jesusComing = new Song("Jesus Coming", "Rapsody","9th Wonder", 2017, 6.19,"Laila's Wisdom", "",jesSamp);



        // create an array that holds lailas wisdom songs
        // and adds all lalia songs

        ArrayList<Song> lailaSongs = new ArrayList();
        lailaSongs.add(lailaWisdom);
        lailaSongs.add(power);
        lailaSongs.add(chrome);
        lailaSongs.add(payUp);
        lailaSongs.add(ridin);
        lailaSongs.add(sassy);
        lailaSongs.add(nobody);
        lailaSongs.add(blackUgly);
        lailaSongs.add(youShould);
        lailaSongs.add(rollerCoaster);
        lailaSongs.add(uUsed);
        lailaSongs.add(knockOn);
        lailaSongs.add(owee);
        lailaSongs.add(jesusComing);


        // Add each albums songs to the allSongs array

        for (int a = 0; a < rdSongs.size(); a++) {
            allSongs.add(rdSongs.get(a));
        }

        for (int a = 0; a < rdSongs.size(); a++) {
            allSongs.add(manSongs.get(a));
        }

        for (int a = 0; a < rdSongs.size(); a++) {
            allSongs.add(lailaSongs.get(a));
        }



        // ________________________________________________ SONGS END HERE _______________________________________________________________




        // ________________________________________________ ALBUMS LIVE HERE ______________________________________________________________



        // create reasonable doubt album that has reasonable doubt songs
        // and adds it to allAlbums array

        Album rd = new Album("Reasonable Doubt", "Jay-Z", 1996, 55.32,1500000, rdSongs);
        allAlbums.add(rd);

        // create man on the moon album that contains man on the moon songs
        // and adds it to allAlbums array

        Album motm = new Album("Man on the Moon: The End of Day","Kid Cudi", 2009,58.29, 860000, manSongs);
        allAlbums.add(motm);

        // create lailas wisdom album
        // and adds it to allAlbums array
        Album lw = new Album("Laila's Wisdom","Rapsody", 2017,64.29,200000, lailaSongs);
        allAlbums.add(lw);


        // _________________________________________ ALBUMS END HERE ________________________________________________________



        // ______________________________________________ DISCOGRAPGHIES LIVE HERE ________________________________________________________

        // creates a jay z  discography array and
        // then adds all artists albums

        ArrayList<Album> jzDiscogrophy = new ArrayList<>();
        jzDiscogrophy.add(rd);

        // creates a kid cudi discography array and
        // then adds all artists albums

        ArrayList<Album> cudiDiscogrophy = new ArrayList<>();
        cudiDiscogrophy.add(motm);

        // creates a rapsody discography array and
        // then adds all artists albums

        ArrayList<Album> rapDiscogrophy = new ArrayList<>();
        rapDiscogrophy.add(lw);



        // _________________________________________ DISCOGRAGHIES END HERE ________________________________________________________



        // _________________________________________ ARTISTS LIVE HERE________________________________________________________

        // creates Jay-z who has a list of albums which is his discography
        // adds jayz to allArtists array

        Artist jz = new Artist("Jay-Z", "Brooklyn, New York", 1996, jzDiscogrophy);
        allArtists.add(jz);

        // creates kid cudi who has a list of albums which is his discography
        // adds cudi to allArtists array


        Artist cudi = new Artist("Kid Cudi", "Cleveland, Ohio", 2009, cudiDiscogrophy);
        allArtists.add(cudi);

        // creates rapsody who has a list of albums which is his discography
        // adds rapsody to allArtists array

        Artist rapsody = new Artist("Rapsody", "Snow Hill, North Carolina", 2017, rapDiscogrophy);
        allArtists.add(rapsody);



        // _______________________________________ ARTISTS END HERE ___________________________________________________________





        //  ---------------------------------- CODE HERE ----------------------------------------------------------------------

        // create list for fav albums, songs, and samples to be added to

        ArrayList<Album> favAlbumList = new ArrayList<>();
        ArrayList<Artist> favArtistList = new ArrayList<>();
        ArrayList<Song> favSongList = new ArrayList<>();
        ArrayList<Sample> favSampleList = new ArrayList<>();

        User mikey = new User("mikey",favAlbumList, favArtistList, favSongList, favSampleList);



        System.out.println(" ___________________________________________");


        // a menu is printed and user while enter a number that will enact the cases below and continue to compile when they are done.
        // an empty array is created just in case a user decides to add an album

        ArrayList<Album> addedAlbums = new ArrayList<>();
        ArrayList<Song> albumSongs = new ArrayList<>();
        String newArtist = "";


        String username = "";
        String password = "";
        menu();


        int choice = reader.nextInt();   // choice is the number a user enters that corresponds with an action in the menu

        do {

            switch (choice) {

                // ________________________________________________ Create Album ____________________________________________________


                case 1:

                    System.out.println("username :");
                    username = reader.next();

                    System.out.println("password : ");
                    password = reader.next();


                    if (!password.equals("mikeyyy")) {
                        System.out.println("you don't have permission to add albums");
                        break;
                    } else {


                        System.out.println("Album Title :");
                        String albumTitle = reader.next();

                        System.out.println("Album Artist :");
                        String albumArtist = reader.next();

                        System.out.println("Album Year :");
                        int albumYear = reader.nextInt();

                        System.out.println("Album Runtime :");
                        double albumRuntime = reader.nextDouble();

                        int albSales = 134;

                        Album x = new Album(albumTitle, albumArtist, albumYear, albumRuntime, albSales, albumSongs);
                        newArtist = albumArtist;


                        //                _________________________________________________ ADD SONGS ____________________________________________________________

                        System.out.println("How many songs are on the album ? : ");
                        int amountOfSongs = reader.nextInt();


                        for (int m = 0; m < amountOfSongs; m++) {

                            System.out.println("Song Title :");
                            String songTitle = reader.next();

                            String songArtist = x.artist;

                            System.out.println("Song Producer : ");
                            String songProducer = reader.next();

                            int songYear = x.year;

                            System.out.println("Song Runtime :");
                            double songRuntime = reader.nextDouble();

                            System.out.println("Album Sales :");
                            int albuSales = reader.nextInt();

                            String songAlbum = x.title;

                            String songSample = "none";

                            Sample songSampled = none;
                            Song z = new Song(songTitle, songArtist, songProducer, songYear, songRuntime, songAlbum, songSample, songSampled);
                            albumSongs.add(z);
                        }


                        addedAlbums.add(x);


                        System.out.println("Album added ! \n " + x);

                    }

                    System.out.println("return to menu? - yes or no");
                    String backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                        choice = 14;
                        break;
                    }


                case 2:   // PRINTS ALL ARTIST

                    System.out.println(allArtists);

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }

                    else {
                    choice = 14;
                    break;
                }


                case 3:   // PRINTS ALL ALBUMS & ALLOWS USER TO OPEN ALBUM AND SEE SAMPLE

                    for (int v = 1; v <= allAlbums.size(); v++) {
                        System.out.println(v + " " + allAlbums.get(v - 1).title);
                    }

                    System.out.println("Which album would you like to open?");
                    int openAlbum = reader.nextInt();

                    System.out.println("songs from album :");

                    allAlbums.get(openAlbum - 1).songlist();

                    System.out.println("which song do you want to see a sample for?");
                    int getSample = reader.nextInt();

                    allAlbums.get(openAlbum - 1).songs.get(getSample - 1).printSample();


                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    } else {
                        choice = 14;
                        break;
                    }

                    break;

                case 4:
                    System.out.println(allSongs);

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                        choice = 14;
                        break;
                    }
                    break;

                case 5:
                    System.out.println(allSamples);

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    } else {
                        choice = 14;
                        break;
                    }

                case 6:   // Favorite album list
                    int albumid = 1;

                    System.out.println("here is your list of favorite albums : \n" + favAlbumList);

                    for (int s = 0; s < allAlbums.size(); s++) {
                        System.out.println(albumid + " " + allAlbums.get(s));
                        albumid++;
                    }


                    for (int z = 0; z < allAlbums.size(); z++) {
                        System.out.println("what album do you want to add to your list");
                        int albumChoice = reader.nextInt();
                        int albumID = albumChoice - 1;
                        favAlbumList.add(allAlbums.get(albumID));

                        System.out.println("Are you still adding?");
                        String answer = reader.next();

                        if (answer.equals("no")) {
                            break;
                        }

                    }

                    System.out.println("here is your UPDATED list of favorite albums : \n" + mikey.albumToString());

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    } else {
                        choice = 14;
                        break;
                    }

                case 7:   // Favorite artist list

                    int artistid = 1;

                    System.out.println("here is your list of favorite artists : \n" + favArtistList);

                    for (int s = 0; s < allArtists.size(); s++) {
                        System.out.println(artistid + " " + allArtists.get(s));
                        artistid++;
                    }


                    for (int z = 0; z < allArtists.size(); z++) {
                        System.out.println("what artist do you want to add to your list");
                        int artistChoice = reader.nextInt();
                        int artistID = artistChoice - 1;
                        favArtistList.add(allArtists.get(artistID));

                        System.out.println("Are you still adding?");
                        String response = reader.next();

                        if (response.equals("no")) {
                            break;
                        }
                    }

                    System.out.println("here is your UPDATED list of favorite artists : \n" + mikey.artistsToString());
                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                        choice = 14;
                        break;
                    }

                case 8:  // favorite song list

                    int songid = 1;

                    System.out.println("here is your list of favorite songs : \n" + favSongList);

                    for (int s = 0; s < allSongs.size(); s++) {
                        System.out.println(songid + " " + allSongs.get(s));
                        songid++;
                    }


                    for (int z = 0; z < allSongs.size(); z++) {
                        System.out.println("what song do you want to add to your list");
                        int songChoice = reader.nextInt();
                        int songID = songChoice - 1;
                        favSongList.add(allSongs.get(songID));

                        System.out.println("Are you still adding?");
                        String response = reader.next();

                        if (response.equals("no")) {
                            break;
                        }
                    }
                    System.out.println(favSongList);
                    System.out.println("here is your UPDATED list of favorite songs : \n" + mikey.songsToString());

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                    choice = 14;
                    break;
                    }

                    break;

                case 9: // Remove from favorite album list

                    mikey.favAlbums.add(rd);
                    System.out.println(mikey.favAlbums);
                    System.out.println("what album do you want to remove from the list?");
                    int remove = reader.nextInt();
                    int albumRemove = remove - 1;
                    mikey.favAlbums.remove(mikey.favAlbums.get(albumRemove));

                    System.out.println("here is your new list : \n");
                    System.out.println(mikey.favAlbums);

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }

                    else {
                        choice = 14;
                        break;
                    }

                case 10: // Remove from favorite artist list

                    mikey.favArtists.add(jz);
                    System.out.println(mikey.favArtists);
                    System.out.println("what artist do you want to remove from the list?");
                    int removeArtist = reader.nextInt();
                    int artistRemove = removeArtist - 1;
                    mikey.favArtists.remove(mikey.favArtists.get(artistRemove));

                    System.out.println("here is your new list : \n");
                    System.out.println(mikey.favArtists);

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }

                    else {
                        choice = 14;
                        break;
                    }

                case 11:  // Remove from favorite song list

                    mikey.favSongs.add(cantKnock);
                    System.out.println(mikey.favSongs);
                    System.out.println(" clear whole list - y or n?");
                    String clearlist = reader.next();

                    if (clearlist.equals("y")) {

                        while (mikey.favSongs.size() > 0) {
                            mikey.favSongs.remove(mikey.favSongs.size() - 1);
                        }

                        System.out.println("updated list " + mikey.favSongs);
                    } else {

                        System.out.println(mikey.favSongs);
                        System.out.println("what song do you want to remove from the list?");
                        int removeSong = reader.nextInt();
                        int songRemove = removeSong - 1;
                        mikey.favSongs.remove(mikey.favSongs.get(songRemove));

                        System.out.println("here is your new list : \n");
                        System.out.println(mikey.favSongs);

                    }

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                        choice = 14;
                        break;
                    }

                case 12: // Display Albums in order by year

                    ArrayList<Integer> yearDropped = new ArrayList<>();
                    HashMap albumYear = new HashMap();

                    for (int b = 0; b < allAlbums.size(); b++) {
                        albumYear.put(allAlbums.get(b).year, allAlbums.get(b).title);
                    }


                    for (int m = 0; m < allAlbums.size(); m++) {
                        yearDropped.add(allAlbums.get(m).year);
                    }


                    Collections.sort(yearDropped);

                    for (int s = 0; s < yearDropped.size(); s++) {
                        System.out.println(albumYear.get(yearDropped.get(s)));
                    }

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                        choice = 14;
                        break;
                    }

                case 13: // Display Albums in order by album sales

                    ArrayList<Integer> albumSales = new ArrayList<>();
                    HashMap salesNumber = new HashMap();

                    for (int b = 0; b < allAlbums.size(); b++) {
                        salesNumber.put(allAlbums.get(b).albumSales, allAlbums.get(b).title);
                    }


                    for (int m = 0; m < allAlbums.size(); m++) {
                        albumSales.add(allAlbums.get(m).albumSales);
                    }


                    Collections.sort(albumSales);

                    for (int s = 0; s < albumSales.size(); s++) {
                        System.out.println(salesNumber.get(albumSales.get(s)));
                    }

                    System.out.println("return to menu? - yes or no");
                    backToMenu = reader.next();

                    if (backToMenu.equals("yes")) {


                        menu();
                        choice = reader.nextInt();
                    }
                    else {
                        choice = 14;
                        break;
                    }
                        break;


                case 14:

                System.out.println("Thanks for using BOW! Goodbye! ");

                    break;

            } // switch ends here
        }
        while (choice!=14);

        }
}













