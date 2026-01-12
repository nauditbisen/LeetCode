package DAY3;

public class SecoundLargest {
    public static void main(String[] args) {
        int arr[]={34,45,245,2,244};
        int largest=arr[0];
        int SecoundLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>SecoundLargest && arr[i]<largest){
                SecoundLargest=arr[i];
            }
        }
        System.out.println(SecoundLargest);
        
        
    }
}
