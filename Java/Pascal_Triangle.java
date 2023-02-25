package Java;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generate(5);
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row, previous = null;
        for(int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(previous.get(j - 1) + previous.get(j));
                }
            }
            previous = row;
            result.add(row);
        }
        return result;
    }
}
