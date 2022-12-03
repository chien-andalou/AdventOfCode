package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Day3Star2 {
  public static void main(String[] args) throws IOException {
    int result = 0;
    try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      var set = new HashSet<Character>();
      for (int i = 1; (line = reader.readLine()) != null; i++) {
        var currentSet = new HashSet<Character>();
        for (var letter: line.toCharArray()) {
          currentSet.add(letter);
        }
        if (i % 3 == 1) {
          set = new HashSet<>(currentSet);
        } else {
          set.retainAll(currentSet);
        }

        if (i%3 == 0) {
          var commonLetter = set.iterator().next();
          if (Character.isLowerCase(commonLetter)) {
            result += commonLetter - 'a' + 1;
          } else {
            result += commonLetter - 'A' + 27;
          }
          set = new HashSet<>();
        }
      }
    }
    System.out.println(result);
  }
}
