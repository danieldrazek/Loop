
package loop;

public class LoopEx1 {
    
    
    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 6, 8, 56, 34};
        
        System.out.println("Counting down 20 to 10 loop FOR: ");
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }
        
        System.out.println("Counting down 20 to 10 loop WHILE: ");
        int i = 20;
        while (i > 9) {            
            System.out.println(i);
            i--;
        }
        
        System.out.println("Printing elements of array loop FOR: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
        
        System.out.println("Printing elements of array loop ForEach: ");
        for (int number : numbers) {
                System.out.println(number);
            }
        
        
    }
    
}

