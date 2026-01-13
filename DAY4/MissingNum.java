package DAY4;

public class MissingNum {
    public static void main(String[] args) {
        int nums[]={3,0,1};
          int n= nums.length;
        int expectedsum= n*(n+1)/2;
        int numsSum=0;
        for(int i=0;i<nums.length;i++){
            numsSum = numsSum + nums[i]; 
        }
         int missing = expectedsum - numsSum;
          System.out.println(missing);
    }
}
