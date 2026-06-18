import java.time.Instant;
import java.lang.Thread;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;


public class Main {
  public static void main(String[] args) {
    RandomWordGenerator randomWordGenerator = new RandomWordGenerator();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX").withZone(ZoneOffset.UTC);
    String randomWord = String.format("%s-%s-%s-%s-%s",
        randomWordGenerator.generateRandomWord(8),
        randomWordGenerator.generateRandomWord(4),
        randomWordGenerator.generateRandomWord(4),
        randomWordGenerator.generateRandomWord(4),
        randomWordGenerator.generateRandomWord(10)
    );

    while (true) {
      Instant instant = Instant.now();
      System.out.printf("%s: %s\n", formatter.format(instant), randomWord);

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        System.exit(1);
      }
    }
  }
}
