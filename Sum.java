//Write a Java program to print the sum of two numbers.
package CoreJava;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
    }
}
