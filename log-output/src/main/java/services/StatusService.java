package services;

import utils.RandomWordGenerator;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class StatusService {
  private String randomWord;
  DateTimeFormatter formatter;

  public StatusService() {
    RandomWordGenerator randomWordGenerator = new RandomWordGenerator();
    randomWord = String.format("%s-%s-%s-%s-%s",
        randomWordGenerator.generateRandomWord(8),
        randomWordGenerator.generateRandomWord(4),
        randomWordGenerator.generateRandomWord(4),
        randomWordGenerator.generateRandomWord(4),
        randomWordGenerator.generateRandomWord(10)
    );
    this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX").withZone(ZoneOffset.UTC);
  }

  public String getCurrentStatus() {
    Instant instant = Instant.now();

    String currentTime = formatter.format(instant);
    return currentTime + " " + randomWord;
  }
}
