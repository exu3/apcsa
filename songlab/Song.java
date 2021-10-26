import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Song
{
  public static void main(String [] args)
  {
    readData();
  }
  
  public static void readData()
  {
    int totalNumSongs = 0;
    int totalNumWords = 0;

    String mostWordsSong = "";
    int mostWordsSongNum = 0;

    String leastWordsSong = "";
    int leastWordsSongNum = 10000000;

    String longestArtistName = "";

    String[] artistNames = new String[5100];
    String[] songNames = new String[5100];

    int numSongAppearMoreThanOnce = 0;


    try{
      Scanner in  = new Scanner( new File("songs_new_line.txt"));

      while (in.hasNextLine()){
        String name = in.nextLine();
        String artist = in.nextLine();
        String year = in.nextLine();
        String numWords = in.nextLine();

        // System.out.println(name + " " + artist + " " + year + " " + numWords);

        artistNames[totalNumSongs] = artist;
        songNames[totalNumSongs] = name;

        totalNumSongs ++ ;
        totalNumWords += Integer.parseInt(numWords) ;
        
        if (Integer.parseInt(numWords) > mostWordsSongNum){
          mostWordsSongNum = Integer.parseInt(numWords);
          mostWordsSong = name;

        }

        if (Integer.parseInt(numWords) < leastWordsSongNum){
          leastWordsSongNum = Integer.parseInt(numWords);
          leastWordsSong = name;

        }

        if (artist.length() > longestArtistName.length()){
          longestArtistName = artist;
        }

      }


      // Artist Most Common
      String artistMostTimes = "";
      int artistMostTimesTimes = 0;

      int currentTimes = 0;

      for (int a = 0; a < artistNames.length-1; a ++ ){
        currentTimes = 0;
        for (int b = a + 1; b < artistNames.length; b ++ ){
          if (artistNames[a].equals(artistNames[b])){
            currentTimes ++ ;
          }
        }
        if (currentTimes  > artistMostTimesTimes ){
          artistMostTimes = artistNames[a];
          artistMostTimesTimes = currentTimes;
        }
      }



      // Song Appear more than once
      String[] songAppearsMoreThanOnce = new String[5100];
      int[] songAppearsMoreThanOnceTimes = new int[5100];
      
      for (int x = 0; x < songNames.length; x ++ ){
        currentTimes = 1;
        for (int y = x + 1; y < songNames.length; y ++ ){
          if (songNames[x].equals(songNames[y]) && !songNames[x].equals("")){
            currentTimes ++ ;
            songNames[y] = "";
          }
        }
        if (currentTimes > 1 ){
          songAppearsMoreThanOnce[x] = songNames[x];
          songAppearsMoreThanOnceTimes[x] = currentTimes;
          numSongAppearMoreThanOnce ++ ;
        }
      }
      
      


      System.out.println("Total Number of Songs: " + totalNumSongs);
      System.out.println("Average number of words per song: " + totalNumWords/totalNumSongs);
      System.out.println("Song with the most number of words: " + mostWordsSong);
      System.out.println("Song with the least number of words: " + leastWordsSong);
      System.out.println("Artist with the longest name: " + longestArtistName);
      System.out.println("Artist that appears the most times: " + artistMostTimes);
      System.out.println("These " + numSongAppearMoreThanOnce + " songs appear more than once: ");

      int acc = 1;
      for (int a = 0; a < songAppearsMoreThanOnce.length; a ++ ){
        if (songAppearsMoreThanOnce[a] != null){
          System.out.println("  " + acc + ". " + songAppearsMoreThanOnce[a] + ": " + songAppearsMoreThanOnceTimes[a]);
          acc ++ ;
        }
      }



      
    }catch(FileNotFoundException e){
      System.out.println("file not found!");
    }
    

    //Check to make sure that reading works
    
  }
}