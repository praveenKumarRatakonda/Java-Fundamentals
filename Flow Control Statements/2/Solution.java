import java.util.Scanner;




class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if((n & 1) == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
