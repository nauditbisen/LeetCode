package DAY6;

import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {

        int arr[] = {11,23,45,11,23};
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {

            if(set.contains(arr[i])) {
                found = true;
                break;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(found);
    }
}
