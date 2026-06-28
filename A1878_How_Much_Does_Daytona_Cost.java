import java.util.Scanner;

public class A1878_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean res = checkSubsegment(arr, n, k);
            System.out.println(res? "YES":"NO");
        }
        sc.close();
    }
    public static boolean checkSubsegment(int[] arr, int n, int k){
        //if the element k is present in arr, it will be YES becuz a subsegment can be of any size including 1 as well
        for(int ele : arr){
            if(ele == k){
                return true;
            }
        }
        //if the ele is not present in arr, it means that there is no subsegment with k as most common element
        return false;
    }
}
