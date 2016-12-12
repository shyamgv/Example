package example;

/**
 * Question 14
 */
public class ArrayIntersect {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,7};
        int[] arr2 = new int[]{8,9,21,43,6,21,44,2};
        System.out.println(intersection(arr1,arr2));
    }

    static boolean intersection(int[] arr1, int[] arr2) {

        for (int element1 : arr1) {
            for (int element2 : arr2) {
                if (element1 == element2) {
                    return true;
                }
            }
        }
        return false;
    }

}
