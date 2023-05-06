import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Mp3Decompressor {
    static void decompress(String filename) {
        //TODO det er en bitstream, ikke bytes. dumbass
        try {
            Path path = Paths.get(filename);
            byte[] data = Files.readAllBytes(path);
            System.out.println(data);

            String thing = Base64.getEncoder().encodeToString(data);
            System.out.println("Thing: " + thing);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
