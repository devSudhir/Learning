import java.util.Scanner;
public class NumberOfTrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(calcualteZerosAtEnd(Factorial.factorial(sc.nextInt()), 0));
        //System.out.println(calcualteZerosAtEndByFactor5(sc.nextInt(), 0));
        System.out.println(calculateByFormula(sc.nextInt(), 5));
        sc.close();
    }
    public static int calcualteZerosAtEnd(int number, int count){
        System.out.println(number + " " + count);
        if(number < 10)
            return count;

        if(number % 10 == 0)
            count ++;
        else 
            return count;

        number /= 10;
        return calcualteZerosAtEnd(number , count);
    }

    public static int calcualteZerosAtEndByFactor5(int number, int count){
        System.out.println(number + " " + count);
        if(number < 5)
            return count;
        count += calculate5sInNumber(number, 0);
        return calcualteZerosAtEndByFactor5(--number , count);
    }

    public static int calculate5sInNumber(int num, int count){
        if(num < 5)
            return count;

        if(num % 5 == 0){
            count ++;
            num /= 5;
            return calculate5sInNumber(num, count);
        }else 
            return count;

    }

    public static int calculateByFormula(int number, int start){
        if(number < start )
            return 0;
        else {
            int count = number / start;
            start *= 5;
            return count + calculateByFormula(number,start);
        }
        // (n/5) + (n/25) + (n/125) .... 
    }

}
