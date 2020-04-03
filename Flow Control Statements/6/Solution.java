import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        
        if(args.length == 2) {
            String gender = args[0];
            int age = Integer.parseInt(args[1]);

            if(gender.equals("Male") || gender.equals("male")) {
                if(age >= 1 && age <= 60)
                    System.out.println("Interest == 9.2%");
                else if(age >= 61 && age <= 120)
                    System.out.println("Interest == 8.3%");
                else 
                    System.out.println("You are too young or too old to exist.");
            }
            else if(gender.equals("Female") || gender.equals("female")) {
                if(age >= 1 && age <= 58)
                    System.out.println("Interest == 8.2%");
                else if(age >= 59 && age <= 120)
                    System.out.println("Interest == 7.6%");
                else 
                    System.out.println("You are too young or too old to exist.");
            }
        }
        else
            System.out.println("usage: java Solution gender age");
    }
}
