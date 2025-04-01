
import java.util.Random;

public class RandomStringGenerator {
  private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static final int MIN_LENGTH = 4;
  private static final int MAX_LENGTH = 6;

  private static final Random random = new Random();
  public static String generateRandomString() {
    int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
    System.out.println(length);
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
    }
    return sb.toString();
  }
public static void main(String[] args) {
  System.out.println(generateRandomString());
}
}
