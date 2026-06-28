import java.util.Scanner;

public class A1881_Dont_Try_to_Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n= sc.nextInt(), m =  sc.nextInt();
            String x = sc.next(), s = sc.next();
            int minRepeatCount = getMinRepeatCount(x, s, n, m);
            System.out.println(minRepeatCount);
        }
        sc.close();
    }
    public static int getMinRepeatCount(String x, String s, int n, int m){
        //repeat x 5 times, becuz the problem says that the length of s*x is neger going to be > 25
        //hence even if s is of length 25 and x of 1, repeating x upto 5 times will give us the string which will have s as the substring
        if(x.indexOf(s) != -1){
            //no need of repeating
            return 0;
        }

        String xi = x;
        for(int i=1; i<=5; i++){
            xi += xi;
            if(xi.indexOf(s) != -1){
                return i;
            }
        }
        //if we didnt find the s in x after 5 repeatitions, then return -1
        return -1;
    }
}