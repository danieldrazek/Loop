
package loop;

public class LoopEx6 {
    
    public static int sumArray2D(int[][] numbers){
        
        int sum = 0;
        for(int[] otherNumber : numbers){
            for(int number : otherNumber){
                sum += number;
            }
        }
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        int[][] numbers = {
            {2, 5}, 
            {7, 34}, 
            {65, 80, 56}
        };
        
        System.out.println("The sum of array's elements is: " + sumArray2D(numbers));
    }
    
}
