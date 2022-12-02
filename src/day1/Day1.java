package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Day1 {
  public static void main(String[] args) throws IOException {
    var minHeap = new PriorityQueue<Integer>();
    int current = 0;
    try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.isEmpty()) {
          addToHeap(minHeap, current);
          current = 0;
        } else {
          current += Integer.parseInt(line);
        }
      }
    }
    addToHeap(minHeap, current);
    int result = 0;
    while (!minHeap.isEmpty()) {
      result += minHeap.poll();
    }
    System.out.println(result);
  }

  private static void addToHeap(PriorityQueue<Integer> minHeap, int current) {
    minHeap.add(current);
    if (minHeap.size() > 3) {
      minHeap.poll();
    }
  }
}