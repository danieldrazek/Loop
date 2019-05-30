
package loop;

public class LoopEx5 {
    
    private static int sumArray(int[] numbers) {
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
//            sum = sum + number[0] + + number[1] + number[2] + number[3] + number[4] + number[5] + ... + number[n];
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        
        int[] numbers = {2, 5, 7, 34, 65, 80, 56};
        
        System.out.println("Print the contest of the Array: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
        
        System.out.println("The sum elements of array is: " + sumArray(numbers)); 
    }  
}
