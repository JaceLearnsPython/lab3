public class OneLoop {

 public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9,10,10};
    int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
    int[] nums3 = {1,2,3,4,5,6,7,7,8,9,10,10};
    int[] nums4 = {1,1,3,4,5,6,7,8,9,10,10};
    int[] nums5 = {1,2,3,4,5,6,7,8,9,10};

    boolean test1 = foundMatch(nums);
    boolean test2 = foundMatch(nums2);
    boolean test3 = foundMatch(nums3);
    boolean test4 = foundMatch(nums4);
    boolean test5 = foundMatch(nums5);

    System.out.print(test1 + "\n"); 
    printArray(nums);
    System.out.println("\n");

    System.out.println(test2); 
    printArray(nums2);
    System.out.println("\n");

    System.out.println(test3); 
    printArray(nums3);
    System.out.println("\n");

    System.out.println(test4); 
    printArray(nums4);
    System.out.println("\n");

    System.out.println(test5); 
    printArray(nums5);
    System.out.println("\n");

    } // end main

 public static boolean foundMatch(int[] nums){

        int x;
        for(int i = 0; i < nums.length; i++){
                x = nums[i];
                for(int j = i + 1; j < nums.length; j++){

                if(x == nums[j]){
                return true;
                }
            }

        } // end loops

        return false;

    } // end found match method

 public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

} // end class

