import java.util.Scanner;
// This is the Calculator class that should already be defined in the stub code
abstract class Calculator {
    abstract int add(int a, int b);
}

// This is the Adder class you need to implement
class Adder extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b;
    }
}

// This should be similar to the solution class mentioned in the problem
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
        
        scan.close();
    }
}