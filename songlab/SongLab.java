import java.util.Scanner;
import java.io.File;

public class SongLab {

    public static void main(String[] args)
    {
      readData();
    }
	// file has 20400 lines

	/**
	 	- Total number of songs
		- Average number of words per song 
		- Song with the most number of words
		- Song with the least number of words 
		- Artist with the longest name 
		- Artist that appears the most number of times (must be exact match) 
		- Does any song appear more than once? (must also be exact match)
	 */

    public static void readData() {
			String[] titleArray = new String[5100];
			String[] artistArray = new String[5100];
			int[] yearArray = new int[5100];
			int[] wcArray = new int[5100];

		    int numOfSongs = titleArray.length; // total number of songs
			int avgWords = 0; // average number of words per song
			int mostWords = 0;
			int leastWords = 9999999;

			String songMostWords = ""; // song with the most number of words
			String songLeastWords = ""; // song with the least number of words
			String longestName = ""; // artist with the longest name
			String repeatedSong = ""; // song that appears more than once

        // try/catch block to catch file exception not found thing
        try {
			Scanner in = new Scanner(new File("songs_new_line.txt"));           

			while (in.hasNextLine()) {

				String title = in.nextLine();
				String artist = in.nextLine();
				String year = in.nextLine();
				String numWords = in.nextLine();


				// song with the most # of words
				if (Integer.parseInt(numWords) > mostWords) {
					mostWords = Integer.parseInt(numWords);
					songMostWords = title;
				}

				// song with the least # of words
				if (Integer.parseInt(numWords) < leastWords) {
					leastWords = Integer.parseInt(numWords);
					songLeastWords = title;
				}
				
				// artist with the longest name
				if (artist.length() > longestName.length()) {
					longestName = artist;
				}
				
				// prints the contents of the file
				// System.out.println(title + "\n" + artist + "\n" + year + "\n" + numWords + "\n"); 		
			}

			// most frequently appearing artist
			String repeatedArtist = ""; // artist that appears the most number of times
			int repeatedArtistCount = 0; // times this artist appears
			
			// for (int i = 0; i <= artistArray.length-1; i++) {
			// 	int artistCounter = 0;
			// 	for (int j = i+1; j <= artistArray.length-2; j++) {
			// 		if ( artistArray[i].equals(artistArray[j]) ) {
			// 			artistCounter++;
			// 		}
			// 		if ( artistCounter > repeatedArtistCount ) {
			// 			repeatedArtistCount = artistCounter;
			// 			repeatedArtist = artistArray[i];
			// 		}
			// 	}
			// }

				// artistArray[numOfSongs] = artist;
				// titleArray[numOfSongs] = title;
				// wcArray[numOfSongs] = title.length();

				// artist with the longest name
				// String artistLongestName;
				// for (int i = 0; i < artistArray.length -1; i++) {
				// 	if ( artistArray[i+1].length() > artistArray[i].length()) {
				// 		artistLongestName = artistArray[i+1];
				// 	}
				// }
				
				// results
				System.out.println("Total number of songs: " + numOfSongs);
				// System.out.println("Avg # of words per song: " + numOfSongs);
				System.out.println("Song with the most words: " + songMostWords + " (with " + mostWords + " words)");
				System.out.println("Song with the least words:" + songLeastWords + " (with " + leastWords + " word)");
				System.out.println("Artist with the longest name: " + longestName);
				System.out.println("Artist appearing the most # of times: " + repeatedArtist + " (appearing " + repeatedArtistCount + " times)");
				// System.out.println("Songs that appear more than once: " + numOfSongs);
	

        } catch (Exception e) {
            System.out.println("Check your file, mate.");
        }

			}

}
