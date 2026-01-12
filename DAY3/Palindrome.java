package DAY3;

public class Palindrome {
    public static void main(String[] args) {
        int nums=(121);
        int rev=0;
        int digit;

        while(nums>0){  // while(nums!=0  also works but in leetcode not passing test cases)
            digit=nums%10;
            rev=rev*10+digit;
            nums=nums/10;

            }
             if(nums==rev){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("not Palindrome");
            }
       
    }
    
}
