package DAY3;

public class FindMinimum {
    public static void main(String[] args) {
        int arr[]={423,450,354,478};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
