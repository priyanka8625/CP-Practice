import java.util.Scanner;

public class A1866_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int minOps = countOperations(arr, n);
        System.out.println(minOps);
        sc.close();
    }
    public static int countOperations(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        for(int ele : arr){
            min = Math.min(min, Math.abs(ele));
        }
        return min;
    }
}
