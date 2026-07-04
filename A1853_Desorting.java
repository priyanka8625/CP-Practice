import java.util.Scanner;

public class A1853_Desorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int count = desort(arr, n);
            System.out.println(count);
        }
        sc.close();
    }
    public static int desort(int[] arr, int n){
        int minDiff = Integer.MAX_VALUE, i = -1, j = -1;
        for(int k=0; k<n-1; k++){
            if(arr[k+1] < arr[k]){
                return 0;
            }else{
                if(minDiff > arr[k+1]-arr[k]){
                    minDiff = arr[k+1]-arr[k];
                    i = k;
                    j = k+1;
                }
            }
        }

        //find the min operations for desorting
        int mid = (arr[i]+arr[j])/2;
        int count = (mid - arr[i])+1;
        return count;
    }
}