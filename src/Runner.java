public class Runner {

    public static void main(String[] args) {
        int[] test = {7, 42, 18, 91, 5, 63, 29, 12, 56, 33};
        shellSort(test);
        for (int arr : test) {
            System.out.print(arr + " ");
        }

    }

    private static void shellSort(int[] array) {
        int length = array.length;
        int gap = length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int temp = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = temp;
            }
            gap /= 2;
        }
    }
}
