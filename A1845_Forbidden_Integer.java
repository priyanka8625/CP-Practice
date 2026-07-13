import java.util.Scanner;

public class A1845_Forbidden_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();
            makeSum(n, k, x);
        }
        sc.close();
    }
    public static void makeSum(int n, int k, int x){
        if(x != 1){
            //print n 1s
            System.out.println("YES");
            System.out.println(n);
            for(int i=0; i<n; i++){
                System.out.print(1 + " ");
            }
        }else{
            if(n%2 == 0){
                if(k<2){
                    System.out.println("NO");
                    return;
                }
                //print only 2s
                System.out.println("YES");
                System.out.println(n/2);
                while(n != 0){
                    System.out.print(2 + " ");
                    n -= 2;
                }
            }else{
                if(k<3){
                    System.out.println("NO");
                    return;
                }
                //print all 2s and a 3 at last
                System.out.println("YES");
                System.out.println(n/2);
                for(int i=1; i<=(n-3)/2; i++){
                    System.out.print(2 + " ");
                }
                System.out.print(3);
            }
        }
        System.out.println();
    }
}
