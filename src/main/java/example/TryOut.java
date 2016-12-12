package example;


public class TryOut {
    private boolean[] quizABoolean = new boolean[20];
    private int[] familyAvg = new int[12];
    private float[][] rainFall = new float[5][12];
    private Candidates[] candidates = new Candidates[8];

    //Question 5
    private char[][] ticTacToe = new char[][]{{'O',' ',' '}, {' ', 'X', 'O'}, {'X', 'O', 'X'}};

    public static void main(String[] args) {
        //Question 3
        final int SIZE = 10;
        int[] sample = new int[SIZE];
        //(a) Start
        System.out.println("===================================");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(sample[i] = 5);
        }
        System.out.println("===================================");
        //(a) End
        // (b) Start

        for (int i = 0; i < SIZE; i++) {
            sample[i] = i + 1;
        }
        int firstValue = sample[0];
        sample[0] = sample[SIZE - 1];
        sample[SIZE - 1] = firstValue;
        System.out.println(sample[0]);
        System.out.println(sample[SIZE - 1]);
        System.out.println("===================================");
        // (b) End

        // (c) Start
        for (int i = 0; i < SIZE; i++) {
            sample[i] = i - 2;
            System.out.println(Math.abs(sample[i]));
        }
        System.out.println("===================================");

        // (c) End

        // (d) Start
        for (int i = 0; i < SIZE; i++) {
            sample[i] = i;
            if (i % 2 != 0) {
                System.out.println(sample[i]);
            }
        }
        System.out.println("===================================");
        // (d) End

    }


}
