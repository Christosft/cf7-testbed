package gr.aueb.cf1.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 6, 7, 1, 2, 5};
        System.out.println("Average: "+ average(arr));
        System.out.println("Sum: "+ sum(arr));
        System.out.println("More than two consecutives: "+ moreThanTwoConsecutive(arr));
        System.out.println("Any even: "+ anyEven(arr));
        System.out.println("More than two evens: "+ moreThanTwoEvens(arr));
        System.out.println("More than two with the same ending: "+ moreThanTwoWithTheSameEnding(arr));
        /*System.out.println("Get evens: "+ getEvens(arr));*/
        System.out.println("All evens: " + allAreEven(arr));

    }

    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count ++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) evens[++ pivot] = el;
        }
        return evens;
    }

    public static int[] mapDouble(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int el : arr) {
            newArray[el] = arr[el] * 2;
        }
        return newArray;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;

        }
        return sum;
    }

    public static double average(int[] arr) {
        return sum(arr) / (double) arr.length;

        }

    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;
        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count  = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;

        }
        return count > 2;

    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length -2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] -2) {
                count ++;
                break;
            }
        }
        return count >= 1;
    }

    public  static boolean moreThanTwoWithTheSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEndings = false;

        for (int num : arr) {
            endings[num % 10]++;
            }
        for (int count : endings) {
            if (count >= 3) {
                isSameEndings = true;
                break;
                 /*for (int i = 0; i < arr.length; i++){
            endings[arr[i] % 10]++;
        }*/
            }

        }
        return isSameEndings;

    }
    public static boolean allAreEven(int[] arr) {
        /*return getEvens(arr).length == arr.length;*/

        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }

}

