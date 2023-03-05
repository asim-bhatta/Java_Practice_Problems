//Write a program to print all the elements of Fibonacci series.
package CoreJava;

public class Fibonnacci {
    public static void main(String[] args) {
        int n1=0, n2=1, n3, count=10;
        System.out.print(n1+" "+n2+" ");
        for (int k = 2; k < count; k++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(n3+" ");
        }
    }
}
