import java.util.HashMap;
import java.util.Scanner;

public class A1890_Doremys_Pant_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean res = isArrayGood(arr, n);
            System.out.println(res? "YES" : "NO");
        }
        sc.close();
    }
    public static boolean isArrayGood(int[] arr, int n){
        //1. count the no of distinct elements in the array
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i : arr){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }

        int count = mp.size();

        //2. if the count of distinct elements is >2, the array can never be made good 
        if(count > 2){
            return false;
        }

        // 3. if the distinct count is 1, the array is already good
        if(count == 1)
            return true;

        //4. if the count == 2, then check the freq of these 2 elements
        //if they differ by one, the array can be made good, otherwise no
        int[] freqs = new int[2];
        int i=0;
        for(int value : mp.values()){
            freqs[i] = value;
            i++;
        }
        if(Math.abs(freqs[0]-freqs[1]) > 1){
            return false;
        }

        return true;
    }
}