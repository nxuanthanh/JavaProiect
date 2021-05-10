package Tutorial;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class ArraySoft {

    public static void main(String[] args) {
        int[] A = {5, 7, 2, 4, 8};
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
        }
        //Arrays.sort(A);
        //Co the dung ham sort cua lop Arrays
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
