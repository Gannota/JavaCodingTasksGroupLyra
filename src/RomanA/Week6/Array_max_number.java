package RomanA.Week6;

public class Array_max_number {


    public static void main(String[] args) {

        int[] arr = new int[]{2,4,6,8,91,12,1,72};

        int maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]){
                maxNum = arr[i];
            }
        }
        System.out.println(MaxNum(arr));

    }

    public static int MaxNum(int[] arr){
        int maxNum = arr[0];

        for (int each : arr) {
            if (maxNum < each) {
                maxNum = each;
            }
        }
        return maxNum;

    }

    //2. Find Maximum:
    //  Write a method that can find the maximum number from an int Array.
}
