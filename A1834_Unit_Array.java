import java.util.Scanner;

public class A1834_Unit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(makeArrayGood(arr, n));
        }
        sc.close();
    }
    public static int makeArrayGood(int[] arr, int n){
        int negCount=0, posCount=0;
        for(int ele : arr){
            if(ele == 1){
                posCount++;
            }else{
                negCount++;
            }
        }

        //make the poscount >= negCount but make sure that negCount shouldn't be odd
        int ops = 0;
        while(posCount < negCount || negCount%2 == 1){
            ops++;
            posCount++;
            negCount--;
        }

        return ops;
    }
}
