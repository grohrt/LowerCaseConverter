import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by User on 6/2/2014.
 */
public class InputTest {
  public static void main(String[] args) throws IOException {
    int c;
    try {
      InputStream in =
          new LowerCaseInputStream(
              new BufferedInputStream(
                  new FileInputStream("C:\\JDK\\test.txt")));
      while((c = in.read()) >= 0) {
        System.out.print((char)c);
      }

      in.close();
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}
