import java.util.Random;

public class RandomWordGenerator {
  private char[] letters;
  private int validAmountLetters;
  private Random random;

  public RandomWordGenerator() {
    String lettersAsString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
    this.letters = lettersAsString.toCharArray();
    this.validAmountLetters = lettersAsString.length();
    this.random = new Random();
  }

  public String generateRandomWord(int letterAmount) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < letterAmount; i++) {
      char letter = this.getRandomLetter();
      stringBuilder.append(letter);
    }

    return stringBuilder.toString();
  }

  public char getRandomLetter() {
    int randomInt = new Random().nextInt(this.validAmountLetters);
    return this.letters[randomInt];
  }
}
