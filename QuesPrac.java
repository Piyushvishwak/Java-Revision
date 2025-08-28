import java.util.*;
import java.io.*;
public class QuesPrac {
    // 2. Factorial
    public static int factorial(int n){
        int ans=1;
        while(n >= 1){
            ans *= n;
            n--;
        }
        return ans;
    }

    // 3. LCM
    public static int LCM(int a, int b){
        if(b==0){
            return a;
        }
        return LCM(b, a%b);
    }

    // 4. Reverse digits
    public static boolean reverseDigit(int n){
        int ans=0, temp = n;
        while(temp!=0){
            int rem = temp % 10;
            ans = ans * 10  + rem;
            temp = temp/10;
        }
        return ans == n;
    }

    public static void main(String[] args) {
        // 1. Table
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        for(int i=1; i<11; i++){
//            System.out.println(n+"*"+i+" = "+i*n);
//        }

//        int lcm = LCM(12, 18);

//        System.out.println((12*18)/lcm);

//        System.out.println(reverseDigit(12221));

        // 5. Patterns
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for(int j=4; j>=0; j--){
            for(int i=0; i<j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for(int j=4; j>=0; j--){
            for(int i=0; i<j; i++){
                System.out.print(" ");
            }
            for(int i=4; i>=j; i--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for(int j=4; j>=0; j--){
            for(int i=0; i<j; i++){
                System.out.print(" ");
            }
            for(int i=4; i>=j; i--){
                System.out.print("*");
            }
            System.out.println();
        }


        // 40. Find sum and average of all elements in an array
        int[] arr40 = {1, 2, 3, 4, 5};
        int sum40 = Arrays.stream(arr40).sum(); //for sum
        double avg40 = (double) sum40 / arr40.length;
        System.out.println("40. Sum: " + sum40 + ", Avg: " + avg40);

        // 41. Find number of occurrences of an element in an array
        int[] arr41 = {1, 2, 3, 2, 4, 2, 5};
        int target41 = 2;
        long count41 = Arrays.stream(arr41).filter(x -> x == target41).count();
        System.out.println("41. Occurrences of " + target41 + ": " + count41);

        // 42. Find the maximum and minimum element in an array
        int[] arr42 = {10, 20, 5, 30, 15};
        int max42 = Arrays.stream(arr42).max().getAsInt();
        int min42 = Arrays.stream(arr42).min().getAsInt();
        System.out.println("42. Max: " + max42 + ", Min: " + min42);

        // 43. Check if the given array is sorted
        int[] arr43 = {1, 2, 3, 4, 5};
        boolean sorted43 = true;
        for (int i = 1; i < arr43.length; i++) {
            if (arr43[i] < arr43[i - 1]) {
                sorted43 = false;
                break;
            }
        }
        System.out.println("43. Is sorted? " + sorted43);

        // 44. Return a new array deleting a specific element
        int[] arr44 = {1, 2, 3, 4, 5};
        int delIndex44 = 2;
        int[] newArr44 = new int[arr44.length - 1];
        for (int i = 0, j = 0; i < arr44.length; i++) {
            if (i != delIndex44)
                newArr44[j++] = arr44[i];
        }
        System.out.println("44. " + Arrays.toString(newArr44));

        // 45. Reverse an array
        int[] arr45 = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr45.length - 1; i < j; i++, j--) {
            int temp = arr45[i];
            arr45[i] = arr45[j];
            arr45[j] = temp;
        }
        System.out.println("45. " + Arrays.toString(arr45));

        // 46. Check if the array is palindrome
        int[] arr46 = {1, 2, 3, 2, 1};
        boolean isPalindrome46 = true;
        for (int i = 0, j = arr46.length - 1; i < j; i++, j--) {
            if (arr46[i] != arr46[j]) {
                isPalindrome46 = false;
                break;
            }
        }
        System.out.println("46. Is palindrome? " + isPalindrome46);

        // 47. Merge two sorted arrays
        int[] arr47a = {1, 3, 5}, arr47b = {2, 4, 6};
        int[] merged47 = new int[arr47a.length + arr47b.length];
        int i47 = 0, j47 = 0, k47 = 0;
        while (i47 < arr47a.length && j47 < arr47b.length) {
            if (arr47a[i47] < arr47b[j47])
                merged47[k47++] = arr47a[i47++];
            else
                merged47[k47++] = arr47b[j47++];
        }
        while (i47 < arr47a.length)
            merged47[k47++] = arr47a[i47++];
        while (j47 < arr47b.length)
            merged47[k47++] = arr47b[j47++];
        System.out.println("47. " + Arrays.toString(merged47));

        // 48. Search an element in a 2-D array
        int[][] arr48 = {{1, 2}, {3, 4}, {5, 6}};
        int target48 = 4;
        boolean found48 = false;
        for (int[] row : arr48) {
            for (int x : row)
                if (x == target48) {
                    found48 = true;
                    break;
                }
        }
        System.out.println("48. Found? " + found48);

        // 49. Sum and average of all elements in a 2-D array
        int[][] arr49 = {{1, 2}, {3, 4}, {5, 6}};
        int sum49 = 0, count49 = 0;
        for (int[] row : arr49) 
            for (int x : row) { 
                sum49 += x; 
                count49++;
            }
        double avg49 = (double) sum49 / count49;
        System.out.println("49. Sum: " + sum49 + ", Avg: " + avg49);

        // 50. Find the sum of two diagonal elements
        int[][] arr50 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n50 = arr50.length, sum50 = 0;
        for (int i = 0; i < n50; i++) {
            sum50 += arr50[i][i] + arr50[i][n50 - i - 1];
        }
        if (n50 % 2 == 1) sum50 -= arr50[n50 / 2][n50 / 2];
        System.out.println("50. Sum of diagonals: " + sum50);

    }
}
