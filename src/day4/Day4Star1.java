package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
   ---------
         --- full overlap

   ---------
   ---       full overlap

   -----
   --------- full overlap

        ----
   --------- full overlap

     ---
   --------- full overlap

   ---------
      ---    full overlap
 */

public class Day4Star1 {
  public static void main(String[] args) throws IOException {
    int result = 0;
    try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = reader.readLine()) != null) {
        var split = line.split(",");
        var elf1Split = split[0].split("-");
        var elf1 = new int[] { Integer.parseInt(elf1Split[0]), Integer.parseInt(elf1Split[1])};
        var elf2Split = split[1].split("-");
        var elf2 = new int[] { Integer.parseInt(elf2Split[0]), Integer.parseInt(elf2Split[1])};

        if ((elf1[0] >= elf2[0] && elf1[1] <= elf2[1]) || (elf2[0] >= elf1[0] && elf2[1] <= elf1[1])) {
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
