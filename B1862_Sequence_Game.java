import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1862_Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0; i<n; i++){
                nums[i] = sc.nextInt();
            }
            List<Integer> aSeq = findSequence(nums, n);
            System.out.println(aSeq.size());
            for(int i=0; i<aSeq.size(); i++)
                System.out.print(aSeq.get(i)+" ");

            System.out.println();
        }
        sc.close();
    }
    public static List<Integer> findSequence(int[] nums, int n){
        List<Integer> res = new ArrayList<>();
        res.add(nums[0]);
        for(int i=1; i<n; i++){
            if(nums[i] < nums[i-1]){
                //doesn't follow the b seq, add the same number 2 times in res
                res.add(nums[i]);
                res.add(nums[i]);
            }else{
                res.add(nums[i]);
            }
        }
        return res;
    }
}
