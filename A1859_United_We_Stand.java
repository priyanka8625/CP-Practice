import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1859_United_We_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            findArrays(arr, n);
        }
        sc.close();
    }
    public static void findArrays(int[] arr, int n){
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        //find the max ele from array
        int maxEle = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxEle = Math.max(maxEle, arr[i]);
        }

        //put the max ele in c becuz max can't be a divisor of an element
        //and put the other eles in array b(even if they can divide each other, it won't matter)
        for(int ele : arr){
            if(ele == maxEle){
                c.add(ele);
            }else{
                b.add(ele);
            }
        }

        //print the results
        if(b.size() == 0){
            System.out.println("-1");
            return;
        }

        System.out.println(b.size() + " " + c.size());
        for(int ele : b){
            System.out.print(ele + " ");
        }
        System.out.println();
        for(int ele : c){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
