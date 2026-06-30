import java.util.Scanner;

public class A1877_Goals_of_Victory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n-1; i++){
                arr[i] = sc.nextInt();
            }

            //find efficiency of missing team
            int efficiency = missingValue(arr, n);
            System.out.println(efficiency);
        }
        sc.close();
    }
    public static int missingValue(int[] arr, int n){
        //the total of all 'n' efficiencies is always going to be 0
        //hence the missing efficiency will be just 0-'sum of n-1 efficiencies'
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        } 
        return -sum;
    }
}