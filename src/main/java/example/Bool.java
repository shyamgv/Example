package example;

//Question 8
public class Bool {

    public static void main(String[] args) {
        boolean[] test1 = {false, true, true, true};
        boolean[] test2 = {true};
        boolean[] test3 = {true, true, true, true, false};
        boolean[][] booleanArray = new boolean[][]{test1,test2,test3};

        for (boolean[] boolVal:booleanArray){
            fullOfBool(boolVal);
        }

    }

    static void fullOfBool(boolean[] booleenValue) {
        int firstTruePos = 0;
        int lastTruePos = 0;
        int count = 0;
        boolean consFlag = false;

        for (int i = 0; i < booleenValue.length; i++) {
            if (booleenValue[i]) {
                if(booleenValue[i] && i == booleenValue.length - 1){

                }else if (booleenValue[i + 1]){
                    consFlag = true;
                }
                count++;
                lastTruePos = i;
                if (count == 1) {
                    firstTruePos = i;
                }
            }
        }
        System.out.println("Last true pos ==>" + lastTruePos);
        System.out.println("First true pos ==>" + firstTruePos);
        if (consFlag)
            System.out.println("Consecutive true values ==>" + count);
        else
            System.out.println("Consecutive true vaules"+ 0);
    }
}
