import java.util.Scanner;
class IsPalinDrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(reverse(number, 0));
        System.out.println(number == reverse(number, 0));
        sc.close();
    }

    public static int reverse(int number, int reverseNumber){
        System.out.println(number + " " + reverseNumber);
        if(number < 10)
            return reverseNumber * 10 + number;
        int reminder = number % 10;
        number /= 10;
        reverseNumber = reverseNumber * 10 + reminder;
        return reverse(number , reverseNumber);
    }
}