import java.util.Scanner;

public class A1901_Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int n = sc.nextInt(), x = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            //find the min possible gas volume to fill in the car to move from 0 to x and back to 0
            int minFuel = findMinFuel(arr, n, x);

            System.out.println(minFuel);
        }
    }
    public static int findMinFuel(int[] arr, int n, int x){
        //find the max gap between the array points
        int maxGap = 0;
        //consider points 0 and x 
        maxGap = Math.max(arr[0] - 0, x - arr[n-1]);
        for(int i=0; i<n-1; i++){
            maxGap = Math.max(maxGap, arr[i+1] - arr[i]);
        }
        //then find the fuel needed to reach the last station from 2nd last station and then again coming back to the 2nd last station
        int lastStationFuel = (x - arr[n-1]) * 2;

        //just return the max between these two values as this is the min fuel we'll need to move back n forth between stations
        return Math.max(maxGap, lastStationFuel);
    }
}
