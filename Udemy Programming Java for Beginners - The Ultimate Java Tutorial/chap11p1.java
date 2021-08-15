import java.util.ArrayList;
public class chap11p1 {
    public static void main(String[] args){
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i=0; i<100; i++){
        nums.add(i);
    }
    extracted(nums);
    }

    private static void extracted(ArrayList<Integer> nums) {
        for(int y=0; y<nums.size();y++){
            if (nums.get(y)%2==0){
                System.out.println("Even numbers are "+nums.get(y));
            }
        }
    }
    
}
