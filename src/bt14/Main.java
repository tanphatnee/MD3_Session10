package bt14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int size = (int) Math.ceil(Math.random() * 10);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add((int) Math.ceil(Math.random() * 9));
            }
            matrix.add(row);
        }

        for (ArrayList<Integer> row : matrix) {
            for (int e : row) {
                System.out.print(e + "  ");
            }
            System.out.println();
        }
    }
}
