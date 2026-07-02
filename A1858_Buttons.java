import java.util.Scanner;

public class A1858_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            boolean res = whoWins(a, b, c);
            System.out.println(res? "First" : "Second");
        }
        sc.close();
    }
    public static boolean whoWins(int a, int b, int c){
        //numbers a and b will decide who wins
        if(a > b){
            return true;
        }
        if(b > a){
            return false;
        }
        //if both a and b are equal, then c decides who wins
        if(c%2 == 1){
            //anna wins
            return true;
        }
        //else katie wins
        return false;
    }
}
