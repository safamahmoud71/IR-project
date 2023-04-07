import java.io.*;

public class WriteintoBinaryFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream f= new FileOutputStream("safa.is", true);
        DataOutputStream d = new DataOutputStream(f);
        d.writeUTF("safa mahmoud");
        d.writeUTF("lila mahmoud");
        d.writeChar('F');
        d.flush();
        d.close();
    }
}