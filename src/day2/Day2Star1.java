package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Day2Star1 {
  public static void main(String[] args) throws IOException {
    var result = 0;
    var rules = Map.of(
        "A Y", 6,
        "B Z", 6,
        "C X", 6,
        "A X", 3,
        "B Y", 3,
        "C Z", 3
    );
    try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = reader.readLine()) != null) {
        result += line.charAt(2) - 'A' - 23 + 1;
        result += rules.getOrDefault(line, 0);
      }
    }
    System.out.println(result);
  }
}
