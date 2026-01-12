package DAY3;
public class ReverseNum {
    public static void main(String[] args) {
        int nums=(123);
        int rev =0;
        int digit;
         while(nums!=0){
            digit=nums%10;
            rev=rev*10+digit;
            nums=nums/10;
         }
         System.out.println(rev);
    }
    
}
