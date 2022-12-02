import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Day1 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    var minHeap = new PriorityQueue<Integer>();
    int current = 0;
    String line;
    while ((line = reader.readLine()) != null) {
      if (line.isEmpty()) {
        minHeap.add(current);
        if (minHeap.size() > 3) {
          minHeap.poll();
        }
        current = 0;
      } else {
        current += Integer.parseInt(line);
      }
    }
    minHeap.add(current);
    if (minHeap.size() > 3) {
      minHeap.poll();
    }
    int result = 0;
    while (!minHeap.isEmpty()) {
      result += minHeap.poll();
    }
    System.out.println(result);
  }
}