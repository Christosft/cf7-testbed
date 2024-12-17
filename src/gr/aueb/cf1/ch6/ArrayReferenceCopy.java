package gr.aueb.cf1.ch6;

/**
 * Copies the reference to arrays.
 * it is a swallow copy. There are
 * side effects.
 */

public class ArrayReferenceCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;     //Swallow copy


        for (int el : arrRefCopy) {
            System.out.print(el + " ");
        }

        arrRefCopy[4] = 100;
        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }


    }
}
