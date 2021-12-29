package geekbrain;

public class HW3 {
    public static void main(String[] args) {
        reverseArray();
        z2Array();
        umnojenArray();
        diagonalArray();
        zadanie5(1, 2);


        }
        //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        public static void reverseArray(){
        int[] array = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {
            array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(" " + array[i] );
        }

        }




        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        public static int[] z2Array() {
            int[] array = new int[5];
            for (int i = 1; i < array.length; i++) {
                array[i - 1] = i;

            }
            return array;
        }

        //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        public static void umnojenArray() {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++){
                if (array[i] < 6)
                    array[i] = array[i] * 2;
            }

        }
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        public static void diagonalArray() {
            int[][] array = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j)
                        array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
        // типа int длиной len, каждая ячейка которого равна initialValue;
        public static void zadanie5(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
        }
}


