import java.util.Scanner;

public class A1873_Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String[] grid = new String[10];
            for(int i=0; i<10; i++){
                grid[i] = sc.nextLine();
            }

            int score = countScore(grid);
            System.out.println(score);
        }
        sc.close();
    }
    public static int countScore(String[] grid){
        int top=0, bottom=9, left=0, right=9, sum = 0, score = 1;
        while(top<=bottom && left<=right){
            //loop all the 4 directions 
            int count = 0;

            //count top row's targets
            for(int i=left; i<=right; i++){
                if(grid[top].charAt(i) == 'X'){
                    count++;
                }
            }
            top++;
            //count right side targets
            for(int i=top; i<=bottom; i++){
                if(grid[i].charAt(right) == 'X'){
                    count++;
                }
            }
            right--;
            //count bottom targets
            for(int i=right; i>=left; i--){
                if(grid[bottom].charAt(i) == 'X'){
                    count++;
                }
            }
            bottom--;
            //count left targets
            for(int i=bottom; i>=top; i--){
                if(grid[i].charAt(left) == 'X'){
                    count++;
                }
            }
            left++;

            //add the count of targets * their score value into final sum
            sum +=(count * score);
            score++;
        }
        return sum;
    }
}
