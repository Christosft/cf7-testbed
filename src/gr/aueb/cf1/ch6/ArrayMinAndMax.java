package gr.aueb.cf1.ch6;

/**
 * Finds the min and max of an array
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {
        int[] min = {10, 15, 32, 46, 52};
        int[] max = {10, 15, 32, 46, 52};
        System.out.println(getMinPosition(min));
        System.out.println(getMaxPosition(max));
    }
    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return  -1;

        int minPosition = 0 ;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return  -1;

        int maxPosition = 0 ;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
