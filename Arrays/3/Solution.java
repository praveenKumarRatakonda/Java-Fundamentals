import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int n = in.nextInt(), id = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                id = i;
                break;
            }
        }

        System.out.println("Element found at index: " + id);
    }
}
