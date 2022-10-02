import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Factorial of the give number is : " + factorial(sc.nextInt(), 1));
        System.out.println("Factorial of the give number is : " + factorial(sc.nextLong()));
        sc.close();
    }
    public static int factorial(int number, int result){
        System.out.println( number + " " + result);
        if(number <= 1)
            return result;
        result *= number;
        return factorial(--number, result);
    }

    public static long factorial(long number){
        System.out.println(number);
        if(number <= 1)
            return 1;
        return number * factorial(--number);
    }
    
}
