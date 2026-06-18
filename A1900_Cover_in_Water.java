import java.util.Scanner;

public class A1900_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int n = sc.nextInt();
            String s = sc.next();
            //now we have no of cells and the blocked and empty cell in string s
            int min1Actions = findMin1Actions(n, s);
            System.out.println(min1Actions);
        }
    }
    public static int findMin1Actions(int n, String s){
        //count the no of consecutive empty cells
        int count = 0;
        for(int i=0; i<n; i++){
            //count consecutive empty cells
            while(i<n && s.charAt(i) == '.'){
                count++;
                i++;
            }
            //if found the 3 or more empty cells
            if(count >= 3){
                break;
            }
            //otherwise (count < 3), go for next batch of empty cells
            count = 0;
        }
        //if we found >=3 no of consecutive cells, we can fill all the cells using only 2 no of 1 actions
        if(count >= 3){
            return 2;
        }

        //and if the count < 3, this means we need to fill all the empty cells using action 1 only
        // we can't use action 2 or fill a cell when i-1 & i+1 are filled
        count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '.')
                count++;
        }
        return count;
    }
}
