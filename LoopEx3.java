
package loop;

public class LoopEx3 {
    
    public static void main(String[] args) {
        
        System.out.println("Printing on the screen numbers from -10 to 40 (Loop FOR): ");
        
        for (int i = -10; i < 41; i++) {
            if (i % 2 == 0) {
                continue;
            } 
            System.out.println(i);
        }
        
    }
    
}
