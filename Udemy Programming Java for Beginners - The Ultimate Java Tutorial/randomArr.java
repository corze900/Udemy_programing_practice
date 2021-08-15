import java.util.ArrayList;
import java.util.Random;
public class randomArr {
    public static void main(String[] args){
    
    ArrayList<Integer> nums = new ArrayList<Integer>();

    Random rand = new Random(System.currentTimeMillis());

    for(int i=0; i<100;i++){
        nums.add(rand.nextInt(1001));
    }
    //printL(nums);
    //System.out.println(nums.toString());
    System.out.println(findMAX(nums));
    
        
    }
    static void printL(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"\t");
        }
    }
    static int findMAX(ArrayList<Integer> arr){
        int temp=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) > arr.get(temp)){
                temp = i;
            }
        }
        return arr.get(temp);
    }
    
}
