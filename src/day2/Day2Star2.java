package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Day2Star2 {
  public static void main(String[] args) throws IOException {
    var result = 0;
    var costMap = Map.of (
      'X', 1,
      'Y', 2,
      'Z', 3
    );
    var winMap = Map.of(
        'A', 'Y',
        'B', 'Z',
        'C', 'X');
    var drawMap = Map.of (
        'A', 'X',
        'B', 'Y',
        'C', 'Z'
    );
    var loseMap = Map.of(
        'A', 'Z',
        'B', 'X',
        'C', 'Y'
    );
    try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = reader.readLine()) != null) {
        var outcome = line.charAt(2);
        var theirShape = line.charAt(0);
        switch (outcome) {
          // lose
          case 'X':
            result += costMap.get(loseMap.get(theirShape));
            break;
          // draw
          case 'Y':
            result += costMap.get(drawMap.get(theirShape)) + 3;
            break;
          // win
          case 'Z':
            result += costMap.get(winMap.get(theirShape)) + 6;
            break;
          default:
            break;
        }
      }
    }
    System.out.println(result);
  }
}
