import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        boolean six = false, seven = false;
        int id_six = -1, id_seven = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 6) {
                six = true;
                id_six = i;
            }
            if (six && arr[i] == 7) {
                seven = true;
                id_seven = i;
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (six && seven) {
                if (i < id_six || i > id_seven)
                    sum += arr[i];
            } else
                sum += arr[i];
        }

        System.out.println(sum);
    }
}
