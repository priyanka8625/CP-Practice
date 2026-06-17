import java.util.Scanner;

public class A_Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            //now we have the k which is max subarr len that we can reverse in an array and the array itself
            boolean res = checkIfSortable(arr, k, n);

            System.out.println(res? "YES" : "NO");
        }
    }
    public static boolean checkIfSortable(int[] arr, int k, int n){
        if(k > 1){
            //we can just simply swap the adj elemennts becuz the subarr leng to reverse is atmost k
            //which is simply like using bubble sort algo
            return true;
        }else if(k == 1){
            //if k is 1 then we can't swap or reverse the elements of arr
            //hence we need to check if the arr is already srted or not to get the result
            for(int i=0; i<n-1; i++){
                if(arr[i] > arr[i+1]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
