public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        System.out.print("Shuffled array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1)); // Random index between 0 and i
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}