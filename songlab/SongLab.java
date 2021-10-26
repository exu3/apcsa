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
			String[] yearArray = new String[5100];
			String[] wcArray = new String[5100];

		    int numOfSongs = titleArray.length; // total number of songs
			int avgWords = 0; // average number of words per song
			int mostWords = 0;
			int leastWords = 9999999;

			String songMostWords = ""; // song with the most number of words
			String songLeastWords = ""; // song with the least number of words
			String longestName = ""; // artist with the longest name

        // try/catch block to catch file exception not found thing
        try {
			Scanner in = new Scanner(new File("songs_new_line.txt"));           
			int arrayIndex = 0;
			while (in.hasNextLine()) {

				String title = in.nextLine();
				titleArray[arrayIndex] = title;
				String artist = in.nextLine();
				artistArray[arrayIndex] = artist;
 				String year = in.nextLine();
				yearArray[arrayIndex] = year;
				String numWords = in.nextLine();
				wcArray[arrayIndex] = numWords;
				
				arrayIndex++;

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
			System.out.println(titleArray[2] + titleArray[0]);

			// most frequently appearing artist
			String repeatedArtist = ""; // artist that appears the most number of times
			int repeatedArtistCount = 0; // times this artist appears
			
			for (int i = 0; i <= artistArray.length-1; i++) {
				int artistCounter = 0;
				for (int j = i+1; j <= artistArray.length-2; j++) {
					if ( artistArray[i].equals(artistArray[j]) ) {
						artistCounter++;
					}
					if ( artistCounter > repeatedArtistCount ) {
						repeatedArtistCount = artistCounter;
						repeatedArtist = artistArray[i];
					}
				}
			}

			// most frequently appearing songs
			String repeatedSong = ""; // song that appears more than once
			int repeatedSongCount = 0;

			// for (int k = 0; k <= titleArray.length-1; k++) {
			// 	int songCounter = 0;
			// 	for (int m = k+1; m <= titleArray.length -2; k++) {
			// 		if (titleArray[k].equals(titleArray[m])) {
			// 			songCounter++;
			// 		}
			// 		if (songCounter > repeatedArtistCount) {
			// 			repeatedSongCount = songCounter;
			// 			repeatedSong = artistArray[k];
			// 		}
					
			// 	}
			// }
			System.out.println(repeatedSongCount);

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
				System.out.println("Songs that appear more than once: " + repeatedSong + "yes a song repeats");
	

        } catch (Exception e) {
            System.out.println("Check your file, mate.");
        }

			}

}
