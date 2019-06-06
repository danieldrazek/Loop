/*
 * Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
 * Przerób pętlę z zadania trzeciego na pętlę while.
 */
package loop;

public class LoopEx4 {
    
    public static void main(String[] args) {
        
        
        System.out.println("Printing on the screen numbers from -10 to 40 (Loop WHILE): ");
        int i = -10;
        while (i < 40) {            
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
