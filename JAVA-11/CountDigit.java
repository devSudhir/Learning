import java.util.Scanner;
class CountDIgit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countDigit(sc.nextInt(), 0));
        sc.close();
    }

    public static int countDigit(int number, int count){
        System.err.println("Number " + number 
        + " count : " + count)  ;
        if (number < 10)
            return count + 1;
        number /= 10;
        return countDigit(number,++count);
    }
}