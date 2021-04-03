public class Test {
    public static void main(String[] args) {
        System.out.println("1. Create an array and fill it with 2 number.");
        int[] array1 = new int[8];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 2;
        }

        System.out.println("2. Create an array and fill it with numbers from 1:1000");
        int[] array2 = new int[1000];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        System.out.println("3. Create an array and fill it with odd numbers from -20:20");
        int[] array3 = new int[20];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = -19 + 2 * i;
        }

        System.out.println("4. Create an array and fill it. Print all elements which can be divided by 5");
        int array4[] = {7, 5, 85, 9, -14, -10, 2, 0, 6, 70};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }
        System.out.println("\n");

        System.out.println("5. Create an array and fill it. Print all elements which are between 24.12 and 467.23");
        double[] array5 = {7.0, 4.5, 6.9, 28.5, 500.008, 95.6, 467.1};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > 24.12 & array5[i] < 467.23) {
                System.out.print(array5[i] + " ");
            }
        }
        System.out.println("\n");

        System.out.println("6. Create an array and fill it. Print count of elements which can be divided by 2");
        int[] array6 = {2, 4, 6, 8, 10, 11, 13, 81, 51, 61, 60, 80, 88, 90};
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] % 2 == 0) {
                ++count;
            }
        }
        System.out.println(count + "\n");

        System.out.println("7. Given an integer, 0 < N < 21, print its first 10 multiples");
        int N = 8;
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d", N, i, N * i);
            System.out.println();
        }
    }
}
