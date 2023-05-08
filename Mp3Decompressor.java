import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class Mp3Decompressor {
    static void decompress(String filename) {
        int numberOfBytes = 32;
        byte[] bytearray = new byte[numberOfBytes];
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            fileInputStream.read(bytearray, 0, numberOfBytes);
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytearray);
        //TODO hardkodet, fiks det
        for(int i = 0; i < numberOfBytes; i++) {
            int c;
            while((c = byteArrayInputStream.read()) != -1) {
                if(i == 0) {
                    System.out.print((char) c);
                } else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }
        }
    }
}
