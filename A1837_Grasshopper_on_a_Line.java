import java.util.Scanner;

public class A1837_Grasshopper_on_a_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int x = sc.nextInt(), k = sc.nextInt();
            reachX(x, k);
        }
        sc.close();
    }
    public static void reachX(int x, int k){
        if(x % k != 0){
            System.out.println(1);
            System.out.println(x);
        }else{
            System.out.println(2);
            System.out.println(x-1 + " " + 1);
        }
    }
}
