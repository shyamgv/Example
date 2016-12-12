package example;

import java.util.Arrays;

/**
 * Question 9
 */
public class Streatching {

    public static void main(String[] args) {
        int[] list = {18, 7, 4, 24, 11};
        int[] list2 = stretch(list);
        System.out.println(Arrays.toString(list));
// the above prints [18, 7, 4, 24, 11]
        System.out.println(Arrays.toString(list2));
// the above prints [9, 9, 4, 3, 2, 2, 12, 12, 6, 5]
    }

    static int[] stretch(int[] intArray) {
        int firstHalf;
        int secondHalf;
        int[] resultArray = new int[intArray.length * 2];
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            //for (int j = 0; j < resultArray.length; j=j+2) {

            if (intArray[i] % 2 == 0) {
                resultArray[count] = intArray[i] / 2;
                resultArray[count+1] = intArray[i] / 2;
            } else {
                firstHalf = intArray[i] - (intArray[i] / 2);
                secondHalf = intArray[i] / 2;
                resultArray[count] = firstHalf;
                resultArray[count+1] = secondHalf;
            }
            count = count+2;
            //}
        }
        return resultArray;
    }
}
