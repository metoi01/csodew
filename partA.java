import java.util.Random;

public class partA {
    public static void main(String[] args) {
        int size = 10; // Change this to the desired size of the array

        // Create an array of random integers
        int[] randomArray = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(101); // Generates random integers between 0 and 100
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : randomArray) {
            sum += num;
        }

        // Find the maximum value in the array
        int max = randomArray[0];
        for (int num : randomArray) {
            if (num > max) {
                max = num;
            }
        }

        // Find the minimum value in the array
        int min = randomArray[0];
        for (int num : randomArray) {
            if (num < min) {
                min = num;
            }
        }

        // Print the random array, sum, max, and min
        System.out.println("Random Array: " + java.util.Arrays.toString(randomArray));
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
