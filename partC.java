public class partC {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 3, 5};
        
        // Find and display the minimum and maximum
        int min = findMinimum(arr);
        int max = findMaximum(arr);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // Method to find the minimum element in the array
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the maximum element in the array
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
