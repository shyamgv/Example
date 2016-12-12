package example;

import java.util.Arrays;

/**
 * Question 10
 */
public class MindTheGap {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 5, 6};
        System.out.println(minGap(intArray));
    }

    static int minGap(int[] minGapArr) {
        if (minGapArr.length <= 2)
            return 0;
        int[] gapNumber = new int[minGapArr.length - 1];
        for (int i = 0; i < minGapArr.length; i++) {
            if (i == minGapArr.length - 1) {
                break;
            }else
                gapNumber[i] = minGapArr[i + 1] - minGapArr[i];
        }
        Arrays.sort(gapNumber);
        return gapNumber[0];
    }
}
