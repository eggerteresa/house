package at.campus02.iwi.music;

public class MusicApp {
    public static void main(String[] args) {

        Album album1 = new Album(10,120,250);


        System.out.println("Die durchschnittliche Länge der songs beträgt: "+ album1.averageSongLength() +" sekunden");
        System.out.println(" Die gesamte Länge des Albums beträgt: " +album1.totalLength() + " sekunden");
        System.out.println(" Das Album passt auf das Speichermedium: " + album1.fitsOnMedium(30) );
    }
}
