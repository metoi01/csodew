import java.util.Scanner;
import java.util.Random;

public class partB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        while (true) {
            System.out.println("Menu Options:");
            System.out.println("1. Create Random Array");
            System.out.println("2. Calculate Sum");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = scanner.nextInt();
                    int[] randomArray = new int[size];
                    for (int i = 0; i < size; i++) {
                        randomArray[i] = rand.nextInt(101); // Generates random integers between 0 and 100
                    }
                    System.out.println("Random Array: " + java.util.Arrays.toString(randomArray));
                    break;
                case 2:
                    System.out.print("Enter the elements of the array separated by spaces: ");
                    scanner.nextLine(); // Consume the newline character
                    String[] elements = scanner.nextLine().split(" ");
                    int[] arr = new int[elements.length];
                    for (int i = 0; i < elements.length; i++) {
                        arr[i] = Integer.parseInt(elements[i]);
                    }
                    int sum = calculateSum(arr);
                    System.out.println("Sum: " + sum);
                    break;
                case 3:
                    System.out.print("Enter the elements of the array separated by spaces: ");
                    scanner.nextLine(); // Consume the newline character
                    String[] elementsMax = scanner.nextLine().split(" ");
                    int[] arrMax = new int[elementsMax.length];
                    for (int i = 0; i < elementsMax.length; i++) {
                        arrMax[i] = Integer.parseInt(elementsMax[i]);
                    }
                    int max = findMax(arrMax);
                    System.out.println("Maximum: " + max);
                    break;
                case 4:
                    System.out.print("Enter the elements of the array separated by spaces: ");
                    scanner.nextLine(); // Consume the newline character
                    String[] elementsMin = scanner.nextLine().split(" ");
                    int[] arrMin = new int[elementsMin.length];
                    for (int i = 0; i < elementsMin.length; i++) {
                        arrMin[i] = Integer.parseInt(elementsMin[i]);
                    }
                    int min = findMin(arrMin);
                    System.out.println("Minimum: " + min);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    // Function to calculate the sum of an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Function to find the maximum value in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Function to find the minimum value in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
