package additional1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//        Task1
//        -------------
//        Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int a = array1.length;
        System.out.println(a);
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < a; i++) {
            if (array1[i] == 0) array1[i] = 1;
            else if (array1[i] == 1) array1[i] = 0;

        }
        System.out.println(Arrays.toString(array1));

//        Task2
//        --------------
//        Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] array2 = new int[8];
        int count = 0;
        for (int i = 0; i < array2.length; i++) {


            array2[i] = 0 + count;
            count += 3;
        }
        System.out.println(Arrays.toString(array2));


//    Task3
//    ___________________
//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(array3);
    }
    public static void changeArray(int[] arr) {
        System.out.println("Вывести заданный массив "  +Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Получен массив" +Arrays.toString(arr));
    }
}





