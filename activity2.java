package Activities;
import java.util.*;

public class activity2 {
    public static void main(String[] args) {
        int[] numArr = {10, 77, 77, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        //Set constants
        int searchNum = 77;
        int fixedSum = 154;
        //boolean res = result(numArr, searchNum, fixedSum);
         result(numArr, searchNum, fixedSum);
       
    }
   /*public static boolean result(int[] numArr, int searchNum, int fixedSum) {
        int temp_sum = 0;
        
        for (int number : numArr) {
            
            if (number == searchNum) {
               
                temp_sum += searchNum;
            }

            //Sum should not be more than 154
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }*/
    public static void result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        
        for (int number : numbers) {
            
            if (number == searchNum) {
               
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
      if (temp_sum == fixedSum) {
        System.out.println("Result: " +temp_sum);
      }  
       
    }

}
  
        
    


