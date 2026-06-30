import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - i - 1] = colors[i][j];

            }
        }
        printMatrix(colors);
        System.out.println();
        printMatrix(rotatedColors);

    }

    public static void printMatrix(int[][] colors) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

}
