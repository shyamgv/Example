package example;

//Question 7
public class CountInRange {


    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[]{10, 20, 30, 46, 67, 67, 76, 45, 98};
        int min = 10;
        int max = 70;

        System.out.println(countInRange(arrayOfNumbers, min, max));

    }

    //Question 7
    static int countInRange(int[] n, int min, int max) {
        int arraySize = n.length;
        int[] arrayOfElements = new int[arraySize];
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= min && n[i] <= max) {
                arrayOfElements[i] = n[i];
                count++;
            }
        }
        return count;
    }

}
