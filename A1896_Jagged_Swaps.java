import java.util.Scanner;

public class A1896_Jagged_Swaps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean res = canBeSorted(arr, n);
            System.out.println(res? "YES" : "NO");
        }
        sc.close();
    }
    public static boolean canBeSorted(int[] arr, int n){
        //first check if the array is sorted
        boolean flag = true;
        int max = arr[n-1], maxIndex = n-1, min = arr[n-1], minIndex = n-1;
        for(int i=0; i<n-1; i++){
            if(arr[i] >= arr[i+1]){
                flag = false;
            }
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        if(flag){
            return true;
        }

        //array is not sorted
        //we have only one condition when the arr can never be sorted
        //1. the largest element is at index 0
        //2. the smallest index is not at index 0
        //if any one of these condition are satisfied, the array cannot be sorted
        if(maxIndex == 0 || minIndex != 0){
            return false;
        }
        return true;
    }
}