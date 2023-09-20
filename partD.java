public class partD {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 3, 5};
        
        // Find and display the average
        double average = findAverage(arr);
        System.out.println("Average: " + average);

        // Calculate and display differences from the average
        int[] differences = calculateDifferences(arr, average);
        System.out.print("Differences from Average: {");
        for (int i = 0; i < differences.length; i++) {
            System.out.print(differences[i]);
            if (i < differences.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Method to find the average of the array
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Method to calculate differences from the average
    public static int[] calculateDifferences(int[] arr, double average) {
        int[] differences = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            differences[i] = arr[i] - (int) average;
        }
        return differences;
    }
}
