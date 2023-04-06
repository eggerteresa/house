package at.campus02.iwi.music;

public class Album {
    int nrSongs;
    double shortestSong;
    double longestSong;

    public Album(int nrSongs, double shortestSong, double longestSong) {
        this.nrSongs = nrSongs;
        this.shortestSong = shortestSong;
        this.longestSong = longestSong;
    }

    public int getNrSongs() {
        return nrSongs;
    }

    public void setNrSongs(int nrSongs) {
        this.nrSongs = nrSongs;
    }

    public double getShortestSong() {
        return shortestSong;
    }

    public void setShortestSong(double shortestSong) {
        this.shortestSong = shortestSong;
    }

    public double getLongestSong() {
        return longestSong;
    }

    public void setLongestSong(double longestSong) {
        this.longestSong = longestSong;
    }

    public double averageSongLength() {

       double averagelength = (shortestSong+longestSong)/2;

       return averagelength;
    }

    public double totalLength(){

        double summe = averageSongLength() *nrSongs;
        return summe;
    }
    public boolean fitsOnMedium(int minutes) {
        minutes = minutes*60;
        boolean speicher = false;
        if (minutes <= totalLength()) {
            speicher= true;
        }
        if (minutes> totalLength()) {
            speicher= false;
        }
        return speicher;
    }

}
