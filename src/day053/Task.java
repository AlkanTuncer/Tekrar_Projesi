package day053;

public class Task {
    public static void main(String[] args) {

        String[] teams = {"Team 1","Team 2","Team 3"};

        int[][] scores = {
                {20,25,30},
                {19,18,26},
                {29,17,23}
        };

        for (int i = 0; i < scores.length; i++) {
            System.out.print(teams[i]+"\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
