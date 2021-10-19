import java.util.Scanner;
// import java.io.File;

public class SongLab {
    public static void main(String[] args) {
        // File songList = new File("./songs_new_line.txt");
        System.out.print("hi");
        Scanner readList = new Scanner("./songs_new_line.txt");
        while (readList.hasNextLine()) {
            String name = readList.nextLine();
            String artist = readList.nextLine();
            String year = readList.nextLine();
            String numOfWords = readList.nextLine();
            System.out.println(name + artist + year +numOfWords);
        }
        readList.close();
    }
}
