public class Basic_Of_array {
    public static void main(String[] args) {

        int arr2[] = {1, 2, 30, 40, 5, 6, 7, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int largestIndex = -1;
        int secondLargestIndex = -1;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > largest) {
                // Before updating largest, the old largest becomes the second
                secondLargest = largest;
                secondLargestIndex = largestIndex;

                // Update largest
                largest = arr2[i];
                largestIndex = i;
            } else if (arr2[i] > secondLargest && arr2[i] != largest) {
                secondLargest = arr2[i];
                secondLargestIndex = i;
            }
        }

        System.out.println("Largest Index: " + largestIndex);
        System.out.println("Second Largest Index: " + secondLargestIndex );
    }
}