package example;


//Question 4
public class AverageLength {
    private static String[][] foobar = new String[][]{{"Sai", "Shyam"}, {"Sai", "Ram", "Sunita"}, {"Shri", "Ram","Santoshi"}, {"Mere", "Ram"}, {"Sridhar","Tadakamalla"}};

    public static void main(String[] args) {
        int len = 0;

        for (int i = 0; i < foobar.length; i++) {
            for (int j = 0; j < foobar[i].length; j++) {
                System.out.println(foobar[i][j]);
                len += foobar[i][j].length();
            }
        }
        System.out.println(len/foobar.length);
        //Question 6
        System.out.println(digitSum(568));
    }
    //Question 6
    static int digitSum (int n)
    {
        if ( n < 10) { return n ; } // base case
        else {
            return n == 0 ? 0 : n % 10 + digitSum(n / 10);
        }
    }
}
