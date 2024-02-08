import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {
    /**
     * Open a given file and return its content as a string. The file is expected to be a txt file in the input folder.
     * @param file the name of the file to open
     * @return the contents of the file
     * @throws IOException if the file cannot be read
     */
    public static String readFile(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get("input/" + file)));
    }
}
