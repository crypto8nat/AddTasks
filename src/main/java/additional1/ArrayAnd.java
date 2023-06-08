package additional1;

import java.util.Arrays;

public class ArrayAnd {
    public static void main(String[] args) {
        //    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//     числа меньшие 6 умножить на 2;

        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array4.length ; i++) {
            if (array4[i] < 6) array4[i] *=2;


        }
        System.out.println(Arrays.toString(array4));
    }

}
