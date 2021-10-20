import java.util.Scanner;
import java.io.File;

public class SongLab {

    public static void main(String[] args)
    {
      readData();
    }

    public static void readData() {
			String[] titleArray = new String[100];
			String[] artistArray = new String[10];
			int[] yearArray = new int[100];
			int[] wcArray = new int[100];

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