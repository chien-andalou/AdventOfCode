import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Day1 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    var maxHeap = new PriorityQueue<Integer>((a,b) -> Integer.compare(b, a));
    int current = 0;
    String line;
    while ((line = reader.readLine()) != null) {
      if (line.isEmpty()) {
        maxHeap.add(current);
        current = 0;
      } else {
        current += Integer.parseInt(line);
      }
    }
    maxHeap.add(current);
    int result = 0;
    for (int i = 0; i < 3; i++) {
      result += maxHeap.poll();
    }
    System.out.println(result);
  }
}