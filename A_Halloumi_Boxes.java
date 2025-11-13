import java.util.Scanner;

public class Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr =new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            String ans = solve(n, k, arr);
            System.out.println(ans);
        }
    }   
    public static String solve(int n, int k, int[] arr){
        if(k == 1){
            //which means the subarr len for reversal is 1 
            //so, we've to check if the arr is already sorted, then only return yes
            if(isSorted(arr, n))
                return "YES";
            else    
                return "NO";
        }
        //if k > 1, we can always "always" make the array sorted by just swapping adj eles (bubble sort) 
        //cuz any no of reverses of subarrays are allowed and subarray can be of any len bet 1 and k
        return "YES";
    }
    public static boolean isSorted(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
