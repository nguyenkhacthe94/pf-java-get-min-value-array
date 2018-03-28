import java.util.Scanner;

public class GetMinValue {
    public static int minValue(int[] array) {

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter array size: ");
            size = input.nextInt();
            if (size < 0) System.out.println("Invalid size");
        } while (size < 0);
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter integer at index " + i + " ");
            array[i] = input.nextInt();
        }
        int min = minValue(array);
        System.out.print("\nMin Value of array is: " + array[min]);
    }
}
