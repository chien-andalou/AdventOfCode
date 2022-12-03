package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Day3Star1 {
  public static void main(String[] args) throws IOException {
    int result = 0;
    try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = reader.readLine()) != null) {
        var set1 = new HashSet<Character>();
        for(char ch: line.substring(0, line.length()/2).toCharArray()) {
          set1.add(ch);
        }
        var set2 = new HashSet<Character>();
        for (char ch: line.substring(line.length()/2).toCharArray()) {
          set2.add(ch);
        }
        set1.retainAll(set2);
        if (set1.isEmpty()) {
          continue;
        }
        char letter = set1.iterator().next();
        if (Character.isUpperCase(letter)) {
          result += letter - 'A' + 27;
        } else {
          result += letter - 'a' + 1;
        }
      }
    }
    System.out.println(result);
  }
}
