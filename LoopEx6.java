/*
 * Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
 * Przerób funkcję z zadania piątego tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][].
 */
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
        System.out.println("Print content of table numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The sum of array's elements is: " + sumArray2D(numbers));
    }
    
}
