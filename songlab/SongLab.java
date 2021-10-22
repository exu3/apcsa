import java.util.Scanner;
import java.io.File;

public class SongLab {

    public static void main(String[] args)
    {
      readData();
    }
	// file has 20400 lines

	/**
	 * - Total number of songs
		- Average number of words per song 
		- Song with the most number of words
		- Song with the least number of words 
		- Artist with the longest name 
		- Artist that appears the most number of times (must be exact match) 
		- Does any song appear more than once? (must also be exact match)
	 */

    public static void readData() {
			String[] titleArray = new String[20400/4];
			String[] artistArray = new String[20400/4];
			int[] yearArray = new int[20400/4];
			int[] wcArray = new int[20400/4];

		    int numOfSongs = titleArray.length; // total number of songs
			int avgWords = 0; // average number of words per song
			String mostWords; // song with the most number of words
			String leastWords; // song with the least number of words
			String longestName; // artist with the longest name
			String repeatedArtist; // artist that appears the most number of times
			String repeatedSong; // song that appears more than once

        // try/catch block to catch file exception not found thing
        try {
			Scanner in = new Scanner(new File("./songs_new_line.txt"));           

			while (in.hasNextLine()) {

				String title = in.nextLine();

				String artist = in.nextLine();

				String year = in.nextLine();
				String numWords = in.nextLine();
				System.out.println(title + "\n" + artist + "\n" + year + "\n" + numWords + "\n");
		
			}

        } catch (Exception e) {
            System.out.println("Check your file, mate.");
        }

			}

}
