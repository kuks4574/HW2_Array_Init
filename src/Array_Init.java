public class Array_Init {

    public static void main(String[] args) {

        // TODO Ининициализация-1

        int[] array1;

        array1 = new int[5];
        array1[0] = 1;
        array1[1] = 7;
        array1[2] = 5;
        array1[3] = 4;
        array1[4] = 3;
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Элемент массива №" + (i + 1) + " = " + array1[i]);
        }

        // TODO Ининициализация-2

        int array2[] = new int[]{13, 35, 67};

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Элемент массива - " + (i + 1) + " = " + array2[i]);
        }

        // TODO Ининициализация-3

        double array3[] = {33.67, 65.87, 77.34, 23.21};

        int n = 0;
        while (n < array3.length) {
            System.out.println("Элемент массива под номером " + (n + 1) + " = " + array3[n]);
            n++;
        }

        // TODO Ининициализация-4

        int[][] array4 = new int[2][4];

        array4[0][0] = 3;
        array4[0][1] = 5;
        array4[0][2] = 7;
        array4[0][3] = 8;

        array4[1][0] = 4;
        array4[1][1] = 2;
        array4[1][2] = 8;
        array4[1][3] = 6;

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(" " + array4[i][j] + " ");
            }
            System.out.println();
        }

        // TODO Ининициализация-5

        int array5[][] = new int[5][];
        array5[0] = new int[]{1, 2, 3, 4, 5};
        array5[1] = new int[]{1,2,3,4};
        array5[2] = new int[]{1,2,3};
        array5[3] = new int[]{1,2};
        array5[4] = new int[]{1};

        for (int i = 0; i <  array5.length; i++) {
            for (int j = 0; j <  array5[i].length; j++) {
                System.out.print(" " +  array5[i][j] + " ");
            }
            System.out.println();
        }

    }
}


