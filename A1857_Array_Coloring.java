import java.util.Scanner;

public class A1857_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean res = colorArray(arr, n);
            System.out.println(res? "Yes" : "No");
        }
        sc.close();
    }
    public static boolean colorArray(int[] arr, int n){
        //count the freq of odd numbers
        int count = 0;
        for(int ele : arr){
            if(ele%2 != 0){
                count++;
            }
        }
        //if the freq of odd numbers is even, then we can always color array to have same parity
        if(count%2 == 0){
            return true;
        }
        //otw, it's not possible to color array in 2 colors such that they have same sum parity
        return false;
    }
}
