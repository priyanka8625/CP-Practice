import java.util.Scanner;

public class A1899_Game_with_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            boolean res = whoWins(n);
            System.out.println(res? "First" : "Second");
        }
        sc.close();
    }
    public static boolean whoWins(int n){
        //find the sum of the digits of n
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        //if the sum is not divisible by 3, vanya wins 
        if(sum % 3 != 0){
            return true;
        }
        //else, vova wins
        return false;
    }
}
