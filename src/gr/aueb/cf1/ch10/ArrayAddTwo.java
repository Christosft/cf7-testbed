package gr.aueb.cf1.ch10;

public class ArrayAddTwo {

    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        int[] arr1 = {1, 9, 8, 5};
        int[] arrOut;
        int[] arrOut1;

        arrOut = addOne(arr);
        arrOut1 = addTwo(arr1);

        for (int digit : arrOut) {
            System.out.print(digit + "");
        }

        System.out.println();

        for (int digit : arrOut1) {
            System.out.print(digit + "");
        }

    }
    public static int[] addOne(int[] arr) {
        int[] arrOut;
        int currentSum;
        int carry = 1;

        if (arr == null) throw new IllegalArgumentException("Error. Array must not be null");
        arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry;

            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }

        public static int[] addTwo(int[] arr1) {
            int[] arrOut1;
            int currentSum;
            int carry = 1;

            if (arr1 == null) throw new IllegalArgumentException("Error. Array must not be null");
            arrOut1 = new int[arr1.length + 1];

            for (int i = arr1.length - 1; i >= 0; i--) {
                currentSum = arr1[i] + carry;

                arrOut1[i + 1] = currentSum % 10;
                carry = currentSum / 10;
            }

            arrOut1[0] = carry;
            return arrOut1;
        }
    }


